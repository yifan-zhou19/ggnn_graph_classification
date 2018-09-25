package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int k;
	int t;
	int l;
	double h;
	double e;
	double[] a = new double[100];
	double[] b = new double[100];
	String sex = new String(new char[10]);
	k = 0,t = 0;
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
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			h = Double.parseDouble(tempVar3);
		}
		if (strcmp(sex,"female") == 0)
		{
			a[t] = h;
			t++;
		}
		else
		{
			b[k] = h;
			k++;
		}
	}
	for (i = 0;i < t;i++)
	{
		for (l = i + 1;l < t;l++)
		{
			if (a[l] > a[i])
			{
				e = a[i];
				a[i] = a[l];
				a[l] = e;
			}
		}
	}
	for (i = 0;i < k;i++)
	{
		for (l = i + 1;l < k;l++)
		{
			if (b[l] < b[i])
			{
				e = b[i];
				b[i] = b[l];
				b[l] = e;
			}
		}
	}
	for (i = 0;i < k;i++)
	{
		System.out.printf("%.2lf ",b[i]);
	}
	for (i = 0;i < t - 1;i++)
	{
		System.out.printf("%.2lf ",a[i]);
	}
	System.out.printf("%.2lf\n",a[t - 1]);
	return 0;
	}
}

