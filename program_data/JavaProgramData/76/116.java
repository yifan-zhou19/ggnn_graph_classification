package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int[][] sz = new int[50000][2];
		 int n;
		 int row;
		 int col;
		 int max;
		 int min;
		 int a;
		 double i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (row = 0;row < n;row++)
		{
			for (col = 0;col < 2;col++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					sz[row][col] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (row = 0;row < n;row++)
		{
			if (row == 0)
			{
				min = sz[row][0];
			}
			else
			{
				if (sz[row][0] < min)
				{
					min = sz[row][0];
				}
			}
		}
		for (row = 0;row < n;row++)
		{
			if (row == 0)
			{
				max = sz[row][1];
			}
			else
			{
				if (sz[row][1] > max)
				{
					max = sz[row][1];
				}
			}
		}
		for (i = min;i <= max;i = i + 0.5)
		{
			for (row = 0;row < n;row++)
			{
				if (i >= sz[row][0] != 0 && i <= sz[row][1])
				{
					break;
				}
				else if (row == n - 1)
				{
					System.out.print("no");
					return 0;
				}
			}
			if (i == max)
			{
				System.out.printf("%d %d",min,max);
			}
		}

		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			i = Double.parseDouble(tempVar3);
		}
		return 0;
	}


}

