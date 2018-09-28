package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[row][col];
	public static int Main()
	{
		int r;
		int c;
		int i;
		int j;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			r = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < r;i++)
		{
			for (j = 0;j < c;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (n = 0;n <= c + r - 2;n++)
		{
			for (i = 0;i <= n != 0 && i < r;i++)
			{
				j = n - i;
				if (j < c)
				{
				System.out.printf("%d\n",a[i][j]);
				}
			}
		}





		return 0;
	}
}

