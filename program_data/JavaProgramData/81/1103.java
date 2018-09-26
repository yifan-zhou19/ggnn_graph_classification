package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[5][5];
	public static int compare(int x,int y)
	{
		if (x > 4 || y > 4)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
	public static int Main()
	{
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;

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
		k = compare(m, n);
		if (k == 0)
		{
			System.out.print("error\n");
		}
		else
		{
			for (i = 0;i < 5;i++)
			{
				l = a[m][i];
				a[m][i] = a[n][i];
				a[n][i] = l;
			}

		for (i = 0;i < 5;i++)
		{
			System.out.printf("%d",a[i][0]);
			for (j = 1;j < 5;j++)
			{
				System.out.printf(" %d",a[i][j]);
			}
			System.out.print("\n");
		}
		}
		return 0;
	}
}

