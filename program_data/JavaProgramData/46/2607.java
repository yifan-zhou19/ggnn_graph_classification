package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] array = new int[100][100];
		int i;
		int j;
		int row;
		int col;
		int num;
		int s;
		int k;
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
		if (row > 0 && row < 100 && col>0 && col < 100)
		{
			for (i = 0; i < row; i++)
			{
				for (j = 0; j < col; j++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						array[i][j] = Integer.parseInt(tempVar3);
					}
				}
			}

			for (i = 0, j = 0, num = 0; num < row * col; i++, j++) //????row*col???????
			{
				for (s = j; s <= (col - j - 1); s++)
				{
					System.out.printf("%d\n",array[i][s]); //???i????
					num++;
					if (num >= row * col)
					{
						break;
					}
				}
				if (num >= row * col)
				{
					break;
				}
				for (k = i + 1; k < (row - i - 1); k++)
				{
					System.out.printf("%d\n",array[k][col - j - 1]);
					num++;
					if (num >= row * col)
					{
						break;
					}
				}
				if (num >= row * col)
				{
					break;
				}
				for (s = col - j - 1; s > j; s--)
				{
					System.out.printf("%d\n",array[row - i - 1][s]);
					num++;
					if (num >= row * col)
					{
						break;
					}
				}
				if (num >= row * col)
				{
					break;
				}
				for (k = row - i - 1; k > i; k--)
				{
					System.out.printf("%d\n",array[k][j]); //??????
					num++;
					if (num >= row * col)
					{
						break;
					}
				}
				if (num >= row * col)
				{
					break;
				}

			}
		}
		return 0;
	}

}

