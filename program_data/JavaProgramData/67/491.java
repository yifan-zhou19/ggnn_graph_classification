package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double i;
		double n;
		double p;
		double q;
		n = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			double x;
			double y;
			x = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			y = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			if (i == 0)
			{
				p = y / x;
				continue;
			}
			q = y / x;
			if (p >= q)
			{
				if (p - q > 0.05)
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
			else
			{
				if (q - p > 0.05)
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
		}
		return 0;
	}
}

