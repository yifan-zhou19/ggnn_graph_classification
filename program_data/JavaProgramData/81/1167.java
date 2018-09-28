package <missing>;

public class GlobalMembers
{
	public static int isin(int n, int m)
	{
		if ((n <= 4) && (m <= 4) && (n >= 0) && (m >= 0))
		{

			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int a;
		int b;
		int n;
		int m;
		int[][] z = new int[5][5];
		for (a = 0;a <= 4;a++)
		{
			for (b = 0;b <= 4;b++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					z[a][b] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		if (isin(n, m) == 0)
		{
			System.out.print("error");
		}
			else
			{
				int[] x = new int[5];

			for (a = 0;a <= 4;a++)
			{
				x[a] = z[n][a];
				z[n][a] = z[m][a];
				z[m][a] = x[a];
			}
			for (a = 0;a <= 4;a++)
			{
				for (b = 0;b <= 4;b++)
				{
					if (b < 4)
					{
					System.out.printf("%d ",z[a][b]);
					}
					else
					{
						System.out.printf("%d",z[a][b]);
					}
				}
				System.out.print("\n");
			}
			}
		return 0;
	}
}

