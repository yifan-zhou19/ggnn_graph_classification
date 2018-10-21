package <missing>;

public class GlobalMembers
{
	//*******************************
	//*?????3?5?7????   **
	//*????? 1300012707 **
	//*???2013.10.1  **
	//********************************
	public static int Main()
	{
		int n; // ????n?????switch????
		int s;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		s = 0; // ???s
		if (n % 3 == 0) // ??n??3??
		{
			s = s + 3; // s??3
		}
		if (n % 5 == 0) // ??n??5??
		{
			s = s + 5; // s??5
		}
		if (n % 7 == 0) // ??n??7??
		{
			s = s + 7; // s??7
		}
		switch (s) // ?switch??
		{
			case 15:
				System.out.print("3 5 7");
				System.out.print("\n");
				break;
			case 12:
				System.out.print("5 7");
				System.out.print("\n");
				break;
			case 10:
				System.out.print("3 7");
				System.out.print("\n");
				break;
			case 8:
				System.out.print("3 5");
				System.out.print("\n");
				break;
			case 7:
				System.out.print("7");
				System.out.print("\n");
				break;
			case 5:
				System.out.print("5");
				System.out.print("\n");
				break;
			case 3:
				System.out.print("3");
				System.out.print("\n");
				break;
			default:
				System.out.print("n");
				System.out.print("\n");
				break;
		}
		return 0;
	}
}

