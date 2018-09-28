package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		double a;
		double b;
		double x;
		double y;
		double another;
		double effect;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		effect = b / a;
		for (i = 1;i < n;i++)
		{
			x = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			y = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			another = y / x;
			if (another - effect > 0.05)
			{
				System.out.print("better");
				System.out.print("\n");
			}
			if (effect - another > 0.05)
			{
				System.out.print("worse");
				System.out.print("\n");
			}
			if (Math.abs(another - effect) <= 0.05)
			{
				System.out.print("same");
				System.out.print("\n");
			}
		}
		return 0;
	}
}

