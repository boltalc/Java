public class JackBauer12{
	public static void main(String[] args){
		for(int a = 0; a <= 12; a++){
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
		for(int a = 1; a < 12; a++){
			System.out.println();
			for(int b = 0; b < 60; b++){
				if(a < 10){
					System.out.print("0");
				}
				if(b < 10){
					System.out.println(a + ":" + "0" + b);
					continue;
				}
				System.out.println(a + ":" + b);
			}
		}
	}
}