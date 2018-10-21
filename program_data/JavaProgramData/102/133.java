package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int m = 0;
	int f = 0;
	double[] a = new double[41];
	double[] b = new double[41];
	String s = new String(new char[8]);
	double k;
	int i;
	int j;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	while (n-- != 0)
	{
		s = ConsoleInput.readToWhiteSpace(true).charAt(0);
		k = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		if (s.charAt(0) == 'm')
		{
			a[m] = k;
			m++;
		}
			if (s.charAt(0) == 'f')
			{
			b[f] = k;
			f++;
			}
	}
	sort(a,a + m);
	sort(b,b + f);
	for (i = 0;i < m;i++)
	{
	System.out.printf("%.2f ",a[i]);

	//cout<<setprecision(2)<<a[i]<<" ";
	}
	for (i = f - 1;i >= 0;i--)
	{
		if (i > 0)
		{
	System.out.printf("%.2f ",b[i]);
		}
			if (i == 0)
			{
	System.out.printf("%.2f",b[i]);
			}

	}
	System.out.print("\n");

	return 0;
	}
}

