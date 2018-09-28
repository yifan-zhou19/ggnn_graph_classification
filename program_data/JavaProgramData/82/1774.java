package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int ss;
		int sz;
		int p;
		int q;
		int[] a = new int[100];
		for (i = 0 ; i <= 99 ; i++)
		{
			a[i] = 0;
		}
		p = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1 ; i <= n ; i++)
		{
			ss = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sz = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if ((ss >= 90) && (ss <= 140) && (sz >= 60) && (sz <= 90))
			{
				a[p] = a[p] + 1;
			}
			else
			{
				p = p + 1;
			}
		}
			q = 0;
			for (i = 0 ; i <= 99 ; i++)
			{
				if (a[i] > a[q])
				{
					q = i;
				}
			}

			System.out.print(a[q]);
			System.out.print("\n");
			return 0;
	}

}

