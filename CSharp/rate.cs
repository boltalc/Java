using System;

namespace rate{
    class wage{
	static void Main(string[] args){
	    double rate = 5000;

	    Console.WriteLine("Enter shift duration");
	    
	    string time = Console.ReadLine();
	    int hours = Convert.ToInt32(time);

	    if(hours < 0 || hours > 84){
		Console.WriteLine("Out of range");
	    }
	    else if(hours > 40){
		double pay;
		pay = 1.5 * hours * rate;
		Console.WriteLine("₦" + pay);
	    }
	    else if(hours <= 40){
		double pay;
		pay = hours * rate;
		Console.WriteLine("₦" + pay);
	    }
	}
    }
}
