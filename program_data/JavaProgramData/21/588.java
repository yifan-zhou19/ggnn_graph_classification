package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[300];
		int s = 0;
		int c = 0;
		double[] b = new double[300];
		double ave;
		double max = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			s = s + a[i];
		}
		ave = (double)s / n;
		for (i = 0; i < n; i++)
		{
			b[i] = Math.abs(a[i] - ave);
			if (b[i] - max > 1e-6)
			{
				max = b[i];
			}
		}
		for (i = 0; i < n; i++)
		{
			if (Math.abs(b[i] - max) < 1e-6)
			{
				if (c == 0)
				{
					System.out.print(a[i]);
					c++;
				}
				else
				{
					System.out.print(',');
					System.out.print(a[i]);
					c++;
				}
			}
		}
		return 0;
	}
}

