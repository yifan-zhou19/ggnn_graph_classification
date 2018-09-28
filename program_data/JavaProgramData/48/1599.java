package <missing>;

public class GlobalMembers
{
	public static int[][] num = new int[9][9];
	public static int[][] im = new int[9][9];
	public static int Main()
	{
		int i;
		int j;
		int k;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		num[4][4] = m;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 9;j++)
			{
				for (k = 0;k < 9;k++)
				{
					im[j][k] = 0;
				}
			}
			for (j = 1;j < 8;j++)
			{
				for (k = 1;k < 8;k++)
				{
					im[j - 1][k] += num[j][k];
					im[j][k] += 2 * num[j][k];
					im[j][k - 1] += num[j][k];
					im[j + 1][k] += num[j][k];
					im[j][k + 1] += num[j][k];
					im[j - 1][k - 1] += num[j][k];
					im[j - 1][k + 1] += num[j][k];
					im[j + 1][k - 1] += num[j][k];
					im[j + 1][k + 1] += num[j][k];
				}
			}
			for (j = 0;j < 9;j++)
			{
				for (k = 0;k < 9;k++)
				{
					num[j][k] = im[j][k];
				}
			}
		}
		for (j = 0;j < 9;j++)
		{
			for (k = 0;k < 9;k++)
			{
				System.out.printf("%d%c",num[j][k],k == 8?'\n':' ');
			}
		}
	}


}

