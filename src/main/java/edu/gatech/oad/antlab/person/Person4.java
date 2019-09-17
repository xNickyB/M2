package edu.gatech.oad.antlab.person;

/**
 *  A simple class for person 4
 *  returns their name and a
 *  modified string 
 *  
 *  @author Bob
 *  @version 1.1
 */
public class Person4 {
  /** Holds the persons real name */
  private String name;
    /**
     * The constructor, takes in the persons
     * name
     * @param pname the person's real name
     */
  public Person4(String pname) {
    name = pname;
  }
    /**
     * This method should return a string
     * where each character is 1 greater 
     * than its previous value.  So
     * given "abc123" it should return
     * "bcd234".
     *
     * @param input the string to be modified
     * @return the modified string
     */
    private String calc(String input) {
        char[] letter = new char[input.length()];
        //int[] newL = new int[input.length()];
        String newString = "";
      //Person 4 put your implementation here
        for (int i = 0; i < input.length(); i++) {
            letter[i] = input.charAt(i);
        }
        for (int i = 0; i < letter.length ; i++ ) {
            //newString.append((toString(letter[i] + 1)));
            System.out.println(letter[i] + 1);
        }
      return null;
    }
    
    /**
     * Return a string rep of this object
     * that varies with an input string
     *
     * @param input the varying string
     * @return the string representing the 
     *         object
     */
    public String toString(String input) {
      return name + calc(input);
    }
    //public static void main(String[] args) {
    //    Person4 najaah = new Person4("Najaah");
    //    System.out.println(najaah.calc("abc123"));
    //}

}

