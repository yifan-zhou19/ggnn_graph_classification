package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 1;
		float a;
		float b;
		float c;
		float d;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		b = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		n = n - 1;
		for (i = 1;i <= n;i++)
		{
			c = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			d = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));

			if (d / c - b / a > 0.05F)
			{
				System.out.print("better");
				System.out.print("\n");
			}
			else if (b / a - d / c > 0.05F)
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

