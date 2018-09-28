package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int row;
		int col;
		int t;
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
				a[i][j] = Integer.parseInt(tempVar3);
			}
		}
	}
		 row -= 1;
		 col -= 1;
		 t = row + col;
		 for (i = 0;i <= t;i++)
		 {
			 for (j = 0;j <= i;j++)
			 {
			 if (j > row || (i - j) > col)
			 {
		 continue;
			 }
			 System.out.printf("%d\n",a[j][i - j]);
			 }
		 }
		return 0;
	}

}

