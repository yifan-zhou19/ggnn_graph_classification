package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int row;
		int col;
		int i;
		int j;
		int m;
		int k;
		int n;
		int x;
		int y;
		int s = 0;
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
						  i = row - 1;
						  j = col - 1;
						  for (k = 0;k < 100;k++)
						  {
							  x = k;
						  y = k;
						  m = k;
						  n = k;
											for (x = k;x <= j - k;x++)
											{
												System.out.printf("%d\n",a[k][x]);
											s++;
											}
											if (s == (i + 1) * (j + 1))
											{
												break;
											}
											for (y = k + 1;y <= i - k;y++)
											{
												System.out.printf("%d\n",a[y][j - k]);
											s++;
											}
											if (s == (i + 1) * (j + 1))
											{
											   break;
											}
											for (m = j - k - 1;m >= k;m--)
											{
												System.out.printf("%d\n",a[i - k][m]);
											s++;
											}
											if (s == (i + 1) * (j + 1))
											{
												break;
											}
											for (n = i - k - 1;n >= k + 1;n--)
											{
												System.out.printf("%d\n",a[n][k]);
											s++;
											}
											if (s == (i + 1) * (j + 1))
											{
												break;
											}
						  }
											return 0;
	}
}

