package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[][] liu = new int[100][100];
		int i;
		int j;
		int p;
		int x1;
		int x2;
		int y1;
		int y2;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					liu[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (liu[i][j] == 0 & liu[i + 1][j] == 0 & liu[i][j + 1] == 0)
				{
					x1 = i;
					y1 = j;
				}
				if (liu[i][j] == 0 & liu[i - 1][j] == 0 & liu[i][j - 1] == 0)
				{
					x2 = i;
				y2 = j;
				}

			}
		}
		m = (x2 - x1 - 1) * (y2 - y1 - 1);
		System.out.printf("%d",m);
	}
}

