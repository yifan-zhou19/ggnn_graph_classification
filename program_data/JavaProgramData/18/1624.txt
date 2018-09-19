package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int s;
		int i;
		int j;
		for (s = 1;s <= n;s++)
		{
						 int b = n;
						 int yi = 0;
						 int min = 10000;
						 int[][] a = new int[110][110];
						 int c = 2;
						 int[] bi = new int[110];
						 int[] bj = new int[110];
						 for (i = 1;i <= n;i++)
						 {
										  for (j = 1;j <= n;j++)
										  {
														   a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
										  }
						 }
						 for (b = n;b >= 2;b--)
						 {
										  for (i = 1;i <= n;i++)
										  {
														   if (bi[i] == 1)
														   {
															   continue;
														   }
														   for (j = 1;j <= n;j++)
														   {
																			if ((bj[j] == 0) && (a[i][j] <= min))
																			{
																			min = a[i][j];
																			}
														   }
														   if (min != 0)
														   {
																	 for (j = 1;j <= n;j++)
																	 {
																					  a[i][j] = a[i][j] - min;
																	 }
														   }
														   min = 10000;
										  }
										  min = 10000;
										  for (j = 1;j <= n;j++)
										  {
																			if (bj[j] == 1)
																			{
																				continue;
																			}
																			for (i = 1;i <= n;i++)
																			{
																							if ((bi[i] == 0) && (a[i][j] <= min))
																							{
																							 min = a[i][j];
																							}
																			}
																			 if (min != 0)
																			 {
																					   for (i = 1;i <= n;i++)
																					   {
																										 a[i][j] = a[i][j] - min;
																					   }
																			 }
																			 min = 100000;

										  }
										   yi = yi + a[c][c];
										   bi[c] = 1;
										   bj[c] = 1;
										   min = 10000;
										   c++;
						 }
						 System.out.print(yi);
						 System.out.print("\n");
		}
		return 0;
	}
}

