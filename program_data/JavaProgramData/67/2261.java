package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double[] a = new double[n];
		double[] b = new double[n];
		for (int i = 0;i < n;i++)
		{
			a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (int j = 0;j < n;j++)
		{
			a[j] = b[j] / a[j];
		}
		for (int k = 1;k < n;k++)
		{
			if ((a[k] - a[0]) > 0.05)
			{
				System.out.print("better");
				System.out.print("\n");
			}
			if ((a[k] - a[0]) < -0.05)
			{
				System.out.print("worse");
				System.out.print("\n");
			}
			if (Math.abs(a[k] - a[0]) <= 0.05)
			{
				System.out.print("same");
				System.out.print("\n");
			}
		}
		return 0;
	}


}

