package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int col;
		int row;
		int max = 0;
		int k = 0;
		int i;
		int[][] a = new int[10][10];
		int c1;
		int r1;
		int i1;
		int l = 0;
		int j;
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
			max = -1;
			for (j = 0;j < col;j++)
			{
				if (a[i][j] > max)
				{
					r1 = i;
					c1 = j;
					max = a[i][j];
				}
			}
			for (i1 = 0;i1 < row;i1++)
			{
				if (a[r1][c1] > a[i1][c1])
				{
					break;
				}
			}
			if (i1 == row)
			{
				l = 1;
				System.out.printf("%d+%d\n",r1,c1);
			}
		}
		if (l == 0)
		{
			System.out.print("No\n");
		}




	}
}

