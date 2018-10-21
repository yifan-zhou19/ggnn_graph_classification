package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int c;
		int d;
		int i;
		double x;
		double y;
		double z;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		x = (double)b / (double)a;
		for (i = 1 ; i <= (n - 1) ; i++)
		{
			c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y = (double)d / (double)c;
			z = y - x;
			if (Math.abs(z) <= 0.05)
			{
				System.out.print("same");
				System.out.print("\n");
			}
			else
			{
				if (z > 0)
				{
					System.out.print("better");
					System.out.print("\n");
				}
				else
				{
					System.out.print("worse");
					System.out.print("\n");
				}
			}
		}
		System.in.read();
		System.in.read(); //????
		return 0;
	}

}

