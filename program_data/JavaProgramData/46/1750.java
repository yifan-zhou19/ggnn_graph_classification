package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int row;
		int col;
		int i = 0;
		int j = 0;
		int[][] array = new int[100][100];
		int n = 0;
		int t = 0;
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
					array[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		i = 0;
		j = 0;
		while (true)
		{
			for (j = n;j <= col - 1 - n;j++)
			{
				System.out.printf("%d\n",array[i][j]);
				t++;
			}
			j = j - 1;
			if (t == row * col)
			{
				break;
			}
			for (i = 1 + n;i <= row - 1 - n;i++)
			{
				System.out.printf("%d\n",array[i][j]);
				t++;
			}
			i = i - 1;
			if (t == row * col)
			{
				break;
			}
			for (j = col - 2 - n;j >= n;j--)
			{
				System.out.printf("%d\n",array[i][j]);
				t++;
			}
			j = j + 1;
			if (t == row * col)
			{
				break;
			}
			for (i = row - 2 - n;i >= 1 + n;i--)
			{
				System.out.printf("%d\n",array[i][j]);
				t++;
			}
			i = i + 1;
			if (t == row * col)
			{
				break;
			}
			n++;

		}

	}
}

