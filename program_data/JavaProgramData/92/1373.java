package <missing>;

public class GlobalMembers
{
	public static int compare(Object e1, Object e2)
	{
		return *((int)e2) - (int)e1;
	}

	public static int Main()
	{
		int n;
		int i;
		int ql;
		int qr;
		int tl;
		int tr;
		int total = 0;
		int[] t = new int[1000];
		int[] q = new int[1000];
		while ((n != 0 && n = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
	total = 0;
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
		ql = 0;
		qr = n - 1;
		tl = 0;
		tr = n - 1;
		while (ql <= qr)
		{
			if (q[ql] > t[tl])
			{
				tr--;
				ql++;
				total -= 200;
				continue;
			}
			if (q[ql] < t[tl])
			{
				ql++;
				tl++;
				total += 200;
				continue;
			}
			if (q[qr] > t[tr])
			{
				ql++;
				tr--;
				total -= 200;
				continue;
			}
			if (q[qr] < t[tr])
			{
				qr--;
				tr--;
				total += 200;
				continue;
			}
			int flag = 0;
			for (i = ql;i + 1 <= qr;i++)
			{
				if (q[i] != q[i + 1])
				{
					flag = 1;
					break;
				}
			}
			if (flag == 0)
			{
				break;
			}
			ql++;
			tr--;
			total -= 200;
		}
		System.out.print(total);
		System.out.print("\n");
		}
		return 0;
	}

}

