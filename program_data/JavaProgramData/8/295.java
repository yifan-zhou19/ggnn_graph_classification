package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int m;
	public static int[] a = new int[1000];
	public static int[] b = new int[1000];
	public static void qsort(int l,int r)
	{
		int i;
		int j;
		int k;
		int x;
		i = l;
		j = r;
		k = 0;
		x = a[(i + j) / 2];
		while (i <= j)
		{
			while (a[i] < x)
			{
				i++;
			}
			while (x < a[j])
			{
				j--;
			}
			if (i <= j)
			{
				k = a[i];
				a[i] = a[j];
				a[j] = k;
				i++;
				j--;
			}
		}
		if (i < r)
		{
			qsort(i, r);
		}
		if (l < j)
		{
			qsort(l, j);
		}
	}

	public static void qsort2(int l,int r)
	{
		int i;
		int j;
		int k;
		int x;
		i = l;
		j = r;
		k = 0;
		x = (i + j) / 2;
		while (i < j)
		{
			while (b[i] < b[x])
			{
				i++;
			}
			while (b[x] < b[j])
			{
				j--;
			}
			if (i <= j)
			{
				k = b[i];
				b[i] = b[j];
				b[j] = k;
				i++;
				j--;
			}
		}
		if (i < r)
		{
			qsort2(i, r);
		}
		if (l < j)
		{
			qsort2(l, j);
		}
	}

	public static void input()
	{
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1;i <= m;i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}

	public static void output()
	{
		int i;
		for (i = 1;i <= n;i++)
		{
		System.out.print(a[i]);
		System.out.print(" ");
		}
		for (i = 1;i < m;i++)
		{
		System.out.print(b[i]);
		System.out.print(" ");
		}
		System.out.print(b[m]);
		System.out.print("\n");
	}

	public static int Main()
	{
		input();
		qsort(1, n);
		qsort2(1, m);
		output();
		return 0;
	}

}

