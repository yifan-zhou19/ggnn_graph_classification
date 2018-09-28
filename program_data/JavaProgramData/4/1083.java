package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int m = 1;
		int n = 1;
		int h;
		int g;
		int[][] a = new int[100][100];
		for (int i = 1;i <= row;i++)
		{
			for (int j = 1;j <= col;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		while (m <= row)
		{
			h = m;
			g = n;
			while (h <= row != 0 && g >= 1)
			{
				System.out.print(a[h][g]);
				System.out.print("\n");
				h++;
				g--;
			}
			if (n < col)
			{
				n++;
			}
			else
			{
				m++;
			}
		}
		return 0;
	}

}

