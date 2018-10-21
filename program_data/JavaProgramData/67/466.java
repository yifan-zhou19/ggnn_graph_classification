package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double n;
		double a;
		double b;
		double c;
		double d;
		double p1;
		double p2;
		n = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		p1 = (double)b / (double)a;
		for (int i = 2;i <= n;i++)
		{
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			d = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			p2 = (double)d / (double)c;
			if ((p1 - p2) > 0.05)
			{
				System.out.print("worse");
				System.out.print("\n");
			}
			else
			{
				if ((p2 - p1) > 0.05)
				{
				System.out.print("better");
				System.out.print("\n");
				}
				if (((p2 - p1) < 0.05) && ((p2 - p1)>(-0.05)))
				{
					System.out.print("same");
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

