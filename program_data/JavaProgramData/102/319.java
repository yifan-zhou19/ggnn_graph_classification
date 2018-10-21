package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int q;
	int j = 0;
	int k = 0;
	double[] m = new double[40];
	double[] f = new double[40];
	double e;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct p
	//{
	//	char x[7];
	//	double h;
	//}
	//a[40];
	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i].x = tempVar2;
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[i].h = tempVar3;
		}
		if (strcmp("female",a[i].x) == 0)
		{
			f[j] = a[i].h;
			j++;
		}
		else
		{
			m[k] = a[i].h;
			k++;
		}
	}
	for (q = 1;q <= j;q++)
	{
		for (i = 0;i < j - q;i++)
		{
			if (f[i] > f[i + 1])
			{
			   e = f[i + 1];
			   f[i + 1] = f[i];
			   f[i] = e;
			}
		}
	}
	for (q = 1;q <= k;q++)
	{
		for (i = 0;i < k - q;i++)
		{
			if (m[i] > m[i + 1])
			{
				e = m[i + 1];
				m[i + 1] = m[i];
				m[i] = e;
			}
		}
	}
	System.out.printf("%.2lf",m[0]);
	for (i = 1;i < k;i++)
	{
		System.out.printf(" %.2lf",m[i]);
	}
	for (i = j - 1;i >= 0;i--)
	{
		System.out.printf(" %.2lf",f[i]);
	}
	return 0;
	}




}

