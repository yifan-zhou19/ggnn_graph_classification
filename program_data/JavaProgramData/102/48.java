package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int x;
	int i;
	int p = 0;
	int q = 0;
	int a = 0;
	int b = 0;
	int k;
	double[] sg = new double[41];
	double[] n = new double[41];
	double[] v = new double[41];
	double e;
	char[][] nv = new char[41][10];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		x = Integer.parseInt(tempVar);
	}
	for (i = 0;i < x;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		nv[i] = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		sg[i] = Double.parseDouble(tempVar3);
	}
	if (nv[i][0] == 'm')
	{
	n[p] = sg[i];
	p++;
	a++;
	}
	else
	{
	v[q] = sg[i];
	q++;
	b++;
	}

	}

	for (k = 1;k < a;k++)
	{
		for (i = 0;i < a - k;i++)
		{
			if (n[i] > n[i + 1])
			{
			e = n[i + 1];
			n[i + 1] = n[i];
			n[i] = e;
			}
		}
	}
	for (i = 0;i < a;i++)
	{
	System.out.printf("%.2lf ",n[i]);
	}

	for (k = 1;k < b;k++)
	{
		for (i = 0;i < b - k;i++)
		{
			if (v[i] > v[i + 1])
			{
			e = v[i + 1];
			v[i + 1] = v[i];
			v[i] = e;
			}
		}
	}

	for (i = b - 1;i > 0;i--)
	{
	System.out.printf("%.2lf ",v[i]);
	}
	System.out.printf("%.2lf",v[0]);
	return 0;
	}
}

