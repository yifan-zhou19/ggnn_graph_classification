package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
	double[] a = new double[1000];
	double[] b = new double[1000];
	double t;
	double l = 0;
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
			a[i] = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b[i] = Double.parseDouble(tempVar3);
		}
	}
	for (i = 0;i < n;i++)
	{
		for (j = i + 1;j < n;j++)
		{
		t = Math.sqrt(Math.pow(a[i] - a[j],2) + Math.pow(b[i] - b[j],2));
	if (l < t)
	{
		l = t;
	}
		}
	}
		System.out.printf("%.4lf\n",l);
		return 0;
	}

}

