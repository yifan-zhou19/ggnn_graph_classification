package <missing>;

public class GlobalMembers
{
	/*
	 * d.cpp
	 *
	 *  Created on: 2013-12-13
	 *      Author: de
	 */
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] data = new int[m][n];
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				data[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (i == 0)
				{
				   if (j == 0)
				   {
					   if (data[i][j] >= data[i][j + 1] != 0 && data[i][j] >= data[i + 1][j])
					   {
							   System.out.print(i);
							   System.out.print(" ");
							   System.out.print(j);
							   System.out.print("\n");
							   continue;
					   }
				   }
				   if (j == n - 1)
				   {
					   if (data[i][j] >= data[i][j - 1] != 0 && data[i][j] >= data[i + 1][j])
					   {
												  System.out.print(i);
												  System.out.print(" ");
												  System.out.print(j);
												  System.out.print("\n");
												  continue;
					   }
				   }
				   else
				   {
					   if (data[i][j] >= data[i][j - 1] != 0 && data[i][j] >= data[i][j + 1] != 0 && data[i][j] >= data[i + 1][j])
					   {
							   System.out.print(i);
							   System.out.print(" ");
							   System.out.print(j);
							   System.out.print("\n");
							   continue;
					   }
				   }
				}
				if (i == m - 1)
				{
					if (j == 0)
					{
									   if (data[i][j] >= data[i][j + 1] != 0 && data[i][i] >= data[i - 1][j])
									   {
											   System.out.print(i);
											   System.out.print(" ");
											   System.out.print(j);
											   System.out.print("\n");
											   continue;
									   }
					}
								   if (j == n - 1)
								   {
									   if (data[i][j] >= data[i][j - 1] != 0 && data[i][j] >= data[i - 1][j])
									   {
																  System.out.print(i);
																  System.out.print(" ");
																  System.out.print(j);
																  System.out.print("\n");
																  continue;
									   }
								   }
								   else
								   {
									   if (data[i][j] >= data[i][j - 1] != 0 && data[i][j] >= data[i][j + 1] != 0 && data[i][j] >= data[i - 1][j])
									   {
											   System.out.print(i);
											   System.out.print(" ");
											   System.out.print(j);
											   System.out.print("\n");
											   continue;
									   }
								   }
				}
				else
				{
					if (j == 0)
					{
						if (data[i][j] >= data[i - 1][j] != 0 && data[i][j] >= data[i + 1][j] != 0 && data[i][j] >= data[i][j + 1])
						{
							System.out.print(i);
							System.out.print(" ");
							System.out.print(j);
							System.out.print("\n");
							continue;
						}
					}
					if (j == n - 1)
					{
						if (data[i][j] >= data[i - 1][j] != 0 && data[i][j] >= data[i + 1][j] != 0 && data[i][j] >= data[i][j - 1])
						{
												System.out.print(i);
												System.out.print(" ");
												System.out.print(j);
												System.out.print("\n");
												continue;
						}
					}
					else
					{
						if (data[i][j] >= data[i - 1][j] != 0 && data[i][j] >= data[i + 1][j] != 0 && data[i][j] >= data[i][j - 1] != 0 && data[i][j] >= data[i][j + 1])
						{
							System.out.print(i);
							System.out.print(" ");
							System.out.print(j);
							System.out.print("\n");
							continue;
						}
					}
				}
			}
		}
		return 0;
	}


}

