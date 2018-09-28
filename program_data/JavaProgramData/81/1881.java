package <missing>;

public class GlobalMembers
{
	public static int ismatrix(int m, int n)
	{
		if (m >= 5 || n >= 5 || n < 0 || m < 0)
		{
		return 0;
		}
		return 1;
	}

	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		int[][] a = new int[5][5];
		for (i = 0; i < 5; i++)
		{
		for (j = 0; j < 5; j++)
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
		if (ismatrix(m, n) != 0)
		{
			int tmp;
			int first = 1;
			for (i = 0; i < 5; i++)
			{
				tmp = a[m][i];
				a[m][i] = a[n][i];
				a[n][i] = tmp;
			}
			for (i = 0; i < 5; i++)
			{
			for (j = 0; j < 5; j++)
			{
				if (j != 4)
				{
				System.out.printf("%d ", a[i][j]);
				}
				if (j == 4)
				{
				System.out.printf("%d\n",a[i][j]);
				}
			}
			}
		}
		else
		{
		System.out.print("error\n");
		}
		return 0;
	}


}

