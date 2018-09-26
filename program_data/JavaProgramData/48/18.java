package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] num1 = new int[11][11];
		int[][] num2 = new int[11][11];
		int m;
		int day;
		int t;
		int j;
		int i;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			day = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < 11;i++)
		{
			for (j = 0;j < 11;j++)
			{
				num1[i][j] = 0;
				num2[i][j] = 0;
			}
		}
		num1[5][5] = m;
		for (k = 1;k <= day;k++)
		{
			for (i = 5 - k;i <= 5 + k;i++)
			{
				for (j = 5 - k;j <= 5 + k;j++)
				{
					num2[i][j] = num2[i][j] + num1[i - 1][j] + num1[i - 1][j - 1] + num1[i - 1][j + 1] + num1[i + 1][j] + num1[i + 1][j - 1] + num1[i + 1][j + 1] + num1[i][j - 1] + num1[i][j + 1];
					num2[i][j] = num2[i][j] + 2 * num1[i][j];
				}
			}
			for (i = 0;i < 11;i++)
			{
				for (j = 0;j < 11;j++)
				{
					num1[i][j] = num2[i][j];
				}
			}
			for (i = 0;i < 11;i++)
			{
				for (j = 0;j < 11;j++)
				{
					num2[i][j] = 0;
				}
			}
		}
		for (i = 1;i < 10;i++)
		{
			for (j = 1;j < 9;j++)
			{
				System.out.printf("%d ",num1[i][j]);
			}
			System.out.printf("%d\n",num1[i][9]);
		}
		return 0;
	}
}

