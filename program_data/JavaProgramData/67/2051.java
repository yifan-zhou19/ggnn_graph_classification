package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		double a;
		double b;
		double x;
		double y;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		x = b / a;
		for (i = 1;i <= n - 1;i++)
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			y = b / a;
			if (y > x)
			{
				if (y - x > 0.05)
				{
					System.out.print("better");
					System.out.print("\n");
				}
				else
				{
					System.out.print("same");
					System.out.print("\n");
				}
			}
			else
			{
				if (x - y > 0.05)
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
		}
		return 0;
	}
}

