package <missing>;

public class GlobalMembers
{
	public static int Main()
	{


		int cc1;
		int cc2;
		int cc3;
		int cc4;
		char z;
		char q;
		char s;
		char l;
		for (z = 1;z <= 4;z++)
		{
			for (q = 1;q <= 4;q++)
			{
				for (s = 1;s <= 4;s++)
				{
					for (l = 1;l <= 4;l++)
					{
						cc1 = ((q + z) == (s + l));
					}
				}
			}
		}
						cc2 = ((z + l) > (s + q));
						cc3 = ((z + s) < q);
						cc4 = (z != s != q != l);
						if (cc2 + cc3 + cc4 + cc1 == 4)
						{


						System.out.print('l');
						System.out.print(' ');
						System.out.print(50);
						System.out.print("\n");
						}
						 System.out.print('l');
						 System.out.print(' ');
						 System.out.print(50);
						 System.out.print("\n");

						System.out.print('q');
						System.out.print(' ');
						System.out.print(40);
						System.out.print("\n");

						System.out.print('z');
						System.out.print(' ');
						System.out.print(20);
						System.out.print("\n");
						System.out.print('s');
						System.out.print(' ');
						System.out.print(10);
						System.out.print("\n");
						return 0;
	}
}
