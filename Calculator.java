class Calculator
{
	public static void main(String[] args)
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);



		char val=args[2].charAt(0);



		
		switch(val)
		{
			case '+' :
					System.out.println((a+b));break;

			case '-' :
					System.out.println((a-b));break;

			case '*' :
					System.out.println((a*b));break;

			case '/' :
					System.out.println((a/b));break;


			default: System.out.println("Error operator");
				 System.exit(0);

		}

	}
}
