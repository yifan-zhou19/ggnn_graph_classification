package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int n;
	int a;
	int b;
	int j;
	int c;
	int d;
	a = 0;
	b = 0;
	double z;
	double[] f = new double[40];
	double[] m = new double[40];
	String sex = new String(new char[7]);
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
		sex = tempVar2.charAt(0);
	}
	c = strcmp(sex,"male");
	d = strcmp(sex,"female");
	if (c == 0)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		m[a] = Double.parseDouble(tempVar3);
	}
	a++;
	}
	else if (d == 0)
	{
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		f[b] = Double.parseDouble(tempVar4);
	}
	b++;
	}
	}

	for (i = 0;i < a;i++)
	{
		for (j = a - 1;j > 0;j--)
		{
			if (m[j] < m[j - 1])
			{
				z = m[j];
				m[j] = m[j - 1];
				m[j - 1] = z;
			}
		}
		System.out.printf("%.2lf ",m[i]);
	}

	for (i = 0;i < b;i++)
	{
		for (j = b - 1;j > 0;j--)
		{
			if (f[j] > f[j - 1])
			{
				z = f[j];
				f[j] = f[j - 1];
				f[j - 1] = z;
			}
		}
		if (i == b - 1)
		{
		System.out.printf("%.2lf",f[i]);
		}
		else
		{
		System.out.printf("%.2lf ",f[i]);
		}
	}


	return 0;
	}
}

