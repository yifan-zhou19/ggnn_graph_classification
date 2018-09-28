package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double n = 0;
		double i = 0;
		double p = 0;
		double q = 0;
		double x = 0;
		double y = 0;
		double z = 0;
		double w = 0;
		n = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		p = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		q = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		z = q / p;
		for (i = 1;i < n;i = i + 1)
		{
			x = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			y = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			w = y / x;
		if (w - z >= 0.05)
		{
			System.out.print("better");
			System.out.print("\n");
		}
		else
		{
			if (z - w >= 0.05)
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

