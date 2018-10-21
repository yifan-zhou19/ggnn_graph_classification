package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int k;
	String s = new String(new char[10]);
	double[] m = new double[42];
	double[] f = new double[42];
	double temp;
	int nm;
	int nf;
	int n;

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	n--;
	nm = -1;
	nf = -1;
	for (i = 0;i <= n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		s = tempVar2.charAt(0);
	}
	if (s.charAt(0) == 'm')
	{
		nm++;
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m[nm] = Double.parseDouble(tempVar3);
		}
	}
	else
	{
		nf++;
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			f[nf] = Double.parseDouble(tempVar4);
		}
	}
	}

	for (i = 0;i <= nm - 1;i++)
	{
	for (j = i + 1;j <= nm;j++)
	{
	if (m[i] > m[j])
	{
	temp = m[i];
	m[i] = m[j];
	m[j] = temp;
	}
	}
	}
	for (i = 0;i <= nf - 1;i++)
	{
	for (j = i + 1;j <= nf;j++)
	{
	if (f[i] < f[j])
	{
	temp = f[i];
	f[i] = f[j];
	f[j] = temp;
	}
	}
	}

	System.out.printf("%.2f",m[0]);
	for (i = 1;i <= nm;i++)
	{
		System.out.printf(" %.2f",m[i]);
	}
	for (i = 0;i <= nf;i++)
	{
		System.out.printf(" %.2f",f[i]);
	}
	System.out.print("\n");
	}
}

