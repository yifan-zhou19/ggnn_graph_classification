package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[110][110];
		int row;
		int col;
		int i;
		int j = 0;
		int k = 0;
		int geshu = 0;
		int zong;
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
		zong = row * col;
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
		i = 0;
		while (col >= 1 && row >= 1)
		{
							 if (geshu == zong)
							 {
								 break;
							 }
							 for (j = k;j < col;j++)
							 {
											   System.out.printf("%d\n",a[k][j]);
											   geshu += 1;
							 }
							 if (geshu == zong)
							 {
								 break;
							 }
							 for (i = k + 1;i <= (row - 1);i++)
							 {
											   System.out.printf("%d\n",a[i][col - 1]);
											   geshu += 1;
							 }
							 if (geshu == zong)
							 {
								 break;
							 }
							 for (j = col - 2;j >= k;j--)
							 {
													System.out.printf("%d\n",a[row - 1][j]);
													geshu += 1;
							 }
							 if (geshu == zong)
							 {
								 break;
							 }
							 for (i = row - 2;i >= (k + 1);i--)
							 {
													 System.out.printf("%d\n",a[i][k]);
													 geshu += 1;
							 }
							 row -= 1;
							 col -= 1;
							 k += 1;

		}
		return 0;
	}
}

