// class for storing one voter's preferences

import java.util.*;

public class Ballot implements Comparable<Ballot> {
  private ArrayList<String> preferences;

  // constructs a ballot with the given candidate names in order
  public Ballot(String[] names) {
    preferences = new ArrayList<>();
    for (String next : names) {
      if(!next.isEmpty()) {
      preferences.add(next);
      }
    }
  }

    //adding isEmpty() method
    public boolean isEmpty() {
      return preferences.isEmpty();
    }
  // returns the current first choice for this ballot or "none" if there are
  // no longer any choices for this ballot
  public String getCandidate() {
    if(preferences.isEmpty()) {
      return "none";
    } else {
      return preferences.get(0);
    }
  }

  // eliminates the given candidate from consideration
  public void eliminate(String name) {
    preferences.remove(name);
  }

  // compares this ballot to another, putting them in order
  // alphabetically by their first choice candidate
  public int compareTo(Ballot other) {
    String thisCandidate = getCandidate();
    String otherCandidate = other.getCandidate();
    if("none".equals(thisCandidate)) {
      return 1;
    } else if ("none".equals(otherCandidate)) {
      return -1;
    }
    return thisCandidate.compareTo(otherCandidate);
  }
}