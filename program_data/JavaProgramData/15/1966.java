package <missing>;

public class GlobalMembers
{
	public static int[][] sz = new int[1000][1000];
	public static int Main()
	{
		int n;
		int i;
		int j;
		int a1;
		int a2;
		int b1;
		int b2;
		int c;
		int d = 0;
		int e = 0;
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
					sz[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (sz[i][j] == 0)
				{
					a1 = i;
					b1 = j;
					d = 1;
					break;
				}
			}
			if (d == 1)
			{
				break;
			}
		}
		for (j = n - 1;j > b1;j--)
		{
			for (i = n - 1;i > a1;i--)
			{
				if (sz[i][j] == 0)
				{
					a2 = i;
					b2 = j;
					e = 1;
					break;
				}
			}
			if (e == 1)
			{
				break;
			}
		}
		c = (a2 - a1 - 1) * (b2 - b1 - 1);
		System.out.printf("%d",c);
		return 0;
	}



}

