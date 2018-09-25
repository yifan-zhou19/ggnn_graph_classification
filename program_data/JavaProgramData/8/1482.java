package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;

	public static int cmp(Object a, Object b)
	{
		return *(int)a - (int)b;
	}

	public static void input(int[] a, int[] b)
	{
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = tempVar3;
			}
		}
		for (i = 0; i < m; i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[i] = tempVar4;
			}
		}
	}

	public static void sort(tangible.RefObject<Integer> a, tangible.RefObject<Integer> b)
	{
		qsort(a.argValue, n, (Integer.SIZE / Byte.SIZE), cmp);
		qsort(b.argValue, m, (Integer.SIZE / Byte.SIZE), cmp);
	}

	public static void merge(int[] a, int[] b, int[] c)
	{
		int i;
		for (i = 0; i < n; i++)
		{
			c[i] = a[i];
		}
		for (i = 0; i < m; i++)
		{
			c[i + n] = b[i];
		}
	}

	public static void output(int[] c)
	{
		int i;
		for (i = 0;i < m + n; i++)
		{
			System.out.printf("%d%s", c[i], i < m + n - 1 ? " " : "\n");
		}
	}
	public static int Main()
	{
		int[] a = new int[10000];
		int[] b = new int[10000];
		int[] c = new int[10000];
		input(a, b);
	tangible.RefObject<Integer> tempRef_a = new tangible.RefObject<Integer>(a);
	tangible.RefObject<Integer> tempRef_b = new tangible.RefObject<Integer>(b);
		sort(tempRef_a, tempRef_b);
		b = tempRef_b.argValue;
		a = tempRef_a.argValue;
		merge(a, b, c);
		output(c);
		return 0;
	}
}

