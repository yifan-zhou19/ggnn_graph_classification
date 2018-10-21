package <missing>;

public class GlobalMembers
{
	public static int Compare(Object a, Object b)
	{
		return *(int)a - (int)b;
	}
	public static int Main()
	{
		int n;
		int[] q = new int[1000];
		int[] t = new int[1000];
		int i;
		int mon;
		int qmax;
		int tmax;
		int qmin;
		int tmin;
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (n == 0)
			{
				return 0;
			}
			for (i = 0;i < n;i++)
			{
				t[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (i = 0;i < n;i++)
			{
				q[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			mon = 0;
			qsort(t,n,(Integer.SIZE / Byte.SIZE),Compare);
			qsort(q,n,(Integer.SIZE / Byte.SIZE),Compare);
			tmin = qmin = 0;
			tmax = qmax = n - 1;
			for (i = 0;i < n;i++)
			{
				if (t[tmax] > q[qmax])
				{
					mon += 200;
					tmax--;
					qmax--;
				}
				else if (t[tmin] > q[qmin])
				{
					mon += 200;
					tmin++;
					qmin++;
				}
				else
				{
					if (t[tmin] != q[qmax])
					{
						mon -= 200;
					}
					tmin++;
					qmax--;
				}
			}
			System.out.print(mon);
			System.out.print("\n");
		}
		return 0;
	}
}

