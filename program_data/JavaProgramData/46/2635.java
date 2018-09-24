package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[][] a = new int[100][100];
		int row;
		int col;
		int i;
		int j;
		int n = 0;
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
		j = 0;
		do
		{
			for (i = 0 + j;i < col - j;i++)
			{
				System.out.printf("%d\n",a[j][i]);
				n++;
			}
			if (n == row * col)
			{
				break;
			}
			for (i = j + 1;i < row - j;i++)
			{
				System.out.printf("%d\n",a[i][col - 1 - j]);
				n++;
			}
			if (n == row * col)
			{
				break;
			}
			for (i = col - 2 - j;i > 0 + j;i--)
			{
				System.out.printf("%d\n",a[row - j - 1][i]);
				n++;
			}
			if (n == row * col)
			{
				break;
			}
			for (i = row - j - 1;i > 0 + j;i--)
			{
				System.out.printf("%d\n",a[i][j]);
				n++;
			}
			if (n == row * col)
			{
				break;
			}
			j++;
		} while (n != row * col);
	}
}

