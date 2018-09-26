package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int[] a = new int[1001]; //a,b??????????????
	public static int[] b = new int[1001];
	public static int win; //?????????
	public static int lose;

	public static int cmp(Object e1, Object e2)
	{
		return *(int)e1 - (int)e2;
	}

	public static void cal(int m)
	{
		if (m == 0)
		{
			return;
		}

		if (a[1] > b[m])
		{
			win += m;
			return;
		}

		if (b[1] > a[m])
		{
			lose += m;
		}

		if (a[1] == b[m])
		{
			for (int i = 1; i < m; i++)
			{
				a[i] = a[i + 1];
			}
			cal(m - 1);
			return;
		}

		if (b[1] == a[m])
		{
			for (int i = 1; i < m; i++)
			{
				b[i] = b[i + 1];
			}
			cal(m - 1);
			return;
		}

		int i;
		int j;

		for (i = 1; i <= m; i++)
		{
			if (a[i] <= b[1])
			{
				continue;
			}
			for (j = 1; j <= m; j++)
			{
				if (a[i] > b[j] && j < m)
				{
					continue;
				}
				if (a[i] <= b[j])
				{
					j--;
				}
				for (int t = i; t < m; t++)
				{
					a[t] = a[t + 1];
				}
				for (int t = j; t < m; t++)
				{
					b[t] = b[t + 1];
				}
				win++;
				cal(m - 1);
				return;
			}
		}
	}


	public static int Main()
	{
		while (true)
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (n == 0)
			{
				break;
			}
			for (int i = 1; i <= n; i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (int i = 1; i <= n; i++)
			{
				b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			a[0] = b[0] = 0;
			qsort(a, n + 1, (Integer.SIZE / Byte.SIZE), cmp);
			qsort(b, n + 1, (Integer.SIZE / Byte.SIZE), cmp);
			win = 0;
			lose = 0;
			cal(n);
			System.out.print(200 * (win - lose));
			System.out.print("\n");
		}
		return 0;
	}
}

