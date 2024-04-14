import java.util.*;
import java.io.*;

public class TallyVotes2 {
  public static void main(String[] args) throws FileNotFoundException {
    Scanner keyboard = new Scanner(System.in);
    String fileName;

    do {
      System.out.println("What file contains the ballot information? (type 'quit' to exit)");
      fileName = keyboard.nextLine();
      if (!fileName.equalsIgnoreCase("quit")) {
        Scanner input = new Scanner(new File(fileName));
        ArrayList<Ballot> ballots = readFile(input);
        int originalNumberOfBallots = ballots.size(); // Store original number of ballots
        int round = 1;
        boolean done = false;

        while (!done && !ballots.isEmpty()) { // Check if ballots list is not empty
          System.out.println("Round #" + round);
          Collections.sort(ballots);
          done = oneRound(ballots, originalNumberOfBallots);
          System.out.println("------------------------------");
          round++;
        }
        input.close(); // Close file scanner
      }
    } while (!fileName.equalsIgnoreCase("quit"));

    keyboard.close(); // Close keyboard scanner
  }

  public static ArrayList<Ballot> readFile(Scanner input) {
    ArrayList<Ballot> result = new ArrayList<>();
    while (input.hasNextLine()) {
      String text = input.nextLine().trim();
      if (!text.isEmpty()) { // Ignore blank lines
        result.add(new Ballot(text.split("\t")));
      }
    }
    return result;
  }

  public static boolean oneRound(ArrayList<Ballot> ballots, int originalNumberOfBallots) {
    String top = null;
    int topCount = 0;

    // Use TreeMap to keep track of votes for each candidate
    TreeMap<String, Integer> voteCounts = new TreeMap<>();

    // Count votes for each candidate
    for (Ballot ballot : ballots) {
      String candidate = ballot.getCandidate();
      if (!candidate.equals("none")) {
        voteCounts.put(candidate, voteCounts.getOrDefault(candidate, 0) + 1);
      }
    }

    // Find top candidate and candidate with the lowest votes
    String bottom = voteCounts.isEmpty() ? null : voteCounts.firstKey();
    for (String candidate : voteCounts.keySet()) {
      int count = voteCounts.get(candidate);
      if (count > topCount) {
        topCount = count;
        top = candidate;
      }
      if (count < voteCounts.get(bottom)) {
        bottom = candidate;
      }
      double percent = 100.0 * count / originalNumberOfBallots;
      System.out.printf("%d votes for %s (%4.1f%%)\n", count, candidate, percent);
    }

    // Check for a winner or eliminate the bottom candidate
    if (topCount > originalNumberOfBallots / 2) {
      System.out.println("Winner is " + top);
      return true;
    } else if (!voteCounts.isEmpty()) {
      System.out.println("No winner, eliminating " + bottom);
      eliminate(bottom, ballots);
    }
    return false;
  }

  public static void eliminate(String candidate, ArrayList<Ballot> ballots) {
    Iterator<Ballot> iter = ballots.iterator();
    while (iter.hasNext()) {
      Ballot ballot = iter.next();
      ballot.eliminate(candidate);
    }
  }
}
