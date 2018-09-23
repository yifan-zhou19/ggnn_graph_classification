package <missing>;

public class GlobalMembers
{
	public static final int[][] month =
	{
		{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
		{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
	};
	public static int Main()
	{
		int i;
		int leap = 0;
		int y;
		int m;
		int d;
		int ans = 0;
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if ((y % 4 == 0) && (y % 100 != 0) || (y % 400 == 0))
		{
			leap = 1;
		}
		for (i = 1;i < m;i++)
		{
			ans += month[leap][i];
		}
		ans += d;
		System.out.print(ans);
		System.out.print("\n");
		return 0;
	}
}

