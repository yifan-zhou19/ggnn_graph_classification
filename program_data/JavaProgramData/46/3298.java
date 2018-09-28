package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x = Integer.parseInt(tempVar2);
		}
		int[][] sz = new int[x][y];
		int c;
		int d;
		c = x * y;
		d = 0;
		for (int b = 0;b < y;b++)
		{
			for (int a = 0;a < x;a++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[a][b] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (int i = 0;i != -1;i++)
		{
		for (int a = i;a < x - i;a++)
		{
			System.out.printf("%d\n",sz[a][i]);
			sz[a][i] = 0;
			d++;
		}
		if (d == c)
		{
			break;
		}
		for (int b = i + 1;b < y - i;b++)
		{
			System.out.printf("%d\n",sz[x - i - 1][b]);
			sz[x - i - 1][b] = 0;
			d++;
		}
		if (d == c)
		{
			break;
		}
		for (int a = x - i - 2;a >= i;a--)
		{
			System.out.printf("%d\n",sz[a][y - i - 1]);
			sz[a][y - i - 1] = 0;
			d++;
		}
		if (d == c)
		{
			break;
		}
		for (int b = y - i - 2;b > i;b--)
		{
			System.out.printf("%d\n",sz[i][b]);
			sz[i][b] = 0;
			d++;
		}
		if (d == c)
		{
			break;
		}
		}
		return 0;
	}



}

