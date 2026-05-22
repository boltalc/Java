public class Main{
    public static void main(String[] args){
	vote(18);
    }

    public static void vote(int voter){
	if(voter < 18){
	    System.out.println("Access denied, you are not old enough");
	}
	else{
	    System.out.println("Access granted you are old enough to vote");
	}
    }
}
