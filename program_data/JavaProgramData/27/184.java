package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		double[] a = new double[100];
		double[] b = new double[100];
		double[] c = new double[100];
		double x1;
		double x2;
		double d;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0;k < n;k++)
		{
			a[k] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b[k] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c[k] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			d = b[k] * b[k] - 4 * a[k] * c[k];
			if (d > 0)
			{
				x1 = (-b[k] + Math.sqrt(d)) / (2 * a[k]), x2 = (-b[k] - Math.sqrt(d)) / (2 * a[k]), System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
			}
			else if (d == 0)
			{
				x1 = x2 = -b[k] / (2 * a[k]), System.out.printf("x1=x2=%.5f\n",x1);
			}
			else
			{
				d = Math.sqrt(-d) / (2 * a[k]), x1 = x2 = -b[k] / (2 * a[k]), System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",x1,d,x2,d);
			}
		}
		return 0;
	}
}

