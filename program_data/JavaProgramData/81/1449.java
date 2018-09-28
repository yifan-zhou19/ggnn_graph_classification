package <missing>;

public class GlobalMembers
{
	public static int[][] c = new int[5][5];

	public static int change(int n, int m, int[][] a)
	{
		int[] b = new int[5];
		int i;
		int j;
		int s;
		if (m <= 4 && n <= 4)
		{
			for (i = 0;i < 5;i++)
			{
				b[i] = a[m][i];
				a[m][i] = a[n][i];
				a[n][i] = b[i];
			}
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 5;j++)
				{
					c[i][j] = a[i][j];
				}
			}
			s = 1;
		}
		else
		{
			s = 0;
		}
		return s;
	}

	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int n;
		int m;
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
		if (change(n, m, a) == 1)
		{
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 4;j++)
				{
					System.out.printf("%d ",c[i][j]);
				}
				System.out.printf("%d\n",c[i][4]);
			}
		}
		else
		{
			System.out.print("error\n");
		}
	}
}

