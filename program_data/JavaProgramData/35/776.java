package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[8][8];
		int row;
		int col;
		int i;
		int j;
		int e;
		int t;
		int g;
		int l = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < row;i++)
		{
			g = 0;
			for (j = 0;j < col;j++)
			{
				if (a[i][g] < a[i][j])
				{
					g = j;
				}
			}
			t = 0;
			for (e = 0;e < row;e++)
			{
				if (a[i][g] < a[e][g])
				{
					t++;
				}
			}
			if (t == row - 1)
			{
				System.out.printf("%d+%d",i,g);
			}
			else
			{
				l++;
			}
			if (l == row)
			{
				System.out.print("No");
			}
		}
		return 0;
	}
}

