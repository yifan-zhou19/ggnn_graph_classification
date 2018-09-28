package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double i;
		double n;
		double a;
		double b;
		double c;
		double x;
		double y;
		double z;
		n = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		for (i = 0 ; i < n ; i = i++)
		{
			if (i == 0)
			{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			}
			c = b / a * 1.00;
			if (i >= 1)
			{
				x = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
				y = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
				z = y / x;
				if (z - c > 0.05)
				{
				System.out.print("better");
				System.out.print("\n");
				}
				else
				{
				  if (c - z > 0.05)
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
		}
		return 0;
	}
}

