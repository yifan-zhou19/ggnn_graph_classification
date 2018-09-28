package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[][] array = new int[110][110];
	int[] result = new int[10000];
	int ROW;
	int COL;
	int n = 0;
	int i = 0;
	int k = 0;
	int j = 0;
	int s = 0;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				ROW = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				COL = Integer.parseInt(tempVar2);
			}
			for (i = 0;i < ROW;i++)
			{
				for (j = 0;j < COL;j++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						array[i][j] = Integer.parseInt(tempVar3);
					}
					s++;
				}
			}

			for (k = 0,n = 0;n < s;k++)
			{
				if (k % 4 == 0)
				{
					for (j = k / 4;j < COL - k / 4;j++,n++)
					{
					result[n] = array[k / 4][j];
					}
				}
				else if (k % 4 == 1)
				{
					for (j = k / 4 + 1;j < ROW - k / 4;j++,n++)
					{
					result[n] = array[j][COL - k / 4 - 1];
					}
				}
				else if (k % 4 == 2)
				{
					for (j = COL - k / 4 - 2;j >= k / 4;j--,n++)
					{
					result[n] = array[ROW - k / 4 - 1][j];
					}
				}
				else if (k % 4 == 3)
				{
					for (j = ROW - k / 4 - 2;j > k / 4;j--,n++)
					{
					result[n] = array[j][k / 4];
					}
				}
			}
			for (n = 0;n < s;n++)
			{
				System.out.printf("%d\n",result[n]);
			}
			return 0;
	}
}

