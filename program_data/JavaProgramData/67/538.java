package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double n;
		double a;
		double b;
		double x;
		double y;
		double sum = 0;
		n = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		while ((x = Double.parseDouble(ConsoleInput.readToWhiteSpace(true))).length() > 0 && (y = Double.parseDouble(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			sum++;
			if ((y / x - b / a) > 0.05)
			{
				System.out.print("better");
				System.out.print("\n");
			}
			else if ((b / a - y / x) > 0.05)
			{
				System.out.print("worse");
				System.out.print("\n");
			}
			else
			{
				System.out.print("same");
				System.out.print("\n");
			}
			if (sum == n - 1)
			{
				break;
			}
		}
		return 0;
	}
}

