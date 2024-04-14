import java.util.ArrayList;

public class Ballot implements Comparable<Ballot> {
  private ArrayList<String> preferences;

  public Ballot(String[] names) {
    preferences = new ArrayList<>();
    for (String next : names) {
      if (!next.isEmpty()) { // Add this check to avoid adding empty preferences
        preferences.add(next);
      }
    }
  }

  public boolean isEmpty() {
    return preferences.isEmpty();
  }

  public String getCandidate() {
    if (isEmpty()) {
      return "none";
    } else {
      return preferences.get(0);
    }
  }

  public void eliminate(String name) {
    preferences.remove(name);
  }

  public int compareTo(Ballot other) {
    String thisCandidate = getCandidate();
    String otherCandidate = other.getCandidate();
    if (thisCandidate.equals("none")) {
      return 1;
    } else if (otherCandidate.equals("none")) {
      return -1;
    }
    return thisCandidate.compareTo(otherCandidate);
  }
}
