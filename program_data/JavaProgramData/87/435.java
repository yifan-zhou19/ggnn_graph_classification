package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[1000][6];
		int i;
		int j;
		int k = 0;
		int l = 0;
		int AM;
		int PM;
		int T;
		for (i = 0;i < 10;i++)
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
			for (j = 0;j < 6;j++)
			{
				if (a[i][j] == 0)
				{
					k++;
				}
			}
			if (k != 6)
			{
				l++;
			}
			k = 0;
		}
		for (i = 0;i < l;i++)
		{
			AM = (a[i][0] * 3600) + (a[i][1] * 60) + (a[i][2]);
			PM = (a[i][3] * 3600) + (a[i][4] * 60) + (a[i][5]) + 43200;
			T = PM - AM;
			System.out.printf("%d\n",T);
		}
		return 0;
	}
}

