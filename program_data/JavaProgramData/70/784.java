package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double ju;
		double o;
		double[] a = new double[100];
		double[] b = new double[100];
		for (i = 0;i < n;i++)
		{
			a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		double juli = new double(double m,double n,double x,double y);
		double max = new double(double m,double n);
		ju = 0;
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				o = juli(a[i], b[i], a[j], b[j]);
				ju = max(o, ju);
			}
		}
		System.out.printf("%.4f", ju);
		System.out.printf("%.4f", "\n");
	}


	public static double juli(double m,double n,double x,double y)
	{
		double z;
		z = Math.pow(m - x,2) + Math.pow(n - y,2);
		z = Math.pow(z,0.5);
		return z;
	}
	public static double max(double m,double n)
	{
		double z;
		if (m > n)
		{
			z = m;
		}
		else
		{
			z = n;
		}
		return z;

	}
}

