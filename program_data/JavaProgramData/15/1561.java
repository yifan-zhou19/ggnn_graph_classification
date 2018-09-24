package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[1000][1000];
	public static int Main()
	{
		int n;
		int i;
		int j;
		int s = 0;
		int t = 0;
		int q;
		int mianji;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			q = 0;
			for (j = 0;j < n;j++)
			{
				if (a[i][j] == 0)
				{
					s++;
					q = 1;
				}
			}
			if (q == 1)
			{
				break;
			}
		}
		for (j = 0;j < n;j++)
		{
			q = 0;
			for (i = 0;i < n;i++)
			{
				if (a[i][j] == 0)
				{
					t++;
					q = 1;
				}
			}
			if (q == 1)
			{
				break;
			}
		}
		mianji = (t - 2) * (s - 2);
		System.out.printf("%d",mianji);
		return 0;
	}

}

