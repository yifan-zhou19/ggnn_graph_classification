package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double yuan = 0.0;
		double z = 0.0;
		double yuanx = 0;
		double yuany = 0;
	   double x = 0;
	   double y = 0;
		yuanx = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		yuany = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		yuan = yuany / yuanx;
		for (int i = 1;i < n;i++)
		{
			x = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			y = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			z = y / x;
			if (z > yuan)
			{
				if (z - yuan > 0.05)
				{
					System.out.print("better");
					System.out.print("\n");
				}
				else
				{
					System.out.print("same");
					System.out.print("\n");
				}
			}
			else
			{
				if (yuan - z > 0.05)
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

