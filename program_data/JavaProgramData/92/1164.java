package <missing>;

public class GlobalMembers
{
	public static int[] tj = new int[M];
	public static int[] qw = new int[M];
	public static int n;

	public static int cmp(Object a, Object b)
	{
		return *(int)a - (int)b;
	}

	public static int Main()
	{
		int i;
		int b;
		int e;
		int bb;
		int ee;
		int sum;
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
		qsort(tj, n, (Integer.SIZE / Byte.SIZE), cmp);
		qsort(qw, n, (Integer.SIZE / Byte.SIZE), cmp);
		b = bb = 0;
		e = ee = n - 1;
		sum = 0;
		while (b <= e)
		{
			if (tj[e] > qw[ee])
			{
			++sum, --e, --ee;
			}
			else if (tj[e] < qw[ee])
			{
			--sum, ++b, --ee;
			}
			else if (tj[b] > qw[bb])
			{
			++sum, ++b, ++bb;
			}
			else if (tj[b] < qw[bb])
			{
			--sum, ++b, --ee;
			}
			else
			{
			if (tj[b] < qw[ee])
			{
				--sum, ++b, --ee;
			}
			else
			{
				++b, --ee;
			}
			}
		}
		System.out.printf("%d\n", sum * 200);
		}
		return 0;
	}
}

