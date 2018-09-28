package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int as;
		int bs;
		int cs;
		int ds;
		int es;
		int[] rank = new int[6];
		for (a = 1;a <= 5;a++)
		{
			for (b = 1;b <= 5;b++)
			{
				if (b == a)
				{
					continue;
				}
				for (c = 1;c <= 5;c++)
				{
					if (c == a || c == b)
					{
						continue;
					}
					for (d = 1;d <= 5;d++)
					{
						if (d == a || d == b || d == c)
						{
							continue;
						}
						e = 15 - a - b - c - d;
						as = (e == 1);
						bs = (b == 2);
						cs = (a == 5);
						ds = (c != 1);
						es = (d == 1);
						rank[a] = as;
						rank[b] = bs;
						rank[c] = cs;
						rank[d] = ds;
						rank[e] = es;
						if (rank[1] == 1 && rank[2] == 1 && rank[3] == 0 && rank[4] == 0 && rank[5] == 0 && e != 2 && e != 3)
						{
							System.out.print(a);
							System.out.print(' ');
							System.out.print(b);
							System.out.print(' ');
							System.out.print(c);
							System.out.print(' ');
							System.out.print(d);
							System.out.print(' ');
							System.out.print(e);

						}

					}
				}
			}
		}
		return 0;
	}
}
