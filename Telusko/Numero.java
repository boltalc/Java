public class Numero{
	public static void main(String[] args){
		
		// int numero = 5;
		// int num = 3;
		// int rs = numero + num;

		// float fl = 5.5f;
		// double dl = 6.4;
		// byte bt = 120;
		// short st = 500;
		// long lg = 1000l;
		// char ch = 'a';
		// boolean bl = true;

		// char num1 = 'a';
		// System.out.println(num1);
		// num1++;
		// System.out.println(num1);

		// float b = 5.6f;
		// int a = (int) b;
		// System.out.println(a);

		// int num1 = 5;
		// int num2 = 7;

		// float result = (float)num2 / num1;
		// int a = 1;
		// do {
		// System.out.println(a + "st Hi");
		// a++;
		// }while(a < 5);
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