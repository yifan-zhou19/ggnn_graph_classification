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
		int[] r = {0, 1, 1, 0, 0, 0};
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
						if (e == 2 || e == 3)
						{
							continue;
						}
						if ((e == 1) == r[a] && (b == 2) == r[b] && (a == 5) == r[c] && (c != 1) == r[d] && (d == 1) == r[e])
						{
							System.out.print(a);
							System.out.print(" ");
							System.out.print(b);
							System.out.print(" ");
							System.out.print(c);
							System.out.print(" ");
							System.out.print(d);
							System.out.print(" ");
							System.out.print(e);
						}
					}
				}
			}
		}
	}

}
