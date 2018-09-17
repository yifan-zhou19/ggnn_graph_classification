package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	double c;
	double[] m = new double[41];
	double[] f = new double[41];
	char[][] a = new char[41][7];
	int e;
	int d;
	e = 0;
	d = 0;
	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = tempVar2.charAt(0);
		}
		if (a[i][0] == 'm')
		{

			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				m[e] = Double.parseDouble(tempVar3);
			}
		e++;
		}
		else if (a[i][0] == 'f')
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				f[d] = Double.parseDouble(tempVar4);
			}
			d++;
		}
	}

	for (j = 0;j < n;j++)
	{
		for (i = 0;i < e-1;i++)
		{
			if (m[i] > m[i + 1])
			{
			c = m[i];
			m[i] = m[i + 1];
			m[i + 1] = c;
			}
		}
	}

	for (j = 0;j < n;j++)
	{
		for (i = 0;i < d - 1;i++)
		{
			if (f[i] < f[i + 1])
			{
				c = f[i];
			f[i] = f[i + 1];
			f[i + 1] = c;
			}
		}
	}

	for (i = 0;i < e;i++)
	{
		if (m[i] != 0)
		{
			System.out.printf("%.2lf ",m[i]);
		}
	}

	for (i = 0;i < d - 1;i++)
	{
		if (f[i] != 0)
		{
			System.out.printf("%.2lf ",f[i]);
		}
	}
	System.out.printf("%.2lf",f[d - 1]);
	return 0;
	}
}

