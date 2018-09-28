package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int count;
		int p;
		int xh;
		int[] a = new int[310]; // a??? ????????????
		int[] b = new int[310]; // b???? ??????? ?????????????i???????????
		// ?????????????count?1
		while (ConsoleInput.lastReadWasGood())
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if ((n == 0) && (m == 0))
			{
				return 0;
			}
			for (i = 1; i <= n; i++)
			{
				a[i] = 1;
			}
			count = n;
			p = 1;
			while (count != 1)
			{
				// ????????b??
				xh = 1;
				while (xh <= m)
				{
					if (a[p] == 1)
					{
						xh++;
					}
					if (p <= n - 1)
					{
						p++;
					}
					else
					{
						p = (p + 1) % n;
					}
				}
				if (p == 1)
				{
					a[n] = 0;
				}
				else
				{
					a[p - 1] = 0;
				}
				count = count - 1;
			}
			for (i = 1; i <= n; i++)
			{
				if (a[i] == 1)
				{
					System.out.print(i);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

