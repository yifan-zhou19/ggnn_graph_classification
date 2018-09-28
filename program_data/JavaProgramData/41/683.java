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
		int[] num = new int[6];
		for (a = 1 ; a < 6 ; a++)
		{
			for (b = 1 ; b < 6 ; b++)
			{
				if (a == b)
				{
					continue;
				}
				for (c = 1 ; c < 6 ; c++)
				{
					if (a == c || b == c)
					{
						continue;
					}
					for (d = 1 ; d < 6 ; d++)
					{
						if (a == d || b == d || c == d)
						{
							continue;
						}
						for (e = 1 ; e < 6 ; e++)
						{
							if (a == e || b == e || c == e || d == e)
							{
								continue;
							}
							num[0] = (e != 2 && e != 3);
							num[a] = (e == 1);
							num[b] = (b == 2);
							num[c] = (a == 5);
							num[d] = (c != 1);
							num[e] = (d == 1);
							if (num[0] == 1 && num[1] == 1 && num[2] == 1 && num[3] == 0 && num[4] == 0 && num[5] == 0)
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
