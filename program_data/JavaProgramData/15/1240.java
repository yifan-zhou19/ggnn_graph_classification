package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int x1 = -1;
		int y1 = -1;
		int x2 = -1;
		int y2 = -1;
		int[][] t = new int[500][500];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					t[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				if (t[i][j] == 0)
				{
					x1 = j;
					y1 = i;
					break;
				}
			}
			if (x1 != -1)
			{
			break;
			}
		}
		for (i = n - 1;i > 0;i--)
		{
			for (j = n - 1;j > 0;j--)
			{
				if (t[i][j] == 0)
				{
					x2 = j;
					y2 = i;
					break;
				}
			}
			if (x2 != -1)
			{
			break;
			}
		}
		System.out.printf("%d\n", (x2 - x1 - 1) * (y2 - y1 - 1));
		return 0;
	}


}

