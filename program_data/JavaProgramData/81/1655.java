package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[5][5];
	public static int m;
	public static int n;

	public static int jiaohuan(int[][] a, int n, int m)
	{
		int[] b = new int[5];
		int i;
		if (n < 5 && m < 5 && n >= 0 && m >= 0)
		{
			for (i = 0;i < 5;i++)
			{
				b[i] = a[m][i];
			}
			for (i = 0;i < 5;i++)
			{
				a[m][i] = a[n][i];
			}
			for (i = 0;i < 5;i++)
			{
				a[n][i] = b[i];
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
		int i;
		int j;
		int c;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
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
		c = jiaohuan(a, n, m);
		if (c == 0)
		{
			System.out.print("error");
		}
		if (c == 1)
		{
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 4;j++)
				{
					System.out.printf("%d ", a[i][j]);
				}
				System.out.printf("%d", a[i][4]);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

