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
		int[] m = new int[6];
		for (a = 1;a <= 5;a++)
		{
			for (b = 1;b <= 5;b++)
			{
				if (a != b)
				{
				for (c = 1;c <= 5;c++)
				{
					if (a != c && b != c)
					{
					for (d = 1;d <= 5;d++)
					{
						if (a != d && b != d && c != d)
						{
						e = 15 - a - b - c - d;
						if ((e != 2) && (e != 3))
						{
							m[a] = e == 1;
							m[b] = b == 2;
							m[c] = a == 5;
							m[d] = c != 1;
							m[e] = d == 1;
						if ((m[1] != 0 && m[2] != 0) == 1 && (m[3] != 0 || m[4] != 0 || m[5] != 0) == 0)
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
							System.out.print("\n");
						}
						}
						}
					}
					}
				}
				}
			}
		}
		return 0;
	}
}
