package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int[] a = new int[300];
		int sum = 0;
		int t = 0;
		double ave;
		double[] b = new double[300];
		double max;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum += a[i];
		}
		ave = (double)sum / n;
		for (i = 0; i < n; i++)
		{
			b[i] = Math.abs(ave - a[i]);
		}
		max = b[0];
		for (i = 1; i < n; i++)
		{
			if (max < b[i])
			{
				max = b[i];
			}
		}
		for (i = 0; i < n; i++)
		{
			if (Math.abs(b[i] - max) < 0.000001)
			{
				t++;
				if (t == 1)
				{
					System.out.print(a[i]);
				}
				else
				{
					System.out.print(",");
					System.out.print(a[i]);
				}
			}
		}
		return 0;
	}
}

