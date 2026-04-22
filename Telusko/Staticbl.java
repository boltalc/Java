class Mobile{
	String brand;
	int price;
	static String type;

	public Mobile(){
		brand = "";
		price = 200;
	}

	static{
		type = "Smartphone";
	}
}

public class Staticbl{
	public static void main(String[] args){
		Mobile obj = new Mobile();
	}
}