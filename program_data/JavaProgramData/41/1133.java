package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a; //a,b,c,d,e????????????
		int b;
		int c;
		int d;
		int e;
		int x1;
		int x2;
		int x3;
		int x4;
		int x5;

		for (a = 1;a < 6;a++)
		{
			for (b = 1;b < 6;b++)
			{

				for (c = 1;c < 6;c++)
				{
					if (b == a)
					{
					break;
					}

					for (d = 1;d < 6;d++)
					{
						if (c == b)
						{
						break;
						}
					if (c == a)
					{
						break;
					}

					for (e = 4;e < 6;e++)
					{
						if (d == c)
						{
							break;
						}
						if (d == b)
						{
							break;
						}
						if (d == a)
						{
							break;
						}
						if (e == a)
						{
							break;
						}
						if (e == b)
						{
							break;
						}
						if (e == c)
						{
							break;
						}
						if (e == d)
						{
							break; //????????????
						}
						x1 = ((a < 3) && (e == 1)) || ((a>2) && (e != 1));
						x2 = (b == 2) || (b > 2);
						x3 = ((c < 3) && (a == 5)) || ((c>2) && (a < 5));
						x4 = ((d < 3) && (c != 1)) || ((d>2) && (c == 1));
						x5 = (d != 1); //???????

						if (x1 + x2 + x3 + x4 + x5 == 5)
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
