package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	double h;
	double p;
	double[] b = new double[40];
	double[] c = new double[40];
		int n;
		int i;
		int t;
		int j = 1;
		int k = 1;
		String a = new String(new char[10]);
		final String d = "male";
		final String e = "female";
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead("\n");
	if (tempVar2 != null)
	{
		a = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		h = Double.parseDouble(tempVar3);
	}
	if (strcmp(a,d) == 0)
	{
	b[j] = h;
	j += 1;
	continue;
	}
	if (strcmp(a,e) == 0)
	{
	c[k] = h;
	k = k + 1;
	}
	}
	j = j - 1;
	k = k - 1;
	for (i = 1;i <= j;i++)
	{
	for (t = i;t <= j;t++)
	{
	if (b[i] > b[t])
	{
	p = b[i];
	b[i] = b[t];
	b[t] = p;
	}
	}
	}
	for (i = 1;i <= k;i++)
	{
	for (t = i;t <= k;t++)
	{
	if (c[i] < c[t])
	{
	p = c[i];
	c[i] = c[t];
	c[t] = p;
	}
	}
	}
	for (i = 1;i <= j;i++)
	{
	System.out.printf("%.2lf ",b[i]);
	}
	for (i = 1;i < k;i++)
	{
	System.out.printf("%.2lf ",c[i]);
	}
	System.out.printf("%.2lf",c[k]);

	return 0;
	}

}

