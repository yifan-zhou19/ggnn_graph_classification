package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] a = new int[1000][1000];
		int i;
		int j;
		int lon;
		int wid;
		int m;
		int c1 = 0;
		int c2 = 0;
		lon = 0,wid = 0;

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
			for (j = 0;j < n;j++)
			{
				if (a[i][j] == 0)
				{
					c1 = c1 + 1;

				if (c1 > 2)
				{

					lon = c1;
				}
					break;
				}
			}
		}
		for (j = 0;j < n;j++)
		{
			for (i = 0;i < n;i++)
			{
				if (a[i][j] == 0)
				{
					c2 = c2 + 1;

				if (c2 > 2)
				{

					wid = c2;
				}
					break;
				}

			}
		}
		m = (lon - 2) * (wid - 2);
		System.out.printf("%d\n",m);
		return 0;
	}

}

