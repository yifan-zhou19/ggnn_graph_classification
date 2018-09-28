package <missing>;

public class GlobalMembers
{
	public static int comp(Object a, Object b)
	{
		return *(int)b - (int)a;
	}
	public static int Main()
	{
		int n;
		int i;
		int[] t = new int[1001];
		int[] q = new int[1001];
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (n == 0)
			{
				break;
			}
			for (i = 0;i < n;i++)
			{
				t[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (i = 0;i < n;i++)
			{
				q[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			qsort(t, n, (Integer.SIZE / Byte.SIZE), comp);
			qsort(q, n, (Integer.SIZE / Byte.SIZE), comp);
			int tl = 0;
			int ql = 0;
			int tr = n - 1;
			int qr = n - 1;
			int result = 0;
			while (tl <= tr)
			{
				if (t[tl] > q[ql])
				{
					result += 200;
					tl++;
					ql++;
				}
				else if (t[tr] > q[qr])
				{
					result += 200;
					tr--;
					qr--;
				}
				else
				{
					if (t[tr] > q[ql])
					{
						result += 200;
					}
					else if (t[tr] < q[ql])
					{
						result -= 200;
					}
					tr--;
					ql++;
				}
			}
			System.out.print(result);
			System.out.print("\n");
		}
	}
}

