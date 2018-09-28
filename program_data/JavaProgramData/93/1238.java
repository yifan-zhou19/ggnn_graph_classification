package <missing>;

public class GlobalMembers
{
	//********************************
	//*?????3?5?7????   **
	//*?????? 1300012855 **
	//*???2013.9.26  **
	//********************************


	public static int Main()
	{
		int integer; // ????
		int situation = 0; // ?????????0
		integer = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

	// ??????????????????????????	
		if (integer % 3 == 0)
		{
			situation += 3;
		}
		if (integer % 5 == 0)
		{
			situation += 5;
		}
		if (integer % 7 == 0)
		{
			situation += 7;
		}
		switch (situation)
		{
		case 0:
			System.out.print('n');
			System.out.print("\n");
			break;
		case 3:
			System.out.print('3');
			System.out.print("\n");
			break;
		case 5:
			System.out.print('5');
			System.out.print("\n");
			break;
		case 7:
			System.out.print('7');
			System.out.print("\n");
			break;
		case 8:
			System.out.print("3 5");
			System.out.print("\n");
			break;
		case 10:
			System.out.print("3 7");
			System.out.print("\n");
			break;
		case 12:
			System.out.print("5 7");
			System.out.print("\n");
			break;
		case 15:
			System.out.print("3 5 7");
			System.out.print("\n");
			break;
		default:
			break;
		}
		return 0;
	}
}

