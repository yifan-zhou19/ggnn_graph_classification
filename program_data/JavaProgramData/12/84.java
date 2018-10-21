package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] n = new int[100][16];
		int i;
		int j;
		int r;
		int p;

		for (i = 0; i < 100; i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n[i][0] = Integer.parseInt(tempVar);
			}
			if (n[i][0] == -1)
			{
				break;
			}

			for (j = 1; n[i][j - 1] != 0; j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					n[i][j] = Integer.parseInt(tempVar2);
				}
			}
			int t = 0;
			for (r = 0;r < j - 1;r++)
			{
				for (p = r + 1;p < j;p++)
				{
					if (n[i][p] == 2 * n[i][r])
					{
						t++;
						break;
					}
				}
			}
			for (r = j - 1;r > 0;r--)
			{
				for (p = r - 1;p >= 0;p--)
				{
					if (n[i][p] == 2 * n[i][r])
					{
						t++;
						break;
					}
				}
			}

			System.out.printf("%d\n",t);
		}
		return 0;
	}
}

