import java.util.*;

public class Ballot implements Comparable<Ballot> {
  private ArrayList<String> preferences;

  public Ballot(String[] names) {
    preferences = new ArrayList<>();
    for (String next : names) {
      preferences.add(next);
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
    return getCandidate().compareTo(other.getCandidate());
  }
}
