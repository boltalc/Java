public class Main{
    public static void main(String[] args){
	int i, j;
	for(i = 0; i < 24; i++){
	    System.out.println();
	    for(j = 0; j < 60; j++){
		if(i < 10){
		    System.out.print(0);
		}
		if(j <= 9){
		    System.out.printf("%d:0%d \n", i, j);
		}
		else{
		    System.out.printf("%d:%d \n", i, j);
		}
	    }
	}
    }
}
