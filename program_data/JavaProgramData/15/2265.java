package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int S;
		int notfind = 1;
		int x1 = 0;
		int y1 = 0;
		int x2 = 0;
		int y2 = 0;
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
			}
		}
		for (i = 0;i < n && notfind != 0;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] == 0)
				{
					x1 = i;
					y1 = j;
					notfind = 0;
					break;
				}
			}
		}
		for (i = x1;i < n;i++)
		{
			if (a[i][y1] != 0)
			{
				x2 = i - 1;
				break;
			}
			else
			{
				continue;
			}
		}
		for (j = y1;j < n;j++)
		{
			if (a[x2][j] != 0)
			{
				y2 = j - 1;
				break;
			}
			else
			{
				continue;
			}
		}
		//printf("%d %d %d %d\n",x1,y1,x2,y2);
		S = (x2 - x1 - 1) * (y2 - y1 - 1);
		System.out.printf("%d\n",S);
	}



}

