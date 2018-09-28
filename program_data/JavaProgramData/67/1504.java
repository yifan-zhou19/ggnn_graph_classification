package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		double a0;
		double b0;
		double a;
		double b;
		double p1;
		double p2;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a0 = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		b0 = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		p1 = b0 / a0;
		for (i = 1;i <= n - 1;i++)
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			p2 = b / a;
			if (Math.abs(p1 - p2) <= 0.05)
			{
				System.out.print("same");
				System.out.print("\n");
			}
			else if (p1 - p2 > 0.05)
			{
				System.out.print("worse");
				System.out.print("\n");
			}
			else
			{
				System.out.print("better");
				System.out.print("\n");
			}
		}
		return 0;
	}
}

