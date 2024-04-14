import java.util.*;
import java.io.*;

public class TallyVotes2 {
  public static void main(String[] args) throws FileNotFoundException {
    Scanner keyboard = new Scanner(System.in);
    while (true) {
      System.out.println("What file contains the ballot information? (type 'quit' to end the program)");
      String fileName = keyboard.nextLine();
      if (fileName.equalsIgnoreCase("quit")) {
        break;
      }
      Scanner input = new Scanner(new File(fileName));
      ArrayList<Ballot> ballots = readFile(input);
      int originalNumberOfBallots = ballots.size();
      int round = 1;
      boolean done = false;
      while (!done && !ballots.isEmpty()) {
        System.out.println("Round #" + round);
        Collections.sort(ballots);
        done = oneRound(ballots, originalNumberOfBallots);
        System.out.println("------------------------------");
        round++;
      }
      input.close();
    }
    keyboard.close();
  }

  public static ArrayList<Ballot> readFile(Scanner input) {
    ArrayList<Ballot> result = new ArrayList<>();
    while (input.hasNextLine()) {
      String text = input.nextLine();
      result.add(new Ballot(text.split("\t")));
    }
    return result;
  }

  public static boolean oneRound(ArrayList<Ballot> ballots, int originalNumberOfBallots) {
    String top = null;
    String bottom = null;
    int topCount = 0;
    int bottomCount = ballots.size() + 1;

    // Remove empty ballots
    Iterator<Ballot> iter = ballots.iterator();
    while (iter.hasNext()) {
      Ballot ballot = iter.next();
      if (ballot.isEmpty()) {
        iter.remove();
      }
    }

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
    } else if (topCount > originalNumberOfBallots / 2.0) {
      System.out.println("Winner is " + top);
      return true;
    } else {
      System.out.println("No winner, eliminating " + bottom);
      eliminate(bottom, ballots);
      return false;
    }
  }

  public static int processVotes(String name, int index, ArrayList<Ballot> ballots) {
    int count = 0;
    while (index < ballots.size() && !ballots.get(index).isEmpty() &&
        ballots.get(index).getCandidate().equals(name)) {
      index++;
      count++;
    }
    double percent = 100.0 * count / ballots.size();
    System.out.printf("%d votes for %s (%4.1f%%)\n", count,
        name, percent);
    return count;
  }

  public static void eliminate(String candidate, ArrayList<Ballot> ballots) {
    Iterator<Ballot> iter = ballots.iterator();
    while (iter.hasNext()) {
      Ballot ballot = iter.next();
      ballot.eliminate(candidate);
    }
  }
}
