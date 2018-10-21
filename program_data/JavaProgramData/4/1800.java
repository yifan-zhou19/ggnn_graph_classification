package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int row;
		  int col;
		  int time = 0;
		  int n;
		  int i;
		  int j;
		  int[][] array = new int[100][100];
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
		  for (n = 0;n < row + col;n++)
		  {
								if (col < row)
								{
										   if (n < col)
										   {
													for (i = 0;i <= n;i++)
													{
													System.out.printf("%d\n",array[i][n - i]);
													}
										   }
										   else if (n < row)
										   {
												for (i = col - 1;i >= 0;i--)
												{
												System.out.printf("%d\n",array[n - i][i]);
												}
										   }
										   else
										   {
												for (i = col - 1;i > n - row;i--)
												{
												System.out.printf("%d\n",array[n - i][i]);
												}
										   }
								}
								else if (row < col)
								{
										   if (n < row)
										   {
													for (i = 0;i <= n;i++)
													{
													System.out.printf("%d\n",array[i][n - i]);
													}
										   }
										   else if (n < col)
										   {
												for (i = 0;i <= row - 1;i++)
												{
												System.out.printf("%d\n",array[i][n - i]);
												}
										   }
										   else
										   {
												for (i = col - 1;i > n - row;i--)
												{
												System.out.printf("%d\n",array[n - i][i]);
												}
										   }
								}
								else if (row == col)
								{
										   if (n < row)
										   {
													for (i = 0;i <= n;i++)
													{
													System.out.printf("%d\n",array[i][n - i]);
													}
										   }

										   else
										   {
												for (i = row - 1;i > n - col;i--)
												{
												System.out.printf("%d\n",array[n - i][i]);
												}
										   }
								}
		  }
	}

}

