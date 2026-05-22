import java.util.Scanner;
public class Main{
    public static void main(String[] args){
	Scanner dur = new Scanner(System.in);
	double rate = 5_000;

	System.out.println("Enter Shift duration");

	int hours = dur.nextInt();

	
	if(hours < 0 || hours > 84){
	    System.out.println("Out of range");
	}
	else if(hours > 40){
	    double pay;
	    pay = 1.5 * hours * rate;
	    System.out.println("₦" + pay);
	}
	else if(hours <= 40){
	    double pay;
	    pay = hours * rate;
	    System.out.println("₦" + pay);
	}
	dur.close();
    }
}
