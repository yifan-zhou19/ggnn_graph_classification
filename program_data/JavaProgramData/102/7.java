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
	double[] m = new double[40];
	double[] f = new double[40];
	int nm = 0;
	int nf = 0;
	int i;
	for (i = 0; i < n; i++)
	{
	String sex = new String(new char[7]);
	double h;
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		sex = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		h = Double.parseDouble(tempVar3);
	}
	if (sex.charAt(0) == 'm')
	{
	nm++;
	m[nm - 1] = h;
	}
	else
	{
	nf++;
	f[nf - 1] = h;
	}
	}

	int j;
	for (i = 0; i < nm - 1; i++)
	{
	for (j = i + 1; j < nm; j++)
	{
	if (m[i] > m[j])
	{
	double t = m[i];
	m[i] = m[j];
	m[j] = t;
	}
	}
	}

	for (i = 0; i < nf - 1; i++)
	{
	for (j = i + 1; j < nf; j++)
	{
	if (f[i] < f[j])
	{
	double t = f[i];
	f[i] = f[j];
	f[j] = t;
	}
	}
	}

	for (i = 0; i < nm; i++)
	{
		System.out.printf("%.2lf ",m[i]);
	}
	for (i = 0; i < nf; i++)
	{
	System.out.printf("%.2lf",f[i]);
	if (i < nf - 1)
	{
		System.out.print(" ");
	}
	else
	{
		System.out.print("\n");
	}
	}

	return 0;
	}


}

