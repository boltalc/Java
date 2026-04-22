class Person{
	private String name;
	private int age;

	public int getAge(){
		return age;
	}

	public void setAge(int age){
		this.age = age;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}
}

public class Encaps{
	public static void main(String[] args){
		Person obj = new Person();

		System.out.printf("Name:	%s%nAge:	%d%n", obj.getName(), obj.getAge());
		
		obj.setAge(19);
		obj.setName("Mercy");

		// System.out.printf("Name:	%s%nAge:	%d%n", obj.getName(), obj.getAge());
	}
}