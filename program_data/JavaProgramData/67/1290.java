package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		double a;
		double b;
		double c;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		c = b / a;
		for (i = 0;i < n - 1;i++)
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			if (b / a - c > 0.05)
			{
				System.out.print("better");
				System.out.print("\n");
			}
			if (b / a - c < -0.05.getValue() != 0)
			{
				System.out.print("worse");
				System.out.print("\n");
			}
			if (b / a - c >= -0.05 && b / a - c <= 0.05)
			{
				System.out.print("same");
				System.out.print("\n");
			}
		}
		return 0;
	}
}

