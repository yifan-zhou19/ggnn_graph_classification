package <missing>;

public class GlobalMembers
{
	public static int cmp(Object a, Object b)
	{
		return *(int)b - (int)a;
	}

	public static int Main()
	{
		int n;
		int i;
		while ((n, n > 0 = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
		int[] t = new int[1000];
		int[] q = new int[1000];
		for (i = 0;i < n;i++)
		{
			t[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			q[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		qsort(t,n,(Integer.SIZE / Byte.SIZE),cmp);
		qsort(q,n,(Integer.SIZE / Byte.SIZE),cmp);
		int t1 = 0;
		int t2 = n - 1;
		int q1 = 0;
		int q2 = n - 1;
		int cnt = 0;
		for (i = 0;i < n;i++)
		{
			if (t[t1] > q[q1])
			{
				t1++;
				q1++;
				cnt += 200;
			}
			else
			{
				if (t[t2] > q[q2])
				{
					t2--;
					q2--;
					cnt += 200;
				}
				else
				{
					if (t[t2] < q[q1])
					{
						cnt -= 200;
					}
					t2--;
					q1++;
				}
			}
		}
		System.out.print(cnt);
		System.out.print("\n");
		}
		return 0;
	}


}

