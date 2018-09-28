package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[100][100];
		int i;
		int j;
		int k;
		int x;
		int y;
		int row;
		int col;
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
		for (i = 1;i <= row;i++)
		{
			for (j = 1;j <= col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		x = 0;
		y = row * col;
		for (k = 0;;k++)
		{
		for (j = 1 + k;j <= (col - k);j++)
		{
			System.out.printf("%d\n",a[1 + k][j]);
			x++;
			if (x == y)
			{
				break;
			}
		}
		if (x == y)
		{
			break;
		}
		for (i = 2 + k;i <= (row - k);i++)
		{
			System.out.printf("%d\n",a[i][col - k]); //??
			x++;
			if (x == y)
			{
				break;
			}
		}
		if (x == y)
		{
			break;
		}
		for (j = (col - 1 - k);j > k;)
		{
			System.out.printf("%d\n",a[row - k][j]); //??
			j = j - 1;
			x++;
			if (x == y)
			{
				break;
			}
		}
		if (x == y)
		{
			break;
		}
		for (i = (row - 1 - k);i > (1 + k);)
		{
			System.out.printf("%d\n",a[i][1 + k]); //??
			i = i - 1;
			x++;
			if (x == y)
			{
				break;
			}
		}
		if (x == y)
		{
			break;
		}
		}
	}


}

