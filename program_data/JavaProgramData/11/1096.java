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
		int l = 0;
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (y % 4 != 0 || (y % 100 == 0 && y % 400 != 0)) //???
		{
			if (m == 1)
			{
				System.out.print(d);
			}
			else
			{
				for (int i = 0;i < m - 1;i++)
				{
					l += a[i];
				}
				System.out.print(l + d);
			}
		}
		else
		{
			if (m == 1)
			{
				System.out.print(d);
			}
			else
			{
				for (int i = 0;i < m - 1;i++)
				{
					l += b[i];
				}
				System.out.print(l + d);
			}
		}
		return 0;
	}
}

