class Mobile{
	String brand;
	int price;
	static String type;

	public void show(){
		System.out.printf("%nBrand Name: %s%nPrice:	%d%nType:	%s%n%n", brand, price, type);
	}

	public static void reveal(Mobile brand_){
		System.out.printf("%nBrand Name: %s%nPrice:	%d%nType:	%s%n%n", brand_.brand, brand_.price, brand_.type);
	}
}

public class StaticVar{
	public static void main(String[] args){
		Mobile brand1 = new Mobile();
		brand1.brand = "Apple";
		brand1.price = 1500;
		Mobile.type = "Smartphone";

		Mobile brand2 = new Mobile();
		brand2.brand = "Xiaomi";
		brand2.price = 1200;
		// Mobile.type = "Tablet";

		brand1.show();
		brand2.show();

		Mobile.reveal(brand1);
	}
}