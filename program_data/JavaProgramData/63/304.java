package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x1;
		int y1;
		int x2;
		int y2;
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int[][] c = new int[100][100];
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < x1; i++)
		{
			for (int j = 0; j < y1; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i2 = 0; i2 < x2;i2++)
		{
			for (int j2 = 0;j2 < y2; j2++)
			{
				b[i2][j2] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int i3 = 0; i3 < x1;i3++)
		{
			for (int i4 = 0; i4 < y2;i4++)
			{
				for (int i0 = 0; i0 < x2; i0++)
				{
					c[i3][i4] = c[i3][i4] + a[i3][i0] * b[i0][i4];
				}
			}
		}
		for (int i5 = 0; i5 < x1; i5++)
		{
			for (int i6 = 0;i6 < y2; i6++)
			{
				if (i6 == (y2 - 1))
				{
					System.out.print(c[i5][i6]);
					System.out.print("\n");
				}
				else
				{
					System.out.print(c[i5][i6]);
					System.out.print(" ");
				}
			}
		}
	return 0;
	}

}

