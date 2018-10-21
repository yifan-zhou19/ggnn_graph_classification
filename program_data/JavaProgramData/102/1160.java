package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int i = 0;
		int j = 0;
		int k = 0;
		int m = 0;
		double e = 0;
		double f = 0;
		double[] g = new double[50];
		double[] a = new double[50];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct ren
	//	{
	//		char s[10];
	//		double h;
	//	}
	//	rens[50];
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
				rens[i].s = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				rens[i].h = tempVar3;
			}
		}
		j = 0;
		k = 0;
		for (i = 0;i < n;i++)
		{
			if (rens[i].s[0] == 'm')
			{
				g[j] = rens[i].h;
				j++;
			}
			else
			{
				a[k] = rens[i].h;
				k++;
			}
		}
		for (m = 1;m <= j;m++)
		{
			for (i = 0;i < j - m;i++)
			{
				if (g[i] > g[i + 1])
				{
					e = g[i + 1];
					g[i + 1] = g[i];
					g[i] = e;
				}
			}
		}
		for (m = 1;m <= k;m++)
		{
			for (i = 0;i < k - m;i++)
			{
				if (a[i] > a[i + 1])
				{
					f = a[i];
					a[i] = a[i + 1];
					a[i + 1] = f;
				}
			}
		}
		System.out.printf("%.2lf",g[0]);
		for (i = 1;i < j;i++)
		{
			System.out.printf(" %.2lf",g[i]);
		}
		for (i = k - 1;i >= 0;i--)
		{
			System.out.printf(" %.2lf",a[i]);
		}
		return 0;

	}
}

