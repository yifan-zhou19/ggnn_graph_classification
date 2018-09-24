package <missing>;

public class GlobalMembers
{
	public static int s(int a,int b)
	{
		int p;
		int q;
		if (a > b)
		{
			p = a;
			q = b;
		}
		else
		{
			p = b;
			q = a;
		}
		p = p / 2;
		if (p == q)
		{
			return p;
		}
		else
		{
			s(p, q);
		}
	}
	public static int Main()
	{
		int m;
		int n;
		int re;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (m == n)
		{
			System.out.print(m);
		}
		else
		{
			re = s(m, n);
			   System.out.print(re);
			   System.out.print("\n");
		}
		return 0;
	}

}

