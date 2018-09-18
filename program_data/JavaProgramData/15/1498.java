package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[1000][1000];
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
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
		int a1;
		int b1;
		int a2;
		int b2;
		int x;
		x = 0;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (sz[i][j] == 0)
				{
					a1 = i;
					b1 = j;
					x = 1;
					break;
				}
			}
			if (x == 1)
			{
				break;
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (sz[i][j] == 0)
				{
					a2 = i;
					b2 = j;
				}
			}
		}
		int s;
		s = (a2 - a1 - 1) * (b2 - b1 - 1);
		System.out.printf("%d",s);
		return 0;
	}
}

