package edu.gatech.oad.antlab.person;


/**
 *  A simple class for person 1
 *  returns their name and a
 *  modified string 
 *  
 *  @author Bob
 *  @version 1.1
 */
public class Person1 {
  /** Holds the persons real name */

  private String name;
  	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
  public Person1(String pname) {
    name = pname;
  }
  	/**
	 * This method should take the string
	 * input and return its characters rotated
	 * 2 positions.
	 * given "gtg123b" it should return
	 * "g123bgt".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
	    String temp = new String();
		for (int i = 0; i < input.length() - 2; i++) {
			temp += input.charAt(i + 2);
		}
		temp += input.charAt(0);
		temp += input.charAt(1);
		input = temp;
		return input;
	}
	
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the 
	 *         object
	 */
	public void main(String args[]) {
	    System.out.print(calc("gtg123b"));
    }
	public String toString(String input) {
	  return name + calc(input);
	}

}
