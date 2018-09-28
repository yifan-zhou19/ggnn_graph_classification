package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int m;
	public static int[] a = new int[1000];
	public static int[] b = new int[1000];
	public static int[] c = new int[2000];

	public static void read()
	{
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0; i < n; ++i)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a + i = tempVar3;
			}
		}
		for (i = 0; i < m; ++i)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b + i = tempVar4;
			}
		}
	}

	public static int cmp(Object a, Object b)
	{
		return *((int)a) - (int)b;
	}

	public static void sort()
	{
		qsort(a, n, (Integer.SIZE / Byte.SIZE), cmp);
		qsort(b, m, (Integer.SIZE / Byte.SIZE), cmp);
	}

	public static void merge()
	{
		int i;
		for (i = 0; i < n; ++i)
		{
			c[i] = a[i];
		}
		for (i = 0; i < m; ++i)
		{
			c[n + i] = b[i];
		}
	}

	public static void output()
	{
		int i;
	System.out.printf("%d",c[0]);
		for (i = 1; i < n + m; ++i)
		{
			System.out.printf(" %d", c[i]);
		}
	}

	public static int Main()
	{
		read();
		sort();
		merge();
		output();
		return 0;
	}

}

