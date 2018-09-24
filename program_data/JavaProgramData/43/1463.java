package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int m;
		int j;
		int sum;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 3;i <= m / 2;i++)
		{
		  sum = 1;
			for (j = 2;j <= (int)Math.sqrt(i);j++)
			{
				if (i % j == 0)
				{
				 sum = sum * 0;
				}
			}
			if (sum == 1)
			{
			  for (j = 2;j <= (int)Math.sqrt(m - i);j++)
			  {
				  if ((m - i) % j == 0)
				  {
					  sum = sum * 0;
				  }
			  }
			}
			if (sum == 1)
			{
			System.out.print(i);
			System.out.print(" ");
			System.out.print(m - i);
			System.out.print("\n");
			}
		}
	return 0;
	}
}

