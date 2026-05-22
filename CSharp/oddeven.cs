using System;

namespace OddEven{
    class Odd{
	static void Main(string[] args){
	    string no;
	    Console.WriteLine("Enter a Number");

	    no = Console.ReadLine();

	    int num = Convert.ToInt32(no);

	    if(num % 2 == 0){
		Console.WriteLine("Number is even");
	    }
	    else{
		Console.WriteLine("Number is odd");
	    }
	}
    }
}
