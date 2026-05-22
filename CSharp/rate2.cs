using System;

namespace rate
{
    class wage
    {
	static void Main(string[] args)
	{
            Console.WriteLine("Enter hours worked");
            int hoursWorked = Convert.ToInt32(Console.ReadLine());

             int rate = 5000;

            double bonus = CalculateBonus(hoursWorked, rate);

            Console.WriteLine("₦" + bonus);
        }

        static double CalculateBonus(int hoursWorked, double rate)
        {
            if (hoursWorked > 40)
            {
		int time = hoursWorked - 40;
		double wage = 40 * rate;
                double pay = wage +  (time * rate * 1.5);
                return pay;
            }
            else
            {
                double pay = hoursWorked * rate;
                return pay;
            }
        }
    }
}
