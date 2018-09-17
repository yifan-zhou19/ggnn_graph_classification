package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j = 0;
	int k = 0;
	int o;
	int p;
	String u = new String(new char[10]);
	double[] v = new double[50];
	double[] m = new double[40];
	double[] f = new double[40];
	double t;
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
			u = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			v[i] = Double.parseDouble(tempVar3);
		}
		if (u.charAt(0) == 'm')
		{
			m[j] = v[i];
			j++;
		}
		else if (u.charAt(0) == 'f')
		{
			f[k] = v[i];
			k++;
		}
	}
	for (i = 0;i < j;i++)
	{

		for (o = 0;o < i;o++)
		{

			if (m[o] > m[i])
			{

				t = m[o];
				m[o] = m[i];
				m[i] = t;

			}
		}

	}
	for (i = 0;i < k;i++)
	{

		for (p = 0;p <= i;p++)
		{

			if (f[p] < f[i])
			{

				t = f[p];
				f[p] = f[i];
				f[i] = t;

			}
		}

	}
	for (i = 0;i < j;i++)
	{
	System.out.printf("%.2lf ",m[i]);

	}
	for (i = 0;i < k - 1;i++)
	{
	System.out.printf("%.2lf ",f[i]);

	}
	System.out.printf("%.2lf",f[k - 1]);
	return 0;
	}
}

