package <missing>;

public class GlobalMembers
{
	//*************************
	//*  ????????? 
	//*  ????? 
	//*  ???1200012941 
	//*  ???2012?10?22? 
	//*************************
	public static int Main()
	{
		int i;
		int j;
		int x;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (x = 3; x <= n / 2; x = x + 2)
		{
			for (i = 2; i <= (int)Math.sqrt(x) + 1; i++)
			{
				if (x % i == 0)
				{
					break;
				}
				if (i == (int)Math.sqrt(x) + 1)
				{
					for (j = 2; j <= (int)Math.sqrt(n - x) + 1; j++)
					{
						 if ((n - x) % j == 0)
						 {
							 break;
						 }
						 if (j == (int)Math.sqrt(n - x) + 1)
						 {
							 System.out.print(x);
							 System.out.print(" ");
							 System.out.print(n - x);
							 System.out.print("\n");
						 }
					}
				}
			}
		}
		return 0;
	}

}

