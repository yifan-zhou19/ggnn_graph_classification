package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int[] t = new int[1000];
	public static int[] q = new int[1000];

	public static int cmp(Object e1, Object e2)
	{
		return *(int)e2 - (int)e1;
	}

	public static int Main()
	{
		int i;
		int st;
		int sq;
		int et;
		int eq;
		int count;
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (n == 0)
			{
				break;
			}
			for (i = 0; i < n; i++)
			{
				t[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (i = 0; i < n; i++)
			{
				q[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}

			qsort(t, n, (Integer.SIZE / Byte.SIZE), cmp);
			qsort(q, n, (Integer.SIZE / Byte.SIZE), cmp);

			st = sq = 0;
			et = eq = n - 1;
			count = 0;
			while (st <= et)
			{
				if (t[et] > q[eq])
				{
					count++;
					et--;
					eq--;
				}
				else if (t[et] < q[eq])
				{
					count--;
					et--;
					sq++;
				}
				else
				{
					if (t[st] > q[sq])
					{
						count++;
						st++;
						sq++;
					}
					else
					{
						if (t[et] < q[sq])
						{
							count--;
						}
						et--;
						sq++;
					}
				}
			}
			System.out.print(200 * count);
			System.out.print("\n");
		}
		return 0;
	}
}

