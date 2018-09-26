package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] x = new int[100][100];
		int row;
		int col;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
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
					x[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		int s = 0;
		int a = row - 1;
		int b = 0;
		int c = col - 1;
		while (s <= a != 0 && b <= c)
		{
			if (s < a && b < c)
			{
				for (i = b;i < c;i++)
				{
					System.out.printf("%d\n",x[s][i]);
				}
				for (i = s;i < a;i++)
				{
					System.out.printf("%d\n",x[i][c]);
				}
				for (i = c;i > b;i--)
				{
					System.out.printf("%d\n",x[a][i]);
				}
				for (i = a;i > s;i--)
				{
					System.out.printf("%d\n",x[i][b]);
				}
			}
			else if (s == a)
			{
				for (i = b;i <= c;i++)
				{
					System.out.printf("%d\n",x[s][i]);
				}
			}
			else
			{
				for (i = s;i <= a;i++)
				{
					System.out.printf("%d\n",x[i][b]);
				}
			}
			s = s + 1;
			a = a - 1;
			b = b + 1;
			c = c - 1;
		}
		return 0;
	}
}

