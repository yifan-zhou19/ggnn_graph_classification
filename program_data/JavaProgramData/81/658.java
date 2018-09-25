package <missing>;

public class GlobalMembers
{
	public static int juzhen(int n, int m)
	{
		int j;
		if (0 <= n != 0 && n <= 4 && 0 <= m != 0 && m <= 4)
		{
			for (j = 0;j < 5;j++)
			{
				int temp;
				temp = a[n][j];
				a[n][j] = a[m][j];
				a[m][j] = temp;
			}
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int[][] a = new int[5][5];
	public static int Main()
	{

		int i;
		int j;
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
		int n;
		int m;
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
		int b = juzhen(n, m);
		if (b == 1)
		{
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 4;j++)
				{
					System.out.printf("%d ",a[i][j]);
				}
				System.out.printf("%d\n",a[i][4]);
			}
		}
		if (b == 0)
		{
			System.out.print("error");
		}
		return 0;
	}


}

