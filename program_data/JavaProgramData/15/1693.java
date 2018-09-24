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

		for (int row = 0;row < n;row++)
		{
			for (int col = 0;col < n;col++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					sz[row][col] = Integer.parseInt(tempVar2);
				}
			}
		}

		int a1 = 100;
		int b1 = 100;
		int a2 = 0;
		int b2 = 0;

		for (int r = 0;r < n;r++)
		{
			for (int c = 0;c < n;c++)
			{
				if (sz[r][c] == 0)
				{
					a1 = r;
					b1 = c;
					break;
				}
			}
			if (a1 != 100 || b1 != 100)
			{
				break;
			}
		}

		for (int rr = n - 1;rr >= 0;rr--)
		{
			for (int cc = n - 1;cc >= 0;cc--)
			{
				if (sz[rr][cc] == 0)
				{
					a2 = rr;
					b2 = cc;
					break;
				}
			}
			if (a2 != 0 || b2 != 0)
			{
				break;
			}
		}

		int s;
		s = (a2 - a1 - 1) * (b2 - b1 - 1);

		System.out.printf("%d",s);

		return 0;
	}
}

