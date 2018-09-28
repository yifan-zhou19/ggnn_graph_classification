package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] a = new double[10000];
		double[] b = new double[10000];
		int i;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[0] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		b[0] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i < n;i++)
		{
			a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			if (100 * (b[i] / a[i] - b[0] / a[0]) > 5)
			{
				System.out.print("better");
				System.out.print('\n');
			}
			else if (100 * (b[0] / a[0] - b[i] / a[i]) > 5)
			{
				System.out.print("worse");
				System.out.print('\n');
			}
			else
			{
				System.out.print("same");
				System.out.print('\n');
			}
		}
		System.out.print("\n");
		return 0;
	}

}

