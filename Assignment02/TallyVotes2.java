// Program to perform ranked choice voting algorithm
// using a data file of voting preferences.
// This file should be *almost* identical to the code explained in the book
// Lines have been added to main to ask the user for the file to read

import java.util.*;
import java.io.*;

public class TallyVotes2 {
  public static void main(String[] args) throws FileNotFoundException {
    Scanner keyboard = new Scanner(System.in);
    String fileName;
    while (true) {
      System.out.println("What file contains the ballot information? (type 'quit' to exit)");
      fileName = keyboard.nextLine();
      if (fileName.equalsIgnoreCase("quit")) {
        break;
      }
      Scanner input = new Scanner(new File(fileName));
      ArrayList<Ballot> ballots = readFile(input);
      int originalBallotsCount = ballots.size(); // Store the original number of ballots
      int round = 1;
      boolean done = false;
      while (!done) {
        System.out.println("Round #" + round);
        Collections.sort(ballots);
        done = oneRound(ballots, originalBallotsCount);
        System.out.println("------------------------------");
        round++;
      }
    }
  }

  // Reads a data file of voter preferences, returning a list
  // of the resulting ballots. Candidate names are listed in
  // order of preference with tabs separating choices.
  public static ArrayList<Ballot> readFile(Scanner input) {
    ArrayList<Ballot> result = new ArrayList<>();
    while (input.hasNextLine()) {
      String text = input.nextLine().trim();
      if (!text.isEmpty()) { // Ignore blank lines
        result.add(new Ballot(text.split("\\s+"))); // Split on whitespace
      }
    }
    return result;
  }

  // Performs one round of ranked choice voting. The candidate
  // with the lowest vote total is eliminated until some
  // candidate gets a majority or until we reach a tie between
  // only two candidates. Assumes the list is in order by
  // candidate name.
  public static boolean oneRound(ArrayList<Ballot> ballots, int originalBallotsCount) {
    String top = null;
    String bottom = null;
    int topCount = 0;
    int bottomCount = originalBallotsCount + 1;
    int index = 0;
    while (index < ballots.size()) {
      String next = ballots.get(index).getCandidate();
      if ("none".equals(next)) {
        index++;
        continue; // Skip "none" entries
      }
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
    } else if (topCount > originalBallotsCount / 2) {
      System.out.println("Winner is " + top);
      return true;
    } else {
      System.out.println("no winner, eliminating " + bottom);
      eliminate(bottom, ballots);
      return false;
    }
  }

  // Counts and reports the votes for the next candidate
  // starting at the given index in the ballots list.
  public static int processVotes(String name, int index, ArrayList<Ballot> ballots) {
    int count = 0;
    while (index < ballots.size() && name.equals(ballots.get(index).getCandidate())) {
      count++;
      index++;
    }
    double percent = 100.0 * count / ballots.size();
    System.out.printf("%d votes for %s (%4.1f%%)\n", count, name, percent);
    return count;
  }

  // Eliminates the given candidate from all ballots.
  public static void eliminate(String candidate, ArrayList<Ballot> ballots) {
    Iterator<Ballot> itr = ballots.iterator();
    while (itr.hasNext()) {
      Ballot ballot = itr.next();
      ballot.eliminate(candidate);
      if (ballot.isEmpty()) { // Check if the ballot is empty after elimination
        itr.remove(); // Remove empty ballots
      }
    }
  }
}