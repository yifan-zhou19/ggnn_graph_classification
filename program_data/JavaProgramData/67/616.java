package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		double x = 0;
		double y = 0;
		double a = 0;
		double b = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		x = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		y = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n - 1;i++)
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			if (b / a - y / x > 0.05)
			{
				System.out.print("better");
				System.out.print("\n");
			}
			else if (y / x - b / a > 0.05)
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

