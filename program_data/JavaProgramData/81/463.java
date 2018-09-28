package <missing>;

public class GlobalMembers
{
	public static int f(int[][] a, int m, int n)
	{
		int k;
		int i;
		if (m < 5 && m >= 0 && n < 5 && n >= 0)
		{
			for (i = 0;i < 5;i++)
			{
				k = a[m][i];
			a[m][i] = a[n][i];
			a[n][i] = k;
			}
		return 1;
		}
		else
		{
			return 0;
		}
	}

	public static void Main()
	{
		int i;
		int j;
		int m;
		int n;
		int k;
		int[][] a = new int[5][5];
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
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		k = f(a, m, n);
		if (k == 1)
		{
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 4;j++)
				{
			System.out.printf("%d ",a[i][j]);
				}
			System.out.printf("%d\n",a[i][4]);
			}
		}

		else
		{
			System.out.print("error\n");
		}
	}


}

