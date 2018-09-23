package <missing>;

public class GlobalMembers
{
	public static int[][] sz = new int[1000][1000];
	public static int Main()
	{
		int n;
		int row;
		int col;
		int a;
		int b;
		int c;
		int d;
		int x;
		int y;
		int num;
		int e = 0;
		int f = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (row = 0;row < n;row++)
		{
			for (col = 0;col < n;col++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					sz[row][col] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (row = 0;row < n;row++)
		{
			for (col = 0;col < n;col++)
			{
				if (sz[row][col] == 0)
				{
					a = row;
					b = col;
					e = 1;
					break;
				}
			}
			if (e == 1)
			{
				break;
			}
		}
		for (row = n - 1;row >= 0;row--)
		{
			for (col = n - 1;col >= 0;col--)
			{
				if (sz[row][col] == 0)
				{
					c = row;
					d = col;
					f = 1;
					break;
				}
			}
			if (f == 1)
			{
				break;
			}
		}
		x = c - a - 1;
		y = d - b - 1;
		num = x * y;
		System.out.printf("%d\n",num);
		return 0;
	}

}

