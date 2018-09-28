package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int c;
		int sum;
		int m = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (sum = 0,i = 1;i <= n;i++)
		{
							   for (c = 1,m = 0;c <= i;c = c * 10)
							   {
												   if ((((i / c) - 7) % 10 == 0) || (i % 7 == 0))
												   {
																	  m = 1;
																	  break;
												   }
							   }
							   if (m != 1)
							   {
							   sum = sum + i * i;
							   }
		}
							   System.out.print(sum);
							   System.out.print("\n");
							   return 0;
	}
}

