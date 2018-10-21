package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int oNum;
		int x1;
		int x2;
		int i = 1;
		int sum1 = 0;
		int sum2 = 0;
		int j = 1;
		int k = 1;
		oNum = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= oNum / 2;i = i + 2)
		{
			x1 = i;
			x2 = oNum - x1;
					  for (j = 1;j <= x1;j++)
					  {
				if (x1 % j == 0)
				{
				   sum1++;
				}
					  }
			for (k = 1;k <= x2;k++)
			{
				if (x2 % k == 0)
				{
				   sum2++;
				}
			}
			if (sum1 == 2 && sum2 == 2)
			{
				System.out.print(x1);
				System.out.print(" ");
				System.out.print(x2);
				System.out.print("\n");
			}
			sum1 = 0;
			sum2 = 0;
			j = 1;
			k = 1;
		}
		return 0;
	}

}

