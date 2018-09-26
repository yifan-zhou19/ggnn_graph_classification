package <missing>;

public class GlobalMembers
{
	public static int panduan(int[][] a, int n, int m)
	{
		if (n >= 0 && n <= 4 && m >= 0 && m <= 4)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static void diaohuan(int[][] a, int n, int m)
	{
		int i;
		int j;
		int temp;
		if (panduan(a, n, m) == 1)
		{
			for (i = 0;i < 5;i++)
			{
				temp = a[n][i];
				a[n][i] = a[m][i];
				a[m][i] = temp;
			}
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 5;j++)
				{
					if (j == 4)
					{
						System.out.printf("%d\n",a[i][j]);
					}
					else
					{
						System.out.printf("%d ",a[i][j]);
					}
				}
			}
		}
	}
	public static int Main()
	{
		int[][] juzhen = new int[5][5];
		int n;
		int m;
		int i;
		int j;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					juzhen[i][j] = Integer.parseInt(tempVar);
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
		if (panduan(juzhen, n, m) == 0)
		{
			System.out.print("error\n");
		}
		else if (panduan(juzhen, n, m) == 1)
		{
			diaohuan(juzhen, n, m);
		}
		return 0;
	}


}

