package <missing>;

public class GlobalMembers
{
	//*********************************************
	// *file:    4.cpp
	// *author:  ????1200012986?
	// *date:    2012-10-06
	// *description:
	//         ???????:??3?5?7???? 
	//*********************************************

	public static int Main() // ???
	{
		int k; // ??????k
		int a;
		int b;
		int c;
		int m;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		if (k % 3 == 0) // ??k???3??
		{
			a = 0; // ???3??,??a?0
		}
		else
		{
			a = 1; // ??,??a?1
		}

		if (k % 5 == 0) // ??k???5??
		{
			b = 0; // ???5??,??b?0
		}
		else
		{
			b = 2; // ??,??b?2
		}

		if (k % 7 == 0) // ??k???7??
		{
			c = 0; // ???7??,??c?0
		}
		else
		{
			c = 4; // ??,??c?4
		}

		m = a + b + c; // ????????

		switch (m) // ??m?????????
		{
		case 0:
			System.out.print("3");
			System.out.print(" ");
			System.out.print("5");
			System.out.print(" ");
			System.out.print("7");
			System.out.print("\n");
			break; // ??switch??

		case 1:
			System.out.print("5");
			System.out.print(" ");
			System.out.print("7");
			System.out.print("\n");
			break; // ??switch??

		case 2:
			System.out.print("3");
			System.out.print(" ");
			System.out.print("7");
			System.out.print("\n");
			break; // ??switch??

		case 3:
			System.out.print("7");
			System.out.print("\n");
			break; // ??switch??

		case 4:
			System.out.print("3");
			System.out.print(" ");
			System.out.print("5");
			System.out.print("\n");
			break; // ??switch??

		case 5:
			System.out.print("5");
			System.out.print("\n");
			break; // ??switch??

		case 6:
			System.out.print("3");
			System.out.print("\n");
			break; // ??switch??

		default:
			System.out.print('n');
			System.out.print("\n");
			break; // ??switch??
		}

		return 0;
	} // ?????

}

