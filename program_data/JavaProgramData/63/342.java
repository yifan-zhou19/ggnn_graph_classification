package <missing>;

public class GlobalMembers
{
	// ?????.cpp : Defines the entry point for the console application.
	// ?????????????
	public static int Main()
	{
		int[][] a = new int[100][100]; //??????a[100][100],b[100][100],c[100][100]???????c[100][100]???
		int[][] b = new int[100][100];
		int[][] c = new int[100][100];
		int x1 = 0; //?????????x1?y1,x2,y2?????A?B?????
		int y1 = 0;
		int x2 = 0;
		int y2 = 0;
		int i = 0;
		int j = 0;
		int k = 0;
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < x1;i++) //?for????a
		{
			for (j = 0;j < y1;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
			x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 0;i < x2;i++) //?for????b
			{
				for (j = 0;j < y2;j++)
				{
					b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
				for (i = 0;i < x1;i++) //for????
				{
					for (j = 0;j < y2;j++)
					{
						for (k = 0;k < y1;k++)
						{
							c[i][j] = c[i][j] + a[i][k] * b[k][j]; //?c[i][j]??
						}
					}
				}
						for (i = 0;i < x1 - 1;i++) //??????
						{
							System.out.print(c[i][0]);
							for (j = 1;j < y2;j++)
							{
								System.out.print(" ");
								System.out.print(c[i][j]);
							}
							System.out.print("\n");
						}
						System.out.print(c[x1 - 1][0]);
						for (j = 1;j < y2;j++)
						{
							System.out.print(" ");
							System.out.print(c[x1 - 1][j]);
						}
						return 0;
	}
}

