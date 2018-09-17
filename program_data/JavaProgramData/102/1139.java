package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int k = 0;
	int e = 0;
	int i;
	int j;
	char[][] o = new char[41][5];
	double[] m = new double[41];
	double[] g = new double[41];
	double[] t = new double[41];
	double[] f = new double[41];
	double a;
	double b;
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
			o[i] = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			g[i] = Double.parseDouble(tempVar3);
		}
	}
	for (i = 0;i < n;i++)
	{
		if (o[i][0] == 'm')
		{
			t[k] = g[i];
			k++;
		}
		else
		{
			f[e] = g[i];
			e++;
		}
	}
	for (i = k;i > 0;i--)
	{
		for (j = 0;j < i - 1;j++)
		{
			if (t[j + 1] < t[j])
			{
				a = t[j + 1];
			t[j + 1] = t[j];
			t[j] = a;
			}
		}
	}
	for (i = e;i > 0;i--)
	{
		for (j = 0;j < i - 1;j++)
		{
			if (f[j + 1] < f[j])
			{
				a = f[j + 1];
			f[j + 1] = f[j];
			f[j] = a;
			}
		}
	}
	for (i = 0;i < k;i++)
	{
		System.out.printf("%.2lf ",t[i]);
	}
	for (i = e-1;i > 0;i--)
	{
		System.out.printf("%.2lf ",f[i]);
	}
		System.out.printf("%.2lf",f[0]);
		return 0;
	}

}

