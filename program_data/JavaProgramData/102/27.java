package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int t = 0;
		int q = 0;
		int i;
		int k;
		double[] m = new double[40];
		double[] w = new double[40];
		double e;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//		char x[20];
	//		double y;
	//	}
	//	a[50];
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
				a[i].x = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i].y = tempVar3;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (String.valueOf(a[i].x).length() == 4)
			{
				m[t] = a[i].y;
				t++;
			}
			if (String.valueOf(a[i].x).length() == 6)
			{
				w[q] = a[i].y;
				q++;
			}
		}
		for (i = 0;i < t;i++)
		{
			for (k = 0;k < t - i - 1;k++)
			{
				if (m[k] > m[k + 1])
				{
					e = m[k];
					m[k] = m[k + 1];
					m[k + 1] = e;
				}
			}
		}
	for (i = 0;i < q;i++)
	{
			for (k = 0;k < q - i - 1;k++)
			{
				if (w[k] < w[k + 1])
				{
					e = w[k];
					w[k] = w[k + 1];
					w[k + 1] = e;
				}
			}
	}
	for (i = 0;i < t;i++)
	{
		System.out.printf("%.2lf ",m[i]);
	}
	for (i = 0;i < q - 1;i++)
	{
		System.out.printf("%.2lf ",w[i]);
	}
	System.out.printf("%.2lf",w[q - 1]);

		return 0;

	}
}

