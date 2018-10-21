package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int c;
		int d;
		int n;
		int i;
		double x;
		double[] y = new double[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		x = d * 1.0 / c;
		for (i = 0;i < n - 1;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y[i] = b[i] * 1.0 / a[i];
		}
		for (i = 0;i < n - 1;i++)
		{
			if (y[i] - x > 0.05)
			{
				System.out.print("better");
			}
			else
			{
				if (x - y[i] > 0.05)
				{
					System.out.print("worse");
				}
				  else
				  {
					  System.out.print("same");
				  }
			}
			if (i != n - 2)
			{
				System.out.print("\n");
			}
		}
		return 0;
	}
}

