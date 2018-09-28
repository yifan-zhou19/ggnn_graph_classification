package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz1 = new int[5][5];
		int n;
		int m;
		int i;
		int j;
		int sz = new int(int sz1[5][5],int m,int n);
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					sz1[i][j] = Integer.parseInt(tempVar);
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
		if (sz(sz1, m, n) == 0)
		{
		System.out.print("error");
		}
		return 0;
	}
	public static int sz(int[][] sz1, int m, int n)
	{
		int i;
		int j;
		int t;
		int y;
		if (n <= 4 && m <= 4)
		{
			y = 1;
			for (i = 0;i < 5;i++)
			{
				t = sz1[n][i];
				sz1[n][i] = sz1[m][i];
				sz1[m][i] = t;
			}
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 5;j++)
				{
					System.out.printf("%d",sz1[i][j]);
					if (j < 4)
					{
						System.out.print(" ");
					}
				}
				if (i < 4)
				{
					System.out.print("\n");
				}
			}
		}
		else
		{
			y = 0;
		}
		return (y);
	}
}

