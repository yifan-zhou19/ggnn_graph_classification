package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int[][] a =
		{
			{3, 0, 3, 2, 3, 2, 3, 3, 2, 3, 2, 3},
			{3, 1, 3, 2, 3, 2, 3, 3, 2, 3, 2, 3}
		};
		int y;
		int m;
		int d;
		int k = 0;
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = (y - 1) + (y - 1) / 4 - (y - 1) / 100 + (y - 1) / 400;
		if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
		{
			if (m == 1)
			{
				k = k + d;
			}
			else if (m > 1)
			{
				for (i = 0;i < m - 1;i++)
				{
					k = k + a[1][i];
				}
				k = k + d;
			}
		}
		else
		{
			if (m == 1)
			{
				k = k + d;
			}
			else if (m > 1)
			{
				for (i = 0;i < m - 1;i++)
				{
					k = k + a[0][i];
				}
				k = k + d;
			}
		}
		if (k % 7 == 1)
		{
			System.out.print("Mon.");
			System.out.print("\n");
		}
		else if (k % 7 == 2)
		{
			System.out.print("Tue.");
			System.out.print("\n");
		}
		else if (k % 7 == 3)
		{
			System.out.print("Wed.");
			System.out.print("\n");
		}
		else if (k % 7 == 4)
		{
			System.out.print("Thu.");
			System.out.print("\n");
		}
		else if (k % 7 == 5)
		{
			System.out.print("Fri.");
			System.out.print("\n");
		}
		else if (k % 7 == 6)
		{
			System.out.print("Sat.");
			System.out.print("\n");
		}
		else
		{
			System.out.print("Sun.");
			System.out.print("\n");
		}
		return 0;
	}
}

