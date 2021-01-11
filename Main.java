import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[] number = new int[15];
    int temporary, lengthofnumber;
    while (true) {
      System.out.print("Enter a number:\t\t\t");
      String input = in.next();
      lengthofnumber = input.length();
      for (int i = 0; i < lengthofnumber; i++) {
        number[i] = input.charAt(i);
        number[i] -= 48;
      }
      System.out.print("seven Ate Nine no more: ");
      for (int i = 0; i < lengthofnumber; i++) {
        if (number[i] == 7 && number[i + 1] == 8 && number[i + 2] == 9) {
          temporary = number[i];
          number[i] = number[i + 1];
          number[i + 1] = number[i + 2];
          number[i + 2] = temporary;
        } 
        System.out.print(number[i]);
      }
      System.out.println("\n");
    }
  }
}    
    
 


