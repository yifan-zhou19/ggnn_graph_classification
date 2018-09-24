package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[8][8];
		int[][] b = new int[8][8];
		int n;
		int m;
		int i;
		int j;
		int k;
		int x;
		int l;
		int y = 0;
		int h;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead(null, 5);
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
				b[i][j] = a[i][j];
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m - 1;j++)
			{
				if (a[i][j] > a[i][j + 1])
				{
					x = a[i][j];
					a[i][j] = a[i][j + 1];
					a[i][j + 1] = x;
				}
			}
			for (l = 0;l < n;l++)
			{
				if (b[i][l] == a[i][m - 1])
				{
					break;
				}
			}
			k = 0;
			for (h = 0;h < n;h++)
			{
				if (b[h][l] >= b[i][l])
				{
					k++;
				}
			}
			if (k == n)
			{
				y++;
			}
			if (y > 0)
			{
				System.out.printf("%d+%d",i,l);
				break;
			}
		}
		if (y == 0)
		{
			System.out.print("No");
		}
	}
}

