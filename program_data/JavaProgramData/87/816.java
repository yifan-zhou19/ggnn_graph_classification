package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[20][6];
		int j;
		int i;
		int[] SUM = new int[11];
		int n;
		for (i = 0;i < 100;i++)
		{
			for (j = 0;j < 6;j++)
			{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i][j] = Integer.parseInt(tempVar);
			}
			}
		}
		for (i = 0;i < 100;i++)
		{
			if (a[i][0] == 0)
			{
				n = i;
				break;
			}
		}
		for (i = 0;i < n;i++)
		{
			SUM[i] = (60 - a[i][2] + a[i][5]) + (60 - a[i][1] - 1) * 60 + a[i][4] * 60 + (12 - 1 - a[i][0]) * 3600 + a[i][3] * 3600;
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",SUM[i]);
		}
		return 0;
	}

}

