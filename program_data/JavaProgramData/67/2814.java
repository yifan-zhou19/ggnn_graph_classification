package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		float sum;
		float effective;
		float percentji;
		float percent;
		sum = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		effective = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		percentji = effective / sum;
		while (--n != 0)
		{
			sum = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			effective = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			percent = effective / sum;
			if (percentji - percent > 0.05F)
			{
				System.out.print("worse");
				System.out.print("\n");
			}
			else if (percent - percentji > 0.05F)
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
		return 0;
	}
}

