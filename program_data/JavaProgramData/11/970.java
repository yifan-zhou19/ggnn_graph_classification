package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a =
		{
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
		};
		int y;
		int m;
		int d;
		int i;
		int sum = 0;
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))
		{
			for (i = 0;i < m - 1;i++)
			{
				sum = sum + a[1][i];
			}
		}
		else
		{
			for (i = 0;i < m - 1;i++)
			{
				sum = sum + a[0][i];
			}
		}
		sum += d;
		System.out.print(sum);
		System.out.print("\n");
	}

}

