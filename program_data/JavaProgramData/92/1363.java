package <missing>;

public class GlobalMembers
{
	public static int compare(Object p, Object q)
	{
		return *((int)p) - (int)q;
	}
	public static int Main()
	{
		int n;
		int i;
		int[] t = new int[1000];
		int[] q = new int[1000];
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (n == 0)
			{
				break;
			}
			int count = 0;
			for (i = 0;i < n;i++)
			{
				t[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (i = 0;i < n;i++)
			{
				q[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			qsort(t,n,(Integer.SIZE / Byte.SIZE),compare);
			qsort(q,n,(Integer.SIZE / Byte.SIZE),compare);
			int tmin = 0;
			int tmax = n - 1;
			int qmin = 0;
			int qmax = n - 1;
			while (tmin <= tmax)
			{
				if (t[tmax] < q[qmax])
				{
					qmax--;
					tmin++;
					count--;
				}
				else if (t[tmax] > q[qmax])
				{
					qmax--;
					tmax--;
					count++;
				}
				else
				{
					if (t[tmin] > q[qmin])
					{
						count++;
						tmin++;
						qmin++;
					}
					else if (t[tmin] < q[qmin])
					{
						count--;
						tmin++;
						qmax--;
					}
					else
					{
						if (t[tmax] > t[tmin])
						{
							count--;
							tmin++;
							qmax--;
						}
						else
						{
							break;
						}
					}
				}
			}
			System.out.print(count * 200);
			System.out.print("\n");
		}
		return 0;
	}
}

