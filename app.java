import java.util.Scanner:

public class Calculator {
  public static void main(String[] args){
    int i,num = 5;
    int fact = 1;
        for (i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + num + " is " + fact);
  }
}
