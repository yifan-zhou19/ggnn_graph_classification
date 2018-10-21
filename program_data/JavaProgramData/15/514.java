package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[][] a = new int[1000][1000];
		int count = 0;
		int wid = 0;
		int x;
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
					count = count + 1;
				}
			}
			if (count > 2)
			{
				count = count;
				break;
			}
		}
	for (j = 0;j < n;j++)
	{
		for (i = 0;i < n;i++)
		{
				if (a[i][j] == 0)
				{
					wid = wid + 1;
				}
		}
			if (wid > 2)
			{
				wid = wid;
				break;
			}
	}

		x = (count - 2) * (wid - 2);
		System.out.printf("%d",x);
		return 0;
	}

}

