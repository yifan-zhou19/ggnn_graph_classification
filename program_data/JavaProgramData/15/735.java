package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] b = new int[1000][1000];
		int i;
		int k;
		int s;
		int x1;
		int x2;
		int y1;
		int y2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (k = 0;k < n;k++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					(b[i][k]) = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (k = 0;k < n;k++)
			{
				if (b[i][k] == 0 && b[i + 1][k] == b[i][k] && b[i][k + 1] == b[i][k])
				{
					x1 = i;
					y1 = k;
				}
				if (b[i][k] == 0 && b[i - 1][k] == b[i][k] && b[i][k - 1] == b[i][k])
				{
					x2 = i;
					y2 = k;
				}
			}
		}
		s = (x2 - x1 - 1) * (y2 - y1 - 1);
		System.out.printf("%d",s);
		return 0;
	}
}

