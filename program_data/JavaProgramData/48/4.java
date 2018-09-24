package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int[][][] a = new int[5][11][11];
		int sum;
		int days;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			sum = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			days = Integer.parseInt(tempVar2);
		}
		a[0][5][5] = sum;
		for (i = 1;i <= days;i++)
		{
			for (j = 1;j < 11;j++)
			{
				for (k = 1;k < 11;k++)
				{
					a[i][j][k] = a[i - 1][j][k] * 2 + a[i - 1][j - 1][k] + a[i - 1][j + 1][k] + a[i - 1][j][k - 1] + a[i - 1][j][k + 1] + a[i - 1][j - 1][k - 1] + a[i - 1][j - 1][k + 1] + a[i - 1][j + 1][k - 1] + a[i - 1][j + 1][k + 1];
				}
			}
		}
		for (j = 1;j < 10;j++)
		{
			for (k = 1;k < 9;k++)
			{
				System.out.printf("%d ",a[days][j][k]);
			}
			System.out.printf("%d",a[days][j][k]);
			System.out.print("\n");
		}
		return 0;
	}

}

