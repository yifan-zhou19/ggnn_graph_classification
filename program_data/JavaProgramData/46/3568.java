package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int h;
		int l;
		int i;
		int j;
		int n;
		int t = 0;
		int[][] sz = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			h = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			l = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < h;i++)
		{
			for (j = 0;j < l;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (n = 0;;n++)
		{
			for (i = n,j = n;j < l - n;j++)
			{
				System.out.printf("%d\n",sz[i][j]);
				t++;
			}
			if (t == h * l)
			{
				break;
			}
			for (j = l - 1 - n,i = 1 + n;i < h - n;i++)
			{
				System.out.printf("%d\n",sz[i][j]);
				t++;
			}
			if (t == h * l)
			{
				break;
			}
			for (i = h - 1 - n,j = l - 2 - n;j >= n;j--)
			{
				System.out.printf("%d\n",sz[i][j]);
				t++;
			}
			if (t == h * l)
			{
				break;
			}
			for (j = n,i = h - 2 - n;i > n;i--)
			{
				System.out.printf("%d\n",sz[i][j]);
				t++;
			}
			if (t == h * l)
			{
				break;
			}
		}
		return 0;
	}

}

