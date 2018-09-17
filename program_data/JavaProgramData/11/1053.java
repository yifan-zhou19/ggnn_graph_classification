package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int t = 0;
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))
		{
			a[1] = 29;
		}
		if (m == 1)
		{
			System.out.print(d);
		}
		else
		{
			for (int i = 0;i < m - 1;i++)
			{
				t = t + a[i];
			}
			System.out.print(t + d);
		}
		return 0;
	}
}

