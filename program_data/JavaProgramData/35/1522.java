package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[][] matrix = new int[8][8];
		int a;
		int b;
		int row;
		int col;
		int n;
		int m;
		int p;
		int roww;
		int coll;
		int decide;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		a = a - 1;
		b = b - 1;
		decide = 0;
		for (row = 0;row <= a;row++)
		{
			for (col = 0;col <= b;col++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					matrix[row][col] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (row = 0;row <= a;row++)
		{
			for (col = 0;col <= b;col++)
			{
				n = matrix[row][col];
				m = 0;
				for (roww = 0;roww <= a;roww++)
				{
					if (n < matrix[roww][col])
					{
						m++;
					}
				}
				p = 0;
				for (coll = 0;coll <= b;coll++)
				{
					if (n > matrix[row][coll])
					{
						p++;
					}
				}
				if (m == a && p == b)
				{
					System.out.printf("%d+%d",row,col);
					decide = 1;

				}
			}
		}
		if (decide == 0)
		{
			System.out.print("No");
		}
	}


}

