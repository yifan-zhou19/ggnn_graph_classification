package <missing>;

public class GlobalMembers
{
	public static final int maxn = 1200;

	public static int cmp(Object e1, Object e2)
	{
		return *(int)e1 - (int)e2;
	}

	public static int Main()
	{
		int n;
		int[] a = new int[maxn];
		int[] b = new int[maxn];

		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (n == 0)
			{
				break;
			}

			for (int i = 0 ; i < n; i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (int i = 0; i < n; i++)
			{
				b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}

			qsort(a, n, (Integer.SIZE / Byte.SIZE), cmp);
			qsort(b, n, (Integer.SIZE / Byte.SIZE), cmp);

			int la;
			int lb;
			int ra;
			int rb;

			la = lb = 0;
			ra = rb = n - 1;

			int ans = 0;

			for (int i = 0; i < n; i++)
			{
				if (a[ra] > b[rb])
				{
					ans++;
					ra--, rb--;
					continue;
				}
				if (a[la] > b[lb])
				{
					ans++;
					la++, lb++;
					continue;
				}
				if (a[la] < b[rb])
				{
					ans--;
				}
				la++, rb--;
			}

			System.out.print(ans * 200);
			System.out.print("\n");

		}

		return 0;
	}
}

