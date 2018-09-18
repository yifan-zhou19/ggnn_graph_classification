package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] cancer = new int[100][100];
		int n;
		int i;
		int j;
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
					cancer[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		int a;
		int b;
		int c;
		int d;
		int m;
		int x;
		for (m = 0;m < n;m++)
		{
			for (x = 0;x < n;x++)
			{
				if (cancer[m][x] == 0)
				{
					if ((cancer[m - 1][x] == 255) && (cancer[m][x - 1] == 255) && (cancer[m + 1][x + 1] == 255))
					{
						a = m;
						b = x;
					}
					else if ((cancer[m + 1][x] == 255) && (cancer[m][x + 1] == 255) && (cancer[m - 1][x - 1] == 255))
					{
						c = m,d = x;
					}
				}
			}
		}
		int e;
		e = (c - a - 1) * (d - b - 1);
		System.out.printf("%d\n",e);
		return 0;
	}
}

