package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[][] points = new int[100][100];
		int n;
		int row;
		int col;
		int sum = 0;
		int i = 0;
		int SUM = 0;
		int j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (row = 0;row < n;row++)
		{
			for (col = 0;col < n;col++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					points[row][col] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (row = 0;row < n;row++)
		{
			sum = 0;
			for (col = 0;col < n;col++)
			{
				sum += points[row][col];
			}
			if (sum < n * 255)
			{
				i++;
			}
		}
		for (col = 0;col < n;col++)
		{
			SUM = 0;
			for (row = 0;row < n;row++)
			{
				SUM += points[row][col];
			}
			if (SUM < n * 255)
			{
				j++;
			}
		}
		System.out.printf("%d",(i - 2) * (j - 2));
	}
}

