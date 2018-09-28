package <missing>;

public class GlobalMembers
{
	public static int is_leapyear(int y)
	{
		if ((y % 100) == 0)
		{
			if ((y % 400) == 0)
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
		else if (!(y % 4))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		final int[] md = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for (int i = 0;i < n;i++)
		{
			int yy;
			int m1;
			int m2;
			yy = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int d = 0;
			for (int i = Math.min(m1,m2);i < Math.max(m1,m2);i++)
			{
				d += md[i - 1];
			}
			if ((m1 <= 2 || m2 <= 2) && is_leapyear(yy) != 0)
			{
				d++;
			}
			if ((d % 7) == 0)
			{
				System.out.print("YES");
				System.out.print("\n");
			}
			else
			{
				System.out.print("NO");
				System.out.print("\n");
			}
		}
	}
}

