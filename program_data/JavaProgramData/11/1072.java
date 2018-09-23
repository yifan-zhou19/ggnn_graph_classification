package <missing>;

public class GlobalMembers
{
	public static int leap(int y)
	{
			if ((y % 100 == 0) && (y % 400 == 0) || (y % 100 != 0) && (y % 4 == 0))
			{
					return 1;
			}
				else
				{
					return 0;
				}
	}

	public static int days(int y,int d,int r)
	{
			int[] a = {0, 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
			if (leap(y) != 0)
			{
				a[3] = 29;
			}
			int ans = 0;
			for (int i = 1;i <= d;i++)
			{
				ans += a[i];
			}
			return ans + r;
	}
	public static int Main()
	{
		int y;
		int d;
		int r;
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		r = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		//if (leapyear(y)) cout<<'N'; else cout<<'N';
		System.out.print(days(y, d, r));
	}

}

