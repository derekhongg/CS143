/* 
Derek Hong
CS143
*/
import java.util.*;
import java.io.*;

public class TallyVotes2 {
  public static void main(String[] args) throws FileNotFoundException {
    Scanner keyboard = new Scanner(System.in);
    while (true) {
      System.out.println("What file contains the ballot information? (Type 'quit' to end)");
      String fileName = keyboard.nextLine();
      if (fileName.equals("quit")) {
        System.exit(0);
      }
      try {
        Scanner input = new Scanner(new File(fileName));
        ArrayList<Ballot> ballots = readFile(input);
        int originalBallotCount = ballots.size(); // Store the original number of ballots
        int round = 1;
        boolean done = false;
        while (!done) {
          System.out.println("Round #" + round);
          Collections.sort(ballots);
          done = oneRound(ballots, originalBallotCount);
          System.out.println("------------------------------");
          round++;
        }
      } catch (FileNotFoundException e) {
        System.out.println("File not found. Please try again.");
      }
    }
  }

  public static ArrayList<Ballot> readFile(Scanner input) {
    ArrayList<Ballot> result = new ArrayList<>();
    while (input.hasNextLine()) {
      String text = input.nextLine();
      if (!text.isEmpty()) { // Ignore blank lines
        result.add(new Ballot(text.split("\t")));
      }
    }
    return result;
  }

  public static boolean oneRound(ArrayList<Ballot> ballots, int originalNumBallots) {
    String top = null;
    String bottom = null;
    int topCount = 0;
    int bottomCount = originalNumBallots;
    int index = 0;
    while (index < ballots.size()) {
      String next = ballots.get(index).getCandidate();
      int count = processVotes(next, index, ballots);
      if (count > topCount) {
        topCount = count;
        top = next;
      }
      if (count < bottomCount) {
        bottomCount = count;
        bottom = next;
      }
      index += count;
    }
    if (topCount == bottomCount) {
      System.out.println("Election has no winner");
      return true;
    } else if (topCount > (originalNumBallots) / 2.0) {
      System.out.println("Winner is " + top);
      return true;
    } else {
      System.out.println("no winner, eliminating " + bottom);
      eliminate(bottom, ballots);
      return false;
    }
  }

  public static int processVotes(String name, int index, ArrayList<Ballot> ballots) {
    int count = 0;
    while (index < ballots.size() && ballots.get(index).getCandidate().equals(name)) {
      index++;
      count++;
    }
    double percent = 100.0 * count / ballots.size();
    System.out.printf("%d votes for %s (%4.1f%%)\n", count, name, percent);
    return count;
  }

  public static void eliminate(String candidate, ArrayList<Ballot> ballots) {
    for (int i = 0; i < ballots.size(); i++) {
      Ballot b = ballots.get(i);
      b.eliminate(candidate);
      if (b.isEmpty()) {
        ballots.remove(i);
        i--;
      }
    }
  }
}