package <missing>;

public class GlobalMembers
{
	// ??? ?? 1000062708
	public static int Main()
	{
		char[] d = {'A', 'B', 'C', '\0'};
		int a;
		int b;
		int c;
		int ta;
		int tb;
		int tc;
		for (a = 1;a <= 3;a++)
		{
			for (b = 1;b <= 3;b++)
			{
				if (b != a)
				{
					for (c = 1;c <= 3;c++)
					{
						if (c != a && c != b)
						{
							ta = (b > a) + (c == a);
							tb = (a > b) + (a > c);
							tc = (c > b) + (b > a);
							if ((a + ta == 3) && (b + tb == 3) && (c + tc == 3))
							{
								System.out.print(d[3 - c]);
								System.out.print(d[3 - b]);
								System.out.print(d[3 - a]);
								System.out.print("\n");
							}
						}
					}
				}
			}
		}
		return 0;
	}





}
