package <missing>;

public class GlobalMembers
{
	public static int total = 0;
	public static int divide(int k,int number)
	{
		if (number == 1)
		{
			total++;
			return 0;
		}
		int i;
		for (i = k;i <= number;i++)
		{
		   if (number % i == 0)
		   {
		   divide(i, number / i);
		   }
		}
		return 0;
	}
	public static int Main()
	{
		int i;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] num = new int[n];
		for (i = 0;i < n;i++)
		{
		  num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			total = 0;
		 divide(2, num[i]);
		 System.out.print(total);
		 System.out.print("\n");
		}
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;
	}

}

