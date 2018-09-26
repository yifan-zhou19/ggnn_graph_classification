package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[8][8];
		int m;
		int n;
		int row;
		int col;
		int a = 0;
		int b;
		int c;
		int d = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (int i = 0;i < m;i++)
		{
			for (int j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		row = 0;
		while (row < m)
		{
			a = sz[row][0];
			b = 0;
			for (col = 1;col < n;col++)
			{
				if (a < sz[row][col])
				{
					a = sz[row][col];
					b = col;
				}
			}
			for (col = b,row = 1;row < m;row++)
			{
				c = sz[0][col];
				if (c > sz[row][col])
				{
					c = sz[row][col];
					d = row;
				}
			}
			if (a == c)
			{
				System.out.printf("%d""+""%d",d,b);
				break;
			}
			else
			{
				row++;
				a = 0;
			}
		}
		if (a == 0)
		{
			System.out.print("No");
		}
		return 0;
	}

}

