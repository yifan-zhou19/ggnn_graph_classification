package <missing>;

public class GlobalMembers
{
	public static int exchange(int[][] k, int n, int m)
	{
		int t;
		int i;
		if (n < 5 && m < 5)
		{
			for (i = 0;i < 5;i++)
			{
				t = k[m][i];
				k[m][i] = k[n][i];
				k[n][i] = t;
			}
		return 1;
		}
	else
	{
		return 0;
	}
	}

	public static void Main(String[] args)
	{
	int[][] a = new int[5][5];
	int n;
	int m;
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				m = Integer.parseInt(tempVar3);
			}
		c = exchange(a, n, m);
		if (c == 1)
		{
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 4;j++)
				{
					System.out.printf("%d ",a[i][j]);
				}
					System.out.printf("%d",a[i][4]);
					System.out.print("\n");
			}
		}
		if (c == 0)
		{
				System.out.print("error");
		}
	}


}

