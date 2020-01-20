import java.io.*;

class Experiment_2_3
{




        void largest_of_three_numbers(int a,int b,int c)
	{
		int largest=a>b?(a>c?a:c):(b>c?b:c);            // ternary operator to find largest
		System.out.println("Largest is " + largest);
	}




	public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);

		Experiment_2_3 obj=new Experiment_2_3();
		obj.largest_of_three_numbers(a,b,c);
	}
}
		