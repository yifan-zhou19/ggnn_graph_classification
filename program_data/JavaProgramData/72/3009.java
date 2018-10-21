package <missing>;

public class GlobalMembers
{
	//============================================================================
	// Name        : abc.cpp
	// Author      : aaa
	// Version     :
	// Copyright   : Your copyright notice
	// Description : Hello World in C++, Ansi-style
	//============================================================================


	public static int Main()
	{
		int h;
		int li;
		int[][] a = new int[25][25];
		h = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		li = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < h;i++)
		{
			for (int j = 0;j < li;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int i = 0;i < h;i++)
		{
			if (i == 0)
			{
				for (int j = 0;j < li;j++)
				{
					if (j == 0)
					{
						if (a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j + 1])
						{
												System.out.print(i);
												System.out.print(" ");
												System.out.print(j);
												System.out.print("\n");
						}
					}
					else
					{
					if (j == li - 1)
					{
						if (a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j - 1])
						{
												System.out.print(i);
												System.out.print(" ");
												System.out.print(j);
												System.out.print("\n");
						}
					}
					else
					{
						if (a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i][j + 1])
						{
												System.out.print(i);
												System.out.print(" ");
												System.out.print(j);
												System.out.print("\n");
						}
					}
					}
				}
			}
			else
			{
			if (i == h - 1)
			{
					for (int j = 0;j < li;j++)
					{
						if (j == 0)
						{
							if (a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i][j + 1])
							{
													System.out.print(i);
													System.out.print(" ");
													System.out.print(j);
													System.out.print("\n");
							}
						}
						else
						{
						if (j == li - 1)
						{
							if (a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i][j - 1])
							{
													System.out.print(i);
													System.out.print(" ");
													System.out.print(j);
													System.out.print("\n");
							}
						}
						else
						{
							if (a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i][j + 1])
							{
													System.out.print(i);
													System.out.print(" ");
													System.out.print(j);
													System.out.print("\n");
							}
						}
						}
					}
			}
			else
			{
						for (int j = 0;j < li;j++)
						{
							if (j == 0)
							{
									if (a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i - 1][j])
									{
														System.out.print(i);
														System.out.print(" ");
														System.out.print(j);
														System.out.print("\n");
									}
							}
							else
							{
							if (j == li - 1)
							{
									if (a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i - 1][j])
									{
														System.out.print(i);
														System.out.print(" ");
														System.out.print(j);
														System.out.print("\n");
									}
							}
							else
							{
								if (a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i - 1][j])
								{
														System.out.print(i);
														System.out.print(" ");
														System.out.print(j);
														System.out.print("\n");
								}
							}
							}
						}
			}
			}
		}
		return 0;
	}

}

