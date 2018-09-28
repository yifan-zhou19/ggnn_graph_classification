package <missing>;

public class GlobalMembers
{
	public static int[] qw = new int[M];
	public static int[] tj = new int[M];
	public static int[] tmp = new int[M];

	public static void sort(int[] a, int n)
	{
		int k;
		int i;
		int b;
		int e;
		if (n <= 1)
		{
		return;
		}
		k = n / 2;
		sort(a, k);
		sort(a + k, n - k);
		for (i = 0; i < k; i++)
		{
		tmp[i] = a[i];
		}
		for (i = k; i < n; i++)
		{
		tmp[i] = a[n + k - i - 1];
		}
		b = 0, e = n - 1;
		for (i = 0; i < n; i++)
		{
		if (tmp[b] <= tmp[e])
		{
			a[i] = tmp[b++];
		}
		else
		{
			a[i] = tmp[e--];
		}
		}
	}

	public static int Main()
	{
		int n;
		int i;
		int res;
		int b1;
		int e1;
		int b2;
		int e2;
		while (scanf("%d", n) != EOF && n != 0)
		{
		for (i = 0; i < n; i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				tj[i] = Integer.parseInt(tempVar);
			}
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				qw[i] = Integer.parseInt(tempVar2);
			}
		}
		res = 0;
		sort(tj, n);
		sort(qw, n);
		b1 = b2 = 0, e1 = e2 = n - 1;
		while (b1 <= e1)
		{
			if (qw[b1] < tj[b2])
			{
			b1++, b2++, res++;
			}
			else if (qw[b1] > tj[b2])
			{
			e1--, b2++, res--;
			}
			else
			{
			if (qw[e1] < tj[e2])
			{
				e1--, e2--, res++;
			}
			else if (qw[e1] > tj[e2])
			{
				e1--, b2++, res--;
			}
			else
			{
				if (qw[e1] > tj[b2])
				{
				res--;
				}
				else if (qw[e1] < tj[b2])
				{
				res++;
				}
				e1--, b2++;
			}
			}
		}
		System.out.printf("%d\n", res * 200);
		}
		return 0;
	}

}

