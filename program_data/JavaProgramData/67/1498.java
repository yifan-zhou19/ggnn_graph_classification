package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double n;
		double total;
		double effect;
		double t;
		double e;
		double i;
		double precent;
		double p;
		n = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		t = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		e = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		p = e / t;
		for (i = 0;i < n - 1;i++)
		{
			total = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			effect = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			precent = effect / total;
			if ((precent - p) > 0.05)
			{
				System.out.print("better");
				System.out.print("\n");
			}
			else
			{
				if ((p - precent) > 0.05)
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

