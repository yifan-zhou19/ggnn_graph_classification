package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[][] array = new int[8][8];
	int ROW;
	int COL;
	int i = 0;
	int j = 0;
	int max = 0;
	int min = 0;
	int m = 0;
	int n = 0;
	int s = 0;
	int k = 0;
	int flag = 0;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				ROW = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(",");
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
				}
			}
			for (i = 0;i < ROW;i++)
			{
				for (j = 0;j < COL;j++)
				{
						if (array[i][j] > max)
						{
							max = array[i][j];
							m = i;
							n = j;
						}
				}
				for (k = 0;k < ROW && flag == 0;k++)
				{
					if (array[m][n] > array[k][n])
					{
						flag = 1;
					}
				}
				if (flag == 0)
				{
					System.out.printf("%d+%d",m,n);
				}
				else
				{
					s++;
				}
			}
			if (s == ROW)
			{
				System.out.print("No");
			}
			return 0;
	}
}

