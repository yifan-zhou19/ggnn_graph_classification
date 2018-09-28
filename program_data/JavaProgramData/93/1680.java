package <missing>;

public class GlobalMembers
{
	//********************************
	//*?????(4-4) ??3?5?7????   **
	//*?????? 1300012745 **
	//*???2013.9.27  **
	//********************************
	public static int Main()
	{
		int number;
		number = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (number % 3 == 0 && number % 5 == 0 && number % 7 == 0)
		{
			System.out.print("3 5 7");
			System.out.print("\n");
		}
		else if (number % 3 == 0 && number % 5 == 0)
		{
			System.out.print("3 5");
			System.out.print("\n");
		}
		else if (number % 3 == 0 && number % 7 == 0)
		{
			System.out.print("3 7");
		}
		else if (number % 5 == 0 && number % 7 == 0)
		{
			System.out.print("5 7");
		}
		else if (number % 3 == 0)
		{
			System.out.print("3");
		}
		else if (number % 5 == 0)
		{
			System.out.print("5");
		}
		else if (number % 7 == 0)
		{
			System.out.print("7");
		}
		else
		{
			System.out.print('n');
		}
		System.in.read();
		System.in.read();
		return 0;
	}


}

