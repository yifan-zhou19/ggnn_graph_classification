package <missing>;

public class GlobalMembers
{
	public static void swap(tangible.RefObject<Integer> x, tangible.RefObject<Integer> y)
	{
		int z;
		z = x.argValue;
		x.argValue = y.argValue;
		y.argValue = z;
	}

	public static int Main()
	{
		int n;
		int ts;
		int qs;
		int te;
		int qe;
		int i;
		int j;
		int ans;
		int[] t = new int[1005];
		int[] q = new int[1005];

		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			if (n == 0)
			{
				break;
			}
			for (i = 0; i < n; i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					t[i] = Integer.parseInt(tempVar2);
				}
			}
			for (i = 0; i < n; i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					q[i] = Integer.parseInt(tempVar3);
				}
			}
			for (i = 1; i < n; i++)
			{
				for (j = 0; j < i; j++)
				{
					if (t[i] > t[j])
					{
						swap(t[i], t[j]);
					}
					if (q[i] > q[j])
					{
						swap(q[i], q[j]);
					}
				}
			}
			ts = qs = 0;
			te = qe = n - 1;
			ans = 0;
			for (i = 0; i < n; i++)
			{
				if (t[te] > q[qe])
				{
					ans++;
					te--;
					qe--;
				}
				else if (t[te] < q[qe])
				{
					ans--;
					te--;
					qs++;
				}
				else
				{
					if (t[ts] > q[qs])
					{
						ans++;
						ts++;
						qs++;
					}
					else if (t[ts] < q[qs])
					{
						ans--;
						te--;
						qs++;
					}
					else
					{
						if (q[qs] > t[te])
						{
							ans--;
						}
						qs++;
						te--;
					}
				}
			}
			System.out.printf("%d\n", ans * 200);
		}
			return 0;
	}
}

