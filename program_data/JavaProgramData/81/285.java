package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int f = new int(int a,int b);
		int m;
		int n;
		int i;
		int p;
		int q;
		int j;
		int[][] x = new int[5][5];
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				x[i][j] = Integer.parseInt(tempVar);
			}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		p = f(m, n);
		if (p == 0)
		{
			System.out.print("error\n");
		}
		else
		{
			{
				for (i = 0;i < 5;i++)
				{
					q = x[m][i];
					x[m][i] = x[n][i];
					x[n][i] = q;
				}

		}
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 5;j++)
				{
					if (j == 0)
					{
						System.out.printf("%d",x[i][j]);
					}
					else
					{
						System.out.printf(" %d",x[i][j]);
					}
				}
				System.out.print("\n");
			}
		}
	}
	public static int f(int a,int b)
	{
		if (a < 5 && a >= 0 && b < 5 && b >= 0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}


}

