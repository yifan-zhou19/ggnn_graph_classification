package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] ROW = new int[100];
		int[] COL = new int[100];
		int row;
		int col;
		int[][] a = new int[100][100];
		int s = 0;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				ROW[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				COL[i] = Integer.parseInt(tempVar3);
			}

			for (row = 0;row < ROW[i];row++)
			{
				for (col = 0;col < COL[i];col++)
				{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					a[row][col] = Integer.parseInt(tempVar4);
				}
				}
			}


			for (col = 0;col < COL[i];col++)
			{
				s = s + a[0][col] + a[ROW[i] - 1][col];
			}
			for (row = 1;row < ROW[i] - 1;row++)
			{
				s = s + a[row][0] + a[row][COL[i] - 1];
			}
			System.out.printf("%d\n",s);
			s = 0;
		}

		return 0;
	}

}

