import java.util.Scanner;
public class Main{
    public static void main(String[] args){
	Scanner oddeven = new Scanner(System.in);
	int num;
	System.out.println("Enter a number");
	num = oddeven.nextInt();

	if(num % 2 == 0){
	    System.out.println("Even");
	}
	else{
	    System.out.println("Odd");
	}
	oddeven.close();
    }
}
