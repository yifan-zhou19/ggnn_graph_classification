package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int row;
		int col;
		int[][] sz = new int[1000][1000];
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
					sz[row][col] = Integer.parseInt(tempVar2);
				}
			}
		}
		int a = 0;
		int b = 0;
		for (row = 0;row < n;row++)
		{
			for (col = 0;col < n - 1;col++)
			{
				if (b == 0)
				{
					if ((sz[row][col] == 0) && (sz[row][col + 1] == 0))
					{
						col = n;
					}
					else if ((sz[row][col] == 0) && (sz[row][col + 1] == 255))
					{
						a++;
						b = 1;
					}
				}
				else if (b == 1)
				{
					if ((sz[row][col] == 255) && (sz[row][col + 1] == 255))
					{
						a++;
					}
					else if ((sz[row][col] == 255) && (sz[row][col + 1] == 0))
					{
						col = n;
						b = 0;
					}
				}
			}
		}
		System.out.printf("%d",a);
		return 0;
	}

}

