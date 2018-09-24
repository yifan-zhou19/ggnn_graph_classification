package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int c;
		int d;
		int e;
		int f;
		int g;
		int[][] array = new int[8][8];
		int[] a = new int[8];
		int[] b = new int[8];
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
		for (c = 0; c < row; c++)
		{
			for (d = 0; d < col; d++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					(array[c][d]) = Integer.parseInt(tempVar3);
				}
			}
		}
		for (c = 0; c < row; c++)
		{
			a[c] = 0;
			for (d = 0; d < col; d++)
			{
				if (array[c][d] > a[c])
				{
					a[c] = array[c][d];
				}
			}
		}
		for (d = 0; d < col; d++)
		{
			b[d] = 100000;
			for (c = 0; c < row; c++)
			{
				if (array[c][d] < b[d])
				{
					b[d] = array[c][d];
				}
			}
		}
		for (e = 0; e < row; e++)
		{
			for (f = 0; f < col; f++)
			{
				if (a[e] == b[f])
				{
					g = 0;
					System.out.printf("%d+%d", e, f);
				}
			}
		}
		if (g != 0)
		{
			System.out.print("No");
		}
		return 0;
	}
}

