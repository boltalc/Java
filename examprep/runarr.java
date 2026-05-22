import java.util.Scanner;
public class Main{
    public static void main(String[] args){
	Scanner fint = new Scanner(System.in);
	int[] num = new int[5];
	System.out.println("Enter 5 numbers");

	//num = fint.nextInt();

	for(int i = 0; i < 5; i++){
	    num[i] = fint.nextInt();
	}

	System.out.println("You entered: ");

	for(int i = 0; i < 5; i++){
	    System.out.println(num[i]);
	}
    }
    // fint.close();
}
