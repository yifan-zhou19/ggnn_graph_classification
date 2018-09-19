package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int x = 0;
		int i;
		int[] a = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] b = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (m == 1)
		{
			x = d;
		}
		else if (m == 2)
		{
			x = 31 + d;
		}
		else if (y % 100 != 0 && y % 4 == 0 || y % 400 == 0)
		{
			for (i = 0;i < m - 1;i++)
			{
				x += a[i];
			}
			x += d;
		}
		else
		{
			for (i = 0;i < m - 1;i++)
			{
				x += b[i];
			}
			x += d;
		}
		System.out.print(x);
		System.out.print("\n");
		return 0;
	}
}

