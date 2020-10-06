package cse360assignment02;

/**
 * @author Franklin Paul
 *
 */

public class AddingMachine {
  private int total;
  private String history;
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    history = "0";
  }
  
  //returns total
  public int getTotal () {
    return total;
  }
  
  // adds the value to the total and concatenates " + number" to the history
  public void add (int value) {
	  total = total + value;
	  history = history + " + " + value;
  }

  // subtracts the value from the total and concatenates " - number" to the history
  public void subtract (int value) {
	  total = total - value;
	  history = history + " - " + value;
  }

  // returns the history 
  public String toString () {
    return history;
  }

  // initializes the total and history variables to their default
  public void clear() {
	  total = 0;
	  history = "0";
  }
}