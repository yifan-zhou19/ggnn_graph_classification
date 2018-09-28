package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		double rate0;
		double rate;
		double sum;
		double efe;
		double a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sum = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		efe = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		rate0 = efe / sum;
		for (i = 1;i < n;i++)
		{
			sum = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			efe = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			rate = efe / sum;
			a = rate0 - rate;
			if (a > 0.05)
			{
				System.out.print("worse");
				System.out.print("\n");
				continue;
			}
			if (a < -0.05)
			{
				System.out.print("better");
				System.out.print("\n");
				continue;
			}
			System.out.print("same");
			System.out.print("\n");
		}
		return 0;
	}

}

