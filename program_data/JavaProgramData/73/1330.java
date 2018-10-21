package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int max;
		int t;
		int flag = 1;
		int[][] a = new int[5][5];
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
		for (i = 0;i < 5;i++)
		{
			max = 0;
			for (j = 0;j < 5;j++)
			{
				if (a[i][j] > max)
				{
					max = a[i][j];
					t = j;
				}
			}
			for (k = 0;k < 5;k++)
			{
				if (a[k][t] < max)
				{
					break;
				}
			}
			if (k == 5)
			{
				System.out.printf("%d %d %d",i + 1,t + 1,a[i][t]);
				flag = -1;
			}
		}
		if (flag == 1)
		{
			System.out.print("not found");
		}
		return 0;
	}
}

