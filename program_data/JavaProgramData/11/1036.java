package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] b = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int y;
		int m;
		int d;
		int sum = 0;
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
		{
			for (int i = m - 2;i >= 0;i--)
			{
				sum = sum + b[i];
			}
			System.out.print(sum + d);
		}
		else
		{
			for (int s = m - 2;s >= 0;s--)
			{
				sum = sum + a[s];
			}
			System.out.print(sum + d);
		}
		return 0;
	}

}

