import java.util. Scanner;
public class HelloWorld {
    public static void main(String[] args){
	System.out.println("Enter your coin");
      	Scanner input = new Scanner (System.in);
	int x = input.nextInt();

	double result = 0.0045 *  x;
	System.out.println("$" + result);
    }
}
