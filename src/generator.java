import java.math.*;
import java.util.*;

public class generator {

  // arraylist
  ArrayList<String> lets = new ArrayList<String>(Arrays.asList("a", "b", "c", "d", "e", "f", "g",
      "h", "i", "j" + "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y",
      "z", "A", "B", "C", "D", "E" + "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q",
      "R", "S", "T", "U", "V", "W", "X", "Y", "Z"));
  ArrayList<String> nums = new ArrayList<String>(
      Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "0"));
  ArrayList<String> syms = new ArrayList<String>(Arrays.asList("!", "@", "#", "$", "%", "^", "&",
      "*", "(", ")" + "{", "}", "[", "]", "/", "'\'", "~", "?", "<", ">", ":", ";", ",", "."));

  // variables
  int len;
  boolean letters;
  boolean numbers;
  boolean symbols;
  String password;

  // constructor
  public generator(int len, boolean letters, boolean numbers, boolean symbols) {
    this.len = len;
    this.letters = letters;
    this.numbers = numbers;
    this.symbols = symbols;
    this.password = "";
    this.generate();
  }

  public void generate() {
    ArrayList<String> total = new ArrayList<String>();
    
    if (this.letters) {
      total = addToTotal(this.lets, total);
    }
    if (this.numbers) {
      total = addToTotal(this.nums, total);
    }
    if (this.symbols) {
      total = addToTotal(this.syms, total);
    }
    
    for (int i = 0; i < this.len; i++ ) {
      int rand = (int)(Math.random()*total.size());
      this.password = this.password + total.get(rand);
    }
  }

  ArrayList<String> addToTotal(ArrayList<String> arr, ArrayList<String> total) {
    for (int i = 0; i < arr.size(); i++ ) {
       total.add(arr.get(i));
    }
    return total;
  }

 

}
