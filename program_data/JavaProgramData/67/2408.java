package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] x = new int[n];
		int[] y = new int[n];
		for (i = 0; i < n; i++) //??????
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1; i < n; i++)
		{ //???????
			if ((y[0] * x[i] - y[i] * x[0]) > 0.05 * x[i] * x[0])
			{
				System.out.print("worse");
				System.out.print("\n");
			}
			else if ((y[i] * x[0] - y[0] * x[i]) > 0.05 * x[i] * x[0])
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

