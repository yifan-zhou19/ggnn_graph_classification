package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		double y;
		double a;
		double b;
		double a1;
		double b1;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));

		for (i = 1; i <= n - 1; i++)
		{
			a1 = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b1 = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));

			y = b1 / a1 - b / a;

			if (y > 0.05)
			{
				System.out.print("better");
				System.out.print("\n");
			}

			else if (y < -0.05)
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

