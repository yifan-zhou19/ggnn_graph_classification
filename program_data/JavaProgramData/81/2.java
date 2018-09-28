package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[5][5];

	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		int exch = new int(int a[5][5],int n,int m);
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
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		if (exch(a, n, m) == 1)
		{
			for (i = 0;i < 5;i++)
			{
				  for (j = 0;j < 4;j++)
				  {
					System.out.printf("%d ",a[i][j]);
				  }
				System.out.printf("%d\n",a[i][j]);
			}
		}
		else
		{
			System.out.print("error\n");
		}
	}

	public static int exch(int[][] a, int n, int m)
	{
		int t;
		int i;
		if (!(n >= 0 && n <= 4) || !(m >= 0 && m <= 4))
		{
			return 0;
		}
		else
		{
			for (i = 0;i < 5;i++)
			{
				t = a[n][i];
				a[n][i] = a[m][i];
				a[m][i] = t;
			}
			return 1;
		}
	}
}

