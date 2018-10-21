package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int m;
	public static int[][] a = new int[5][5];
	public static void swap()
	{
		int tmp = 0;
		int i;
		for (i = 1;i <= 5;i++)
		{
		tmp = a[n][i - 1];
		a[n][i - 1] = a[m][i - 1];
		a[m][i - 1] = tmp;
		}
	}
	public static int Main()
	{
		int i;
		int j;
		for (i = 1;i <= 5;i++)
		{
			for (j = 1;j <= 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i - 1][j - 1] = Integer.parseInt(tempVar);
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
			if (n >= 0 && n <= 4 && m >= 0 && m <= 4)
			{
				swap();
			}
			else
			{
				System.out.print("error");
			return 0;
			}
		for (i = 1;i <= 5;i++)
		{
			for (j = 1;j <= 5;j++)
			{
				if (j != 5)
				{
				System.out.printf("%d ",a[i - 1][j - 1]);
				}
				else
				{
					System.out.printf("%d\n",a[i - 1][j - 1]);
				}
			}
		}

		return 0;
	}
}

