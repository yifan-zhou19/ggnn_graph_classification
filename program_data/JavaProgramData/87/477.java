package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		int[][] a = new int[100][6];
		int[] b = new int[100];
		for (i = 0;;i++)
		{
			for (j = 0;j < 6;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
			if (a[i][0] == 0)
			{
				break;
			}
			scanf("\n");
		}
		m = i;
		for (i = 0;i < m;i++)
		{
			b[i] = (a[i][3] + 12) * 3600 + a[i][4] * 60 + a[i][5] - (a[i][0] * 3600 + a[i][1] * 60 + a[i][2]);
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%d\n",b[i]);
		}
		return 0;
	}
}

