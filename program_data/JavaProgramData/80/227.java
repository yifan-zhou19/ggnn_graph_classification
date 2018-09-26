package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] x = new int[2][4];
		int i;
		int y;
		int m;
		int d;
		int minus;
		for (i = 0;i <= 1;i++)
		{
					String tempVar = ConsoleInput.scanfRead();
					if (tempVar != null)
					{
						x[i][0] = Integer.parseInt(tempVar);
					}
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						x[i][1] = Integer.parseInt(tempVar2);
					}
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						x[i][2] = Integer.parseInt(tempVar3);
					}
					y = x[i][0];
					m = x[i][1];
					d = x[i][2];
				if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
				{
													  if (m <= 2)
													  {
														  x[i][3] = (y - 1) / 4 * 1461 + (y - 1) % 4 * 365 - (y - 1) / 100 + (y - 1) / 400 + (m - 1) * 31 + d;
													  }
													  else if (m <= 8)
													  {
														  x[i][3] = (y - 1) / 4 * 1461 + (y - 1) % 4 * 365 - (y - 1) / 100 + (y - 1) / 400 + (m - 1) / 2 * 61 + (m - 1) % 2 * 31 - 1 + d;
													  }
													  else
													  {
														  x[i][3] = (y - 1) / 4 * 1461 + (y - 1) % 4 * 365 - (y - 1) / 100 + (y - 1) / 400 + 213 + (m - 8) / 2 * 61 + (m - 8) % 2 * 31 + d;
													  }
				}
														  else
														  {
																if (m <= 2)
																{
																	x[i][3] = (y - 1) / 4 * 1461 + (y - 1) % 4 * 365 - (y - 1) / 100 + (y - 1) / 400 + (m - 1) * 31 + d;
																}
													  else if (m <= 8)
													  {
														  x[i][3] = (y - 1) / 4 * 1461 + (y - 1) % 4 * 365 - (y - 1) / 100 + (y - 1) / 400 + (m - 1) / 2 * 61 + (m - 1) % 2 * 31 - 2 + d;
													  }
													  else
													  {
														  x[i][3] = (y - 1) / 4 * 1461 + (y - 1) % 4 * 365 - (y - 1) / 100 + (y - 1) / 400 + 212 + (m - 8) / 2 * 61 + (m - 8) % 2 * 31 + d;
													  }
														  }
		}
						 minus = Math.abs(x[0][3] - x[1][3]);
						 System.out.printf("%d\n",minus);
	return 0;
	}
}

