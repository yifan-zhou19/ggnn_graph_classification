package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int s;
		int q;
		double e;
		double a;
		double[] m = new double[40];
		double[] f = new double[40];
		String gen = new String(new char[10]);
		s = 0;
		q = 0;
		j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				gen = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a = Double.parseDouble(tempVar3);
			}
			if (gen.charAt(0) == 'm')
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
		for (k = 1;k <= j;k++)
		{
			for (i = 0;i < j - k;i++)
			{
				if (m[i] > m[i + 1])
				{
					  e = m[i];
					  m[i] = m[i + 1];
					  m[i + 1] = e;
				}
			}
		}
		for (k = 1;k <= q;k++)
		{
			for (i = 0;i < q - k;i++)
			{
				if (f[i] < f[i + 1])
				{
					  e = f[i];
					  f[i] = f[i + 1];
					  f[i + 1] = e;
				}
			}
		}
		for (i = 0;i < j;i++)
		{
			System.out.printf("%.2lf ",m[i]);
		}
		for (i = 0;i < q - 1;i++)
		{
			System.out.printf("%.2lf ",f[i]);
		}
		System.out.printf("%.2lf",f[q - 1]);

	return 0;
	}
}

