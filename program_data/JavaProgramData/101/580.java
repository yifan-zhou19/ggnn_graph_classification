package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x1;
		int x2;
		int x3;
		int x4;
		int x5;
		int x6;
		int a;
		int b;
		int c;
		int[] t = new int[3];
		for (a = 0;a <= 2;a++)
		{
			for (b = 0;b <= 2;b++)
			{
				for (c = 0;c <= 2;c++)
				{
					x1 = (b > a);
					x2 = (c == a);
					x3 = (a > b);
					x4 = (a > c);
					x5 = (c > b);
					x6 = (b > a);
					t[0] = x1 + x2;
					t[1] = x3 + x4;
					t[2] = x5 + x6;
					if (t[0] == 2 - a && t[1] == 2 - b && t[2] == 2 - c)
					{
						if (t[0] > t[1] && t[0] > t[2])
						{
							System.out.print("A");
							if (t[1] > t[2])
							{
								System.out.print("BC");
							}
							else
							{
								System.out.print("CB");
							}
							return -1;
						}
						if (t[1] > t[0] && t[1] > t[2])
						{
							System.out.print("B");
							if (t[0] > t[2])
							{
								System.out.print("AC");
							}
							else
							{
								System.out.print("CA");
							}
							return -1;
						}
						if (t[2] > t[1] && t[2] > t[0])
						{
							System.out.print("C");
							if (t[1] > t[0])
							{
								System.out.print("BA");
							}
							else
							{
								System.out.print("AB");
							}
							return -1;
						}
					}
				}
			}
		}
				return 0;
	}

}
