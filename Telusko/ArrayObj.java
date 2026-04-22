class Student{
	int matno;
	String name;
	int marks;
}

public class ArrayObj{
	public static void main(String[] args){
		Student std1 = new Student();
		std1.matno = 1;
		std1.name = "Agba";
		std1.marks = 89;

		Student std2 = new Student();
		std2.matno = 2;
		std2.name = "Ejeh";
		std2.marks = 81;

		Student std3 = new Student();
		std3.matno = 3;
		std3.name = "Blenje";
		std3.marks = 93;


		Student students[] = new Student[3];
		students[0] = std1;
		students[1] = std2;
		students[2] = std3;

		for(Student stud : students){
			System.out.println(stud.name + " : " + stud.marks);
		}

		/*for(int i = 0; i < students.length; i++){
			System.out.println(students[i].name + " : " + students[i].marks);
		}*/
	}
}