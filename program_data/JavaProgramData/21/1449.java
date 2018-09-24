package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int sum = 0;
		int j = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		int[] c = new int[n];
		for (i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum = sum + a[i];
		}
		double[] b = new double[n];
		double average = 0;
		double max;
		average = 1.0 * sum / n;
		for (i = 0; i < n; i++)
		{
			b[i] = Math.abs(a[i] - average);
		}
		max = b[1];
		for (i = 0; i < n; i++)
		{
			if (b[i] > max)
			{
				max = b[i];
			}
		}
		for (i = 0; i < n; i++)
		{
			if (Math.abs(b[i] - max) < 1e-6)
			{
				c[j] = a[i];
				j++;
			}
		}
		if (j == 1)
		{
			System.out.print(c[0]);
			System.out.print("\n");
		}
		else
		{
			for (i = 0; i < j - 1; i++)
			{
				System.out.print(c[i]);
				System.out.print(",");
			}
			System.out.print(c[j - 1]);
		}
		return 0;
	}

}

