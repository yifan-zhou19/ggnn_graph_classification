package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int x0;
		int y0;
		int x;
		int y;
		double k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		x0 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y0 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = (double)y0 / x0;
		for (n;n >= 2;n--)
		{
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if ((double)y / x > k + 0.05)
			{
				System.out.print("better");
				System.out.print("\n");
			}
			else if ((double)y / x < k - 0.05)
			{
				System.out.print("worse");
				System.out.print("\n");
			}
			else
			{
				System.out.print("same");
				System.out.print("\n");
			}
		}
		return 0;
	}
}

