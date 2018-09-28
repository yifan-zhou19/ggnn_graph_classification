package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int k;
		int i;
		int j;
		int[][] sz = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
		for (int i = 0;i < row;i++)
		{
			for (int j = 0;j < col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (k = 0; row - k > k && col - k > k; k++)
		{
			for (i = k,j = k; j < col - k - 1; j++)
			{
				System.out.printf("%d\n", sz[i][j]);
			}
			for (; i < row - k - 1; i++)
			{
				System.out.printf("%d\n", sz[i][j]);
			}
			if (i == k || j == k)
			{
				System.out.printf("%d\n", sz[i][j]);
				break;
			}
			for (; j > k; j--)
			{
				System.out.printf("%d\n", sz[i][j]);
			}
			for (; i > k; i--)
			{
				System.out.printf("%d\n", sz[i][j]);
			}
		}
		return 0;
	}




}

