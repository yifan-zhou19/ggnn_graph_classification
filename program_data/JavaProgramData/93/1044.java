package <missing>;

public class GlobalMembers
{
	//******************
	//*?????3?5?7????**
	//*?????1200012922**
	//*???2012.9.28**
	//******************

	public static int Main()
	{
		int a; //??a???
		int x; //??x???
		x = 0; //??x?0
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (a % 3 == 0)
		{
			x = 1;
			System.out.print(3);
		};
		if (a % 5 == 0)
		{
			{
				if (x == 1)
				{
				System.out.print(" ");
				}
		}
			x = 1;
			System.out.print(5);
		}; //??a??5?????x?1???5????????5
			if (a % 7 == 0)
			{
				{
					if (x == 1)
					{
					System.out.print(" ");
					}
			}
				System.out.print(7);
			}; //??a??7?????x?1???7????????7
				if (a % 3 != 0 && a % 5 != 0 && a % 7 != 0)
				{
					System.out.print('n');
					System.out.print("\n");
				}

				return 0;
	}
}

