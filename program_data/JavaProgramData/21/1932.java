package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int middle;
		double[] a = new double[301];
		double[] d = new double[301];
		double dmax = 0;
		double sum = 0.0;
		double x;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			sum = sum + a[i];
		}
		x = sum / n;
		sort(a,a + n);
		for (i = 0;i < n;i++)
		{
			d[i] = Math.abs(a[i] - x);
			if (d[i] > dmax)
			{
				dmax = d[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (d[i] == dmax)
			{
				System.out.print(a[i]);
				middle = i;
				break;
			}
		}
		for (i = middle+1;i < n;i++)
		{
			if (d[i] == dmax)
			{
				System.out.print(",");
				System.out.print(a[i]);
			}
		}
		return 0;
	}
}

