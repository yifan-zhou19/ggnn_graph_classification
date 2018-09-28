package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		int cc1;
		int cc2;
		int cc3;
		int cc;
		void line(int, int, int, int);
		for (z = 1; z <= 5; z++)
		{
			for (q = 1; q <= 5; q++)
			{
				for (s = 1; s <= 5; s++)
				{
					for (l = 1; l <= 5; l++)
					{
						cc1 = (z + q) == (s + l);
						cc2 = (z + l) > (s + q);
						cc3 = (z + s) < q;
						cc = cc1 + cc2 + cc3;
						if (cc == 3)
						{
							System.out.print('l');
							System.out.print(" ");
							System.out.print(l * 10);
							System.out.print("\n");
							System.out.print('q');
							System.out.print(" ");
							System.out.print(q * 10);
							System.out.print("\n");
							if (z > s)
							{
								System.out.print('z');
								System.out.print(" ");
								System.out.print(z * 10);
								System.out.print("\n");
								System.out.print('s');
								System.out.print(" ");
								System.out.print(s * 10);
								System.out.print("\n");
							}
							if (s > z)
							{
								System.out.print('s');
								System.out.print(" ");
								System.out.print(s * 10);
								System.out.print("\n");
								System.out.print('z');
								System.out.print(" ");
								System.out.print(z * 10);
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
