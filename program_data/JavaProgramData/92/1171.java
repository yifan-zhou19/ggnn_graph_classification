package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int[] tj = new int[1000];
	public static int[] qw = new int[1000];

	public static void input(int[] a)
	{
		int i;
		int j;
		int t;
		for (i = 0;i < n;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a + i = tempVar;
			}
			for (j = i;j > 0;j--)
			{
				if (a[j] > a[j - 1])
				{
				t = a[j];
				a[j] = a[j - 1];
				a[j - 1] = t;
				}
				else
				{
					break;
				}
			}
		}
	}

//C++ TO JAVA CONVERTER WARNING: The following constructor is declared outside of its associated class:
	public static horse()
	{
		int m = 0;
		int tf = 0;
		int qf = 0;
		int ts = n - 1;
		int qs = n - 1;
		while (tf <= ts)
		{
			if (tj[tf] > qw[qf])
			{
				m++;
				tf++;
				qf++;
			}
			else if (tj[tf] < qw[qf])
			{
				m--;
				ts--;
				qf++;
			}
			else
			{
				if (tj[ts] > qw[qs])
				{
					m++;
					ts--;
					qs--;
				}
				else if (tj[ts] < qw[qs])
				{
					m--;
					ts--;
					qf++;
				}
				else
				{
					if (tj[ts] < qw[qf])
					{
						m--;
						ts--;
						qf++;
					}
					else
					{
						return m;
					}
				}
			}
		}
		return m;
	}

	public static int Main()
	{
		int money;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n != 0)
		{
			input(tj);
			input(qw);
			money = horse() * 200;
			System.out.printf("%d\n",money);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
		}
	}
}

