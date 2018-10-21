package <missing>;

public class GlobalMembers
{
	public static int exchange(int[][] sz, int a, int b)
	{
		if (0 <= a != 0 && a <= 4 && 0 <= b != 0 && b <= 4)
		{
			int i;
			for (i = 0;i < 5;i++)
			{
				int e = sz[a][i];
				sz[a][i] = sz[b][i];
				sz[b][i] = e;
			}
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int[][] matrix = new int[5][5];
		int row;
		int col;
		for (row = 0;row < 5;row++)
		{
			for (col = 0;col < 5;col++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					matrix[row][col] = Integer.parseInt(tempVar);
				}
			}
		}
		int n;
		int m;
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
		int judge;
		judge = exchange(matrix, n, m);
		if (judge == 0)
		{
			System.out.print("error");
		}
		if (judge == 1)
		{
			for (row = 0;row < 5;row++)
			{
				for (col = 0;col < 4;col++)
				{
					System.out.printf("%d ",matrix[row][col]);
				}
				System.out.printf("%d\n",matrix[row][4]);
			}
		}
		return 0;
	}
}

