package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int m;
		int p;
		int k = 0;
		double x;
		double y;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		p = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		x = (double)p / m;
		for (k = 1; k < n; k++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y = (double)b / a;
			if (y - x > 0.05)
			{
				System.out.print("better");
				System.out.print("\n");
			}
			if (x - y > 0.05)
			{
				System.out.print("worse");
				System.out.print("\n");
			}
			if ((y - x <= 0.05) && (x - y <= 0.05))
			{
				System.out.print("same");
				System.out.print("\n");
			}
		}
	return 0;
	}


}

