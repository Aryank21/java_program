package JavaApplication_;

 import java.util.ArrayList;

class Main1 {
  public static void main(String[] args) {
    // Creating an array list
    ArrayList<String> languages = new ArrayList<>();
    languages.add("Java");
    languages.add("JavaScript");
    languages.add("Python");
    System.out.println("ArrayList: " + languages);

    // Using for loop
    System.out.println("Iterating over ArrayList using for loop: ");

    for(int i = 0; i < languages.size(); i++) {
      System.out.print(languages.get(i));
      System.out.print(", ");
    }
    
    
    ArrayList<String> languages1 = new ArrayList<>();
    languages1.add("Java");
    languages1.add("JavaScript");
    languages1.add("Python");
    System.out.println("ArrayList: " + languages);

        // Using forEach loop
    System.out.println("Iterating over ArrayList using for-each loop:");
    for(String language : languages) {
      System.out.print(language);
      System.out.print(", ");
    }
  }
}