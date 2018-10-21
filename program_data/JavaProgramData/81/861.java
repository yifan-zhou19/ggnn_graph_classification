package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int a;
		int b;
		int c;
		int d;
		int e;
		int row;
		int col;
		int[][] sz = new int[ROW][COL];
		for (row = 0;row < ROW;row++)
		{
			for (col = 0;col < COL;col++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					sz[row][col] = Integer.parseInt(tempVar);
				}
			}
		}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				m = Integer.parseInt(tempVar3);
			}
				if (n > 4 || n < 0 || m>4 || m < 0)
				{
					System.out.print("error");
				}
				else
				{
					a = sz[n][0];
					b = sz[n][1];
					c = sz[n][2];
					d = sz[n][3];
					e = sz[n][4];
					sz[n][0] = sz[m][0];
					sz[n][1] = sz[m][1];
					sz[n][2] = sz[m][2];
					sz[n][3] = sz[m][3];
					sz[n][4] = sz[m][4];
					sz[m][0] = a;
					sz[m][1] = b;
					sz[m][2] = c;
					sz[m][3] = d;
					sz[m][4] = e;
		for (row = 0;row < ROW;row++)
		{
			System.out.print("\n");
			for (col = 0;col < COL - 1;col++)
			{
				System.out.printf("%d",sz[row][col]);
			System.out.print(" ");
			}
			System.out.printf("%d",sz[row][4]);
		}
				}
	return 0;
	}
}

