
import java.util.Scanner;
public class Mini {
    public static void main(String[]args){
                Scanner sc = new Scanner(System.in);
                int mynumber = (int)(Math.random()*100);
                int userNumber = 0;
                do {
                    System.out.println("Guess my number :");
                    userNumber = sc.nextInt();

                    if (userNumber==mynumber){
                        System.out.println("WOOHOO..CORRECT GUESS");
                        break;
                    }
                    else if (userNumber>mynumber){
                        System.out.println("Your number is too large");
                    }
                    else {
                        System.out.println("Your number is too small");
                    }
                }while (userNumber>=0);

                System.out.println("My Number Was : "+mynumber);



            }
        }

