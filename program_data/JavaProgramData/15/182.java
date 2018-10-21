package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[1000][1000];
		int h1;
		int h2;
		int l1;
		int l2;
		int c = 0;
		int b = 0;
		int n;
		int i;
		int j;
		int h;
		int k;
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
		for (h = 0;h < n;h++)
		{
			for (k = 0;k < n;k++)
			{
				if (a[h][k] == 0)
				{
					h1 = h;
					l1 = k;
					c = 1;
					break;
				}
			}
		if (c == 1)
		{
			break;
		}
		}
		for (i = n - 1;i > 0;i--)
		{
			for (j = n - 1;j > 0;j--)
			{
				if (a[i][j] == 0)
				{
					h2 = i;
					l2 = j;
					b = 1;
					break;
				}
			}
		if (b == 1)
		{
			break;
		}
		}
		System.out.printf("%d\n",(h2 - h1 - 1) * (l2 - l1 - 1));
		return 0;
	}

}

