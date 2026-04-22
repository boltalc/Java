// class Calculator{
// 	int a;
// 	public int add(int x, int y){
// 		int z = x + y;
// 		return z;
// 	}
// }

// public class OOP{
	// public static void main(String[] args){
		// int num1 = 4;
		// int num2 = 5;
		// Calculator calc = new Calculator();
		// int result = calc.add(num1,num2);
		// System.out.println(result);
	// }
// }

// class Computer{
// 	public void playMusic(){
// 		System.out.println("Music Playing");
// 	}

// 	public String fetchAPen(int cost){
// 		if(cost % 100 == 0){
// 			int a = cost / 100;
// 			return (a + " Biro: Le Stylo");
// 		}
// 		return "Biro: Le Stylo";
// 	}
// }

// public class OOP{
// 	public static void main(String[] args){
// 		Computer music = new Computer();
// 		music.playMusic();
// 		String pen = music.fetchAPen(500);
// 		System.out.println(pen);
// 	}
// }

class Calculator{
	public int add(int n1, int n2){
	return n1 + n2;
	}
	public int add(int n1, int n2, int n3){
	return n1 + n2 + n3;
	}
}

public class OOP{
	public static void main(String[] args){
		Calculator calc = new Calculator();
		int num = calc.add(5, 15, 20);
		System.out.println(num);
	}
}