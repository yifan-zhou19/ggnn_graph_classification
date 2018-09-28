package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[101][101]; //?????????????????
		int[][] b = new int[101][101];
		int[][] c = new int[101][101];
		int i1;
		int i2;
		int i3;
		int j1;
		int j2;
		int j3;
		int k;
		int x1; //??????
		int x2;
		int y1;
		int y2;
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i1 = 0;i1 <= x1 - 1;i1++)
		{
			for (j1 = 0;j1 <= y1 - 1;j1++)
			{
				a[i1][j1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i2 = 0;i2 <= x2 - 1;i2++)
			{
				for (j2 = 0;j2 <= y2 - 1;j2++)
				{
					b[i2][j2] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}

		for (i3 = 0;i3 <= x1 - 1;i3++)
		{ //?????
			for (j3 = 0;j3 <= y2 - 1;j3++)
			{ //?????
				c[i3][j3] = 0;
				for (k = 0;k <= x2 - 1;k++)
				{
					c[i3][j3] = c[i3][j3] + a[i3][k] * b[k][j3]; //??c[i][j]
				}
			}
			for (j3 = 0;j3 <= y2 - 2;j3++)
			{
							System.out.print(c[i3][j3]);
							System.out.print(" ");

			}
			 System.out.print(c[i3][y2 - 1]);
			 System.out.print("\n");
		}
		return 0;
	}

}

