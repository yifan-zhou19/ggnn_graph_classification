package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] array = new int[100][100];
		int row;
		int col;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		int a;
		int x;
		int y;
		int z = 0;
		for (row = 0;row < m;row++)
		{
			for (col = 0;col < n;col++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					array[row][col] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (a = 0;a < m + 1 / 2 && a < n + 1 / 2;a++)
		{
			x = m - a;
			y = n - a;
			for (col = a;col < y;col++)
			{
				System.out.printf("%d\n",array[a][col]);
				z += 1;
			}
			if (z >= m * n)
			{
		break;
			}
			for (row = a + 1;row < x;row++)
			{
				System.out.printf("%d\n",array[row][y - 1]);
				z += 1;
			}
			if (z >= m * n)
			{
		break;
			}
			for (col = y - 2;col > a - 1;col--)
			{
				System.out.printf("%d\n",array[x - 1][col]);
				z += 1;
			}
			if (z >= m * n)
			{
		break;
			}
			for (row = x - 2;row > a;row--)
			{
				System.out.printf("%d\n",array[row][a]);
				z += 1;
			}
			if (z >= m * n)
			{
		break;
			}
		}
		return 0;
	}

}

