package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] date = new int[100];
		int[] effe = new int[100];
		int i;
		double[] percent = new double[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		date[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		effe[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		percent[1] = (double) effe[1] / date[1];
		for (i = 2; i <= n; i++)
		{
			date[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			effe[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			percent[i] = (double) effe[i] / date[i];
			if (percent[i] - percent[1] > 0.05)
			{
				System.out.print("better");
				System.out.print("\n");
			}
			else if (percent[1] - percent[i] > 0.05)
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

