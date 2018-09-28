package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int n;
		int m;
		int c;
		int i;
		int j;
		int t;
		int f = new int(int x,int y);
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
		c = f(n, m);
		if (c == 0)
		{
			System.out.print("error");
		}
		else
		{
		for (i = 0;i < 5;i++)
		{
			t = a[n][i];
			a[n][i] = a[m][i];
			a[m][i] = t;
		}
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				if (j < 4)
				{
				System.out.printf("%d ",a[i][j]);
				}
				else
				{
					System.out.printf("%d",a[i][j]);
				}
				if (j == 4)
				{
					System.out.print("\n");
				}
			}
		}
		}
		return 0;
	}



	public static int f(int x,int y)
	{
		if (x >= 5 || y >= 5)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
}

