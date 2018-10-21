package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] zz = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
		int y;
		int m;
		int d;
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (y % 4 != 0 || (y % 4 == 0 && y % 100 == 0 && y % 400 != 0))
		{
			System.out.print(zz[m - 1] + d);
			System.out.print("\n");
		}
		else
		{
			if (m <= 2)
			{
				System.out.print(zz[m - 1] + d);
				System.out.print("\n");
			}
			else
			{
				System.out.print(zz[m - 1] + d + 1);
				System.out.print("\n");
			}
		}
	}
}

