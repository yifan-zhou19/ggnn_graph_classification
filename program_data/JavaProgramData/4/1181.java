package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[100][100];
		for (int i = 0;i <= row - 1;i++)

		{
			for (int s = 0;s <= col - 1;s++)
			{
				a[i][s] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			System.out.print("\n");
		}
		int h = -1;
		int l = 2;
		System.out.print(a[0][0]);
		System.out.print("\n");
		for (int t = 1;t <= col - 1;t++)
		{


			while (l > 0 && h < row - 1)
			{
				h++;
				l--;
				System.out.print(a[h][l]);
				System.out.print("\n");
			}
			l = t + 2;
			h = -1;
		}
	int d = col;
	int b = 0;
	for (int j = 1;j <= row - 1;j++)
	{
	while (d > 0 && b < row - 1)
	{
		d--;
		b++;
		System.out.print(a[b][d]);
		System.out.print("\n");
	}
	d = col;
	b = j;
	}
	return 0;
	}


}

