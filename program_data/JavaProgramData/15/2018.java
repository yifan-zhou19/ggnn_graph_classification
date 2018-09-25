package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[][] sz = new int[100][100];
		int i;
		int j;
		int a;
		int b;
		int c;
		int d;
		int x;
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
		int tag;
		for (i = 0;i < n;i++)
		{
			tag = 0;
			for (j = 0;j < n;j++)
			{
				if ((sz[i][j] == 0) && (sz[i][j - 1] != 0) && (sz[i - 1][j] != 0))
				{
					a = i;
					b = j;
					tag = 1;
					break;
				}
			}
			if (tag == 1)
			{
				break;
			}
		}
		for (i = n - 1;i >= 0;i--)
		{
			for (j = n - 1;j >= 0;j--)
			{
				if ((sz[i][j] == 0) && (sz[i + 1][j] != 0) && (sz[i][j + 1] != 0))
				{
					c = i;
					d = j;
					tag = 2;
					break;
				}
			}
			if (tag == 2)
			{
				break;
			}
		}
		x = (c - a - 1) * (d - b - 1);
		System.out.printf("%d",x);
		return 0;
	}


}

