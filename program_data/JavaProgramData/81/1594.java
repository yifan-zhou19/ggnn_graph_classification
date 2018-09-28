package <missing>;

public class GlobalMembers
{
	public static int change(int[][] a, int n, int m)
	{
		if (n >= 0 && n <= 4 && m >= 0 && m <= 4)
		{
			int i;
			int t;
			for (i = 0;i < 5;i++)
			{
				t = a[m][i];
				a[m][i] = a[n][i];
				a[n][i] = t;
			}
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int[][] b = new int[5][5];
		int k;
		int l;
		int m;
		int n;
		int t;
		for (k = 0;k < 5;k++)
		{
			for (l = 0;l < 5;l++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					b[k][l] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		if (change(b, m, n) == 0)
		{
			System.out.print("error\n");
		}
		else
		{
			if (change(b, m, n) == 1)
			{
				for (k = 0;k < 5;k++)
				{
					t = b[m][k];
					b[m][k] = b[n][k];
					b[n][k] = t;
				}
				for (k = 0;k < 5;k++)
				{
					for (l = 0;l < 4;l++)
					{
						System.out.printf("%d ",b[k][l]);
					}
					System.out.printf("%d\n",b[k][4]);
				}
			}
		}
		return 0;
	}

}

