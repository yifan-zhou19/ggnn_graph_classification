package <missing>;

public class GlobalMembers
{
	public static double[] ma = {0.00, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	public static double[] fe = {0.00, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

	public static void quick_sort1(double[] a, int l, int r)
	{
		if (l >= r)
		{
			return;
		}
		int lo = l;
		int hi = r;
		double k = a[l];
		while (lo != hi)
		{
			while ((lo < hi) && (a[hi] >= k))
			{
				hi--;
			}
			a[lo] = a[hi];
			while ((lo < hi) && (a[lo] <= k))
			{
				lo++;
			}
			a[hi] = a[lo];
		}
		a[lo] = k;
		quick_sort1(a, l, lo - 1);
		quick_sort1(a, lo + 1, r);
	}

	public static void quick_sort2(double[] a, int l, int r)
	{
		if (l >= r)
		{
			return;
		}
		int lo = l;
		int hi = r;
		double k = a[l];
		while (lo != hi)
		{
			while ((lo < hi) && (a[hi] <= k))
			{
				hi--;
			}
			a[lo] = a[hi];
			while ((lo < hi) && (a[lo] >= k))
			{
				lo++;
			}
			a[hi] = a[lo];
		}
		a[lo] = k;
		quick_sort2(a, l, lo - 1);
		quick_sort2(a, lo + 1, r);
	}


	public static int Main()
	{
		int n;
		int i;
		int man = 0;
		int feman = 0;
		String a = new String(new char[10]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 1; i <= n; i++)
		{
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			if (a.charAt(0) == 'm')
			{
				ma[man] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
				man++;
			}
			if (a.charAt(0) == 'f')
			{
				fe[feman] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
				feman++;
			}
			System.in.read();
		}
		man--;
		feman--;
		quick_sort1(ma, 0, man);
		quick_sort2(fe, 0, feman);
		for (i = 0; i <= man; i++)
		{
			System.out.printf("%.2f", ma[i]);
			System.out.printf("%.2f", " ");
		}
		for (i = 0; i <= feman - 1; i++)
		{
			System.out.printf("%.2f", fe[i]);
			System.out.printf("%.2f", " ");
		}
		System.out.printf("%.2f", fe[feman]);
		System.out.printf("%.2f", "\n");
		return 0;
	}

}

