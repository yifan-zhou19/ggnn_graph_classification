package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] array = new int[100][100];
		int i;
		int j;
		int row;
		int col;
		int h = 0;
		int n;
		int k;
		int r;
		int c;
		int m;
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
		r = row;
		c = col;
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
		if (r <= c)
		{
			n = (r * 2 - 1) / 4;
			m = 2 * r - 1;
		}
		else
		{
			n = (c * 2) / 4;
			m = c * 2;
		}

			for (k = 0;k < n;k++)
			{
				for (i = h,j = h;j < col;j++)
				{
					System.out.printf("%d\n",array[i][j]);
				}
				for (j = col - 1,i = h + 1;i < row;i++)
				{
					System.out.printf("%d\n",array[i][j]);
				}
				for (i = row - 1,j = col - 2;j >= h;j--)
				{
					System.out.printf("%d\n",array[i][j]);
				}
				for (j = h,i = row - 2;i >= h + 1;i--)
				{
					System.out.printf("%d\n",array[i][j]);
				}
				h++;
				col--;
				row--;
			}

			if (m % 4 == 1)
			{
				for (i = h,j = h;j < col;j++)
				{
					System.out.printf("%d\n",array[i][j]);
				}
			}
			if (m % 4 == 2)
			{
				for (i = h,j = h;j < col;j++)
				{
					System.out.printf("%d\n",array[i][j]);
				}
				for (j = col - 1,i = h + 1;i < row;i++)
				{
					System.out.printf("%d\n",array[i][j]);
				}
			}
			if (m % 4 == 3)
			{
				for (i = h,j = h;j < col;j++)
				{
					System.out.printf("%d\n",array[i][j]);
				}
				for (j = col - 1,i = h + 1;i < row;i++)
				{
					System.out.printf("%d\n",array[i][j]);
				}
				for (i = row - 1,j = col - 2;j >= h;j--)
				{
					System.out.printf("%d\n",array[i][j]);
				}
			}


	}


}

