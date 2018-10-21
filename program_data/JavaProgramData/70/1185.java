package <missing>;

public class GlobalMembers
{
	public static double length(double a,double b,double c,double d)
	{
		double l;
		l = (a - c) * (a - c) + (b - d) * (b - d);
		l = Math.sqrt(l);
		return l;
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double[] a = new double[1000];
		double[] b = new double[1000];
		int i;
		int j;
		for (i = 1;i <= n;i++)
		{
			a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		double max = 0;
		for (i = 1;i <= n;i++)
		{
			for (j = i;j <= n;j++)
			{
				  if (length(a[i], b[i], a[j], b[j]) > max)
				  {
				  max = length(a[i], b[i], a[j], b[j]);
				  }
			}
		}
		System.out.printf("%.4f\n", max);
		return 0;

	}
}

