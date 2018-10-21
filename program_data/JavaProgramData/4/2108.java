package <missing>;

public class GlobalMembers
{
	public static int[][] num = new int[101][101];
	public static int Main()
	{
		int i = 0;
		int j = 1;
		int k = 1;
		int x;
		int y;
		int row;
		int col;
		int n = 1;
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
		for (x = 0;x <= row - 1;x++)
		{
			for (y = 0;y <= col - 1;y++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					num[x][y] = Integer.parseInt(tempVar3);
				}
			}
		}
		System.out.printf("%d\n",num[0][0]);
		while (n < row * col)
		{
			int flag = 0;
			while (j >= 0 && i <= row - 1 && j <= col - 1)
			{
				System.out.printf("%d\n",num[i][j]);
				i++;
				j--;
				n++;
				flag = 1;
			}
			if (flag == 1)
			{
			k++;
			}
			if (k <= col - 1)
			{
				i = 0;
				j = k;
			}
			else
			{
				i = k - col + 1;
				j = col - 1;
			}
		}
		return 0;
	}
}

