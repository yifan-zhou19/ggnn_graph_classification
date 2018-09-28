package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void paixu(int a[][100],int x,int y);
		int i;
		int j;
		int[][] a = new int[100][100];
		int col;
		int row;
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
		paixu(a, row, col);
	}

	public static void paixu(int[][] a, int x, int y)
	{
		int sum = 0;
		int i;
		int j;
		int k;
		k = x + y;
		for (sum = 0;sum <= k;sum++)
		{
			for (i = 0;i <= sum;i++)
			{
				j = sum - i;
				if (i < x && j < y)
				{
					System.out.printf("\n%d",a[i][j]);
				}
			}
		}
	}

}

