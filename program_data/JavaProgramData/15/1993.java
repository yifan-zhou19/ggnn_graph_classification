package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int a;
		int b;
		int x;
		int y;
		int s;
		a = 0;
		b = 0;
		x = -1;
		y = -1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[][] tx = new int[1000][1000];
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					tx[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (tx[i][j] == 0)
				{
					x = j;
					y = i;
					break;
				}
			}
			if ((x == j) && (y == i))
			{
				break;
			}
		}
		for (x = j;x < n;x++)
		{
			if (tx[x][i] == 0)
			{
				a = a + 1;
			}
		}
		for (y = i;y < n;y++)
		{
			if (tx[j][y] == 0)
			{
				b = b + 1;
			}
		}
		s = a * b - 2 * (a + b - 2);
		System.out.printf("%d",s);
		return 0;
	}

}

