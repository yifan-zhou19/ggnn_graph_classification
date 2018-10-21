package <missing>;

public class GlobalMembers
{
	//********************************
	//*???????
	//*??? ?? 1300012814  **
	//*???2013.09,18  **
	//********************************
	public static int Main()
	{
		int n;
		double a;
		double b;
		double p;
		double c;
		double d;
		double q;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		p = b / a * 100;
		for (int i = 1; i < n; i++)
		{
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			d = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			q = d / c * 100;
			if (q - p > 5)
			{
				System.out.print("better");
				System.out.print("\n");
			}
			else
			{
				if (p - q > 5)
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

