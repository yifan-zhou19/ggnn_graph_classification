package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double sum;
		double efficient;
		double sample;
		int i = 0;
		for (i = 1;i <= n;i++)
		{
			sum = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			efficient = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			if (i == 1)
			{
				sample = efficient / sum;
			}
			else if ((efficient / sum) - sample > 0.05)
			{
				System.out.print("better");
				System.out.print("\n");
			}
			else if (sample - (efficient / sum) > 0.05)
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

