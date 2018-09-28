package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
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
		int[][] a = new int[100][100];
		int i;
		int t;
		int count = 0;
		for (i = 0;i < row;i++)
		{
			for (t = 0;t < col;t++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][t] = Integer.parseInt(tempVar3);
				}
			}
		}

		int k = 0;
		int j = 0;
		int m = 0;
		if (row % 2 == 0)
		{
		for (k = 0;k <= (row / 2 - 1);k++)
		{
			for (j = k;j <= (col - 1 - k);j++)
			{
				System.out.printf("%d\n",a[k][j]);
				count++;
			}
			if (count == row * col)
			{
				break;
			}
			for (m = k + 1;m <= row - 2 - k;m++)
			{
				System.out.printf("%d\n",a[m][col - 1 - k]);
				count++;
			}
				if (count == row * col)
				{
				break;
				}

			for (j = col - 1 - k;j >= k;j--)
			{
				System.out.printf("%d\n",a[row - 1 - k][j]);
				count++;
			}
				if (count == row * col)
				{
				break;
				}
			for (m = row - 2 - k;m >= k + 1;m--)
			{
				System.out.printf("%d\n",a[m][k]);
				count++;

			}
				if (count == row * col)
				{
				break;
				}
		}
		}
		else
		{

			row = row - 1;
			for (k = 0;k <= row / 2;k++)
			{
			for (j = k;j <= col - 1 - k;j++)
			{
				System.out.printf("%d\n",a[k][j]);
				count++;
			}
				if (count == (row + 1) * col)
				{
					break;
				}
			for (m = k + 1;m <= row - k - 1;m++)
			{
				System.out.printf("%d\n",a[m][col - 1 - k]);
				count++;
			}
				if (count == (row + 1) * col)
				{
					break;
				}
			for (j = col - 1 - k;j >= k;j--)
			{
				System.out.printf("%d\n",a[row - k][j]);
				count++;
			}
				if (count == (row + 1) * col)
				{
					break;
				}
			for (m = row - 1 - k;m >= k + 1;m--)
			{
				System.out.printf("%d\n",a[m][k]);
				count++;
			}
				if (count == (row + 1) * col)
				{
					break;
				}
			}
		}

		return 0;
	}


}

