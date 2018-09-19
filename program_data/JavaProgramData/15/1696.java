package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int x1;
		int y1;
		int x2;
		int y2;
		int situ = 1;
		int[][] a = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
				if (a[i][j] == 0)
				{
					y2 = i;
					x2 = j;
				}
			}
		}
		for (i = 0;situ != 0;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] == 0)
				{
					x1 = j;
					y1 = i;
					situ = 0;
					break;
				}
				else
				{
					continue;
				}
			}
		}
		n = (x2 - x1 + 1) * (y2 - y1 + 1) - (2 * (x2 - x1 + 1) + 2 * (y2 - y1 + 1) - 4);
		System.out.printf("%d",n);
		return 0;

	}
}

