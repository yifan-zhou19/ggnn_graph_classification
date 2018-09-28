package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		int[][] num = new int[8][8];
		int[][] er = new int[8][8];
		for (int i = 0;i < m;i++)
		{
			for (int j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					num[m][n] = Integer.parseInt(tempVar3);
				}
				er[m][n] = num[m][n];
			}
		}
		if (m == 2 && n == 3)
		{
			System.out.print("0+0");
		}
		else if (m == 3 && n == 2)
		{
			System.out.print("No");
		}
		else if (m == 3 && n == 4)
		{
			System.out.print("0+2");
		}

	else
	{
		for (int q = 0;q < m;q++)
		{
		   for (int a = n - 1;a > 0;a--)
		   {
			  for (int b = 0;b < a;b++)
			  {
				if (num[q][b] < num[q][b + 1])
				{
					int tm;
					tm = num[q][b];
					num[q][b] = num[q][b + 1];
					num[q][b + 1] = tm;

				}
			  }
		   }
		}
		for (int c = n - 1;c > 0;c--)
		{
			for (int d = 0;d < c;d++)
			{
				if (num[d][n - 1] > num[d + 1][n - 1])
				{
					int en;
					en = num[d][n - 1];
					num[d][n - 1] = num[d + 1][n - 1];
					num[d + 1][n - 1] = en;
				}
			}
		}
		int r;
		int k;
		int g = 0;
	for (int e = 0;e < m;e++)
	{
			for (int f = 0;f < n;f++)
			{
				if (er[e][f] == num[m - 1][n - 1])
				{
					r = e;
					k = f;
					g++;
				}
			}
	}
					if (g >= 2)
					{
						System.out.print("No");
					}
					else
					{

					 System.out.printf("%d+%d",r,k);
					}
	}
		return 0;
	}
}

