package <missing>;

public class GlobalMembers
{
	public static int panduan(int a, int b, int c, int d, int e)
	{
		int s = 0;
		if (e >= a != 0 && e >= b != 0 && e >= c != 0 && e >= d)
		{
			s = 1;
		}
		return s;
	}
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		int[][] dikuai = new int[m + 2][n + 2];
		for (i = 1;i < m + 1;i++)
		{
			for (j = 1;j < n + 1;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					dikuai[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (j = 0,i = 0;i < m + 2;i++)
		{
			dikuai[i][j] = 0;
		}
		for (j = n + 1,i = 0;i < m + 2;i++)
		{
			dikuai[i][j] = 0;
		}
		for (j = 0,i = m + 1;j < n + 2;j++)
		{
			dikuai[i][j] = 0;
		}
		for (j = 0,i = 0;j < n + 2;j++)
		{
			dikuai[i][j] = 0;
		}
		for (i = 1;i < m + 1;i++)
		{
			for (j = 1;j < n + 1;j++)
			{
			   if (panduan(dikuai[i - 1][j], dikuai[i + 1][j], dikuai[i][j - 1], dikuai[i][j + 1], dikuai[i][j]) == 1)
			   {
				   System.out.printf("%d %d\n",i - 1,j - 1);
			   }
			}
		}
		return 0;

	}

}

