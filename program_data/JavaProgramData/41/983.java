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
		int i1;
		int i2;
		int i3;
		int i4;
		int i5;
		int[] s = new int[6];
		for (i1 = 1; i1 <= 5; i1++)
		{
			a = i1;
			for (i2 = 1; i2 <= 5; i2++)
			{
				b = i2;
				for (i3 = 1; i3 <= 5; i3++)
				{
					c = i3;
					for (i4 = 1; i4 <= 5; i4++)
					{
						d = i4;
						for (i5 = 1; i5 <= 5; i5++)
						{
							e = i5;
							if (a != b && a != c && a != d && a != e && b != c && b != d && b != e && c != d && c != e && d != e && e != 2 && e != 3)
							{
								s[a] = (boolean)(e == 1);
								s[b] = (boolean)(b == 2);
								s[c] = (boolean)(a == 5);
								s[d] = (boolean)(c != 1);
								s[e] = (boolean)(d == 1);
								if ((s[1] == 1) && (s[2] == 1) && (s[3] + s[4] + s[5] == 0))
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
		return 0;
	}

}
