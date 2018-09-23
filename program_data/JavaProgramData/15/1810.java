package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] sz = new int[100][100];
		int r;
		int s;
		int p;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int row = 0;row < n;row++)
		{
			for (int col = 0;col < n;col++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					(sz[row][col]) = Integer.parseInt(tempVar2);
				}
			}
		}
		for (int a = 0;a < n;a++)
		{
			for (int b = 0;b < n;b++)
			{
				if (sz[a][b] == 0)
				{
					r = a;
					s = b;
					break;
				}
				else
				{
					continue;
				}
			}
		}
		for (int c = n - 1;c >= 0;c--)
		{
			for (int d = n - 1;d >= 0;d--)
			{
				if (sz[c][d] == 0)
				{
					p = c;
					q = d;
					break;
				}
				else
				{
					continue;
				}
			}
		}
		int e = (r - p - 1) * (q - s - 1);

		System.out.printf("%d",e);
		return 0;
	}
}

