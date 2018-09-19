package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double a;
		String b = new String(new char[10]);
		int i;
		int j = 0;
		int q = 0;
		int s = 0;
		double[] m = new double[40];
		double[] f = new double[40];
		for (i = 0;i < n;i++)
		{
			m[i] = 0.00;
			f[i] = 0.00;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a = Double.parseDouble(tempVar3);
			}
			if (b.charAt(0) == 'm')
			{
				m[j] = a;
				j++;
			}
			else
			{
				f[q] = a;
				q++;
			}
		}
		int k;
		for (k = 1; k <= j; k++)
		{
			double e;
			for (i = 0;i < j - k;i++)
			{
				if (m[i] > m[i + 1])
				{
					e = m[i + 1];
					m[i + 1] = m[i];
					m[i] = e;
				}
			}
		}
		for (k = 1; k <= q; k++)
		{
			double g;
			for (i = 0;i < q - k;i++)
			{
				if (f[i] < f[i + 1])
				{
					g = f[i + 1];
					f[i + 1] = f[i];
					f[i] = g;
				}
			}
		}
		for (i = 0;i < j;i++)
		{
			if (s == 0)
			{
				System.out.printf("%.2lf",m[i]);
				s++;
			}
			else
			{
				System.out.printf(" %.2lf",m[i]);
			}
		}
		for (i = 0;i < q;i++)
		{
			if (s == 0)
			{
				System.out.printf("%.2lf",f[i]);
				s++;
			}
			else
			{
				System.out.printf(" %.2lf",f[i]);
			}
		}
		return 0;
	}

}

