package <missing>;

public class GlobalMembers
{
	public static double absss(double shu)
	{
		if (shu < 0)
		{
			shu = -shu;
		}
	return (shu);
	}


	public static int Main()
	{
		double absss = double shu;
		int n;
		int[] a = new int[500];
		int i;
		int m1 = 0;
		int m2 = 0;
		int j = 0;
		int p;
		int q;
	double s = 0.0;
	double max;
	double shu;
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
			a[i] = Integer.parseInt(tempVar2);
		}
		s = s + a[i];
	}
	s = (double)s / n;
	max = absss(s - a[0]);
	for (i = 1;i < n;i++)
	{
		if ((absss(a[i] - s)) > max)
		{
			max = absss(a[i] - s);

		}
	}
	for (i = 0;i < n;i++)
	{
		if (Math.abs(a[i] - s) == max)
		{
			max = absss(a[i] - s);
		}
	}

	for (i = 0;i < n;i++)
	{
	if (absss(a[i] - s) == max)
	{
	if (a[i] < s)
	{
		m1++;
		p = i;
	}
	if (a[i] > s)
	{
		m2++;
		q = i;
	}

	}
	}
	if (m1 > 0)
	{
		System.out.printf("%d",a[p]);
	for (i = 1;i < m1;i++)
	{
	System.out.printf(",%d",a[p]);
	}
	for (i = 0;i < m2;i++)
	{
	System.out.printf(",%d",a[q]);
	}
	}
	else
	{
		System.out.printf("%d",a[q]);
		for (i = 1;i < m2;i++)
		{
			System.out.printf(",d%",a[q]);
		}

	}


	return 0;
	}
}

