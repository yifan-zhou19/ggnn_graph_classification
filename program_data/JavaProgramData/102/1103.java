package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int x1 = 0;
	int x2 = 0;
	double[] h1 = new double[100];
	double[] h2 = new double[100];
	double[] h = new double[100];
	double t;
	String c = new String(new char[100]);
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
		c = tempVar2.charAt(0);
	}
	if (c.charAt(0) == 'm')
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		(h1[x1]) = Double.parseDouble(tempVar3);
	}
	x1++;
	}
	else
	{
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		(h2[x2]) = Double.parseDouble(tempVar4);
	}
	x2++;
	}
	}
	for (i = 0;i < x1 - 1;i++)
	{
		for (j = 0;j < x1 - 1 - i;j++)
		{
			if (h1[j] > h1[j + 1])
			{
	t = h1[j];
	h1[j] = h1[j + 1];
	h1[j + 1] = t;
			}
		}
	}
	for (i = 0;i < x2 - 1;i++)
	{
		for (j = 0;j < x2 - 1 - i;j++)
		{
			if (h2[j] < h2[j + 1])
			{
	t = h2[j];
	h2[j] = h2[j + 1];
	h2[j + 1] = t;
			}
		}
	}
	for (i = 0;i < x1;i++)
	{
	System.out.printf("%.2lf ",h1[i]);
	}
	for (i = 0;i < x2 - 1;i++)
	{
	System.out.printf("%.2lf ",h2[i]);
	}
	System.out.printf("%.2lf",h2[x2 - 1]);

	return 0;
	}
}

