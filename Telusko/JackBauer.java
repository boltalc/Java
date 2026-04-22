public class JackBauer{
	public static void main(String[] args){
		for(int a = 0; a < 24; a++){
			System.out.println();
			for(int b = 0; b < 60; b++){
				if(a < 10){
					System.out.print("0");
				}
				if(b < 10){
					System.out.println(a + ":" + "0" + b);
					continue;
				}
				System.out.println(a +":" + b);
			}
		}
	}
}