class SquareOfNumber
{
	public static void main(String x[])
	{
		int n=x.length;
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=Integer.parseInt(x[i]);
			arr[i]=arr[i]*arr[i];
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+ "  ");
		}
		System.out.println();
	}
}
