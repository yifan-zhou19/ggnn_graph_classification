package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		float a;
		float b;
		float c;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		b = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		c = b / a;
		int i;
		float x;
		float a1;
		float b1;
		float c1;
		for (i = 0; i < n - 1; i++)
		{
			a1 = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			b1 = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			c1 = b1 / a1;
			x = c1 - c;
			if (x > 0.05F)
			{
				System.out.print("better");
				System.out.print("\n");
			}
			else if (x < -0.05F)
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

