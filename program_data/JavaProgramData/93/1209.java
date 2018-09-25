package <missing>;

public class GlobalMembers
{
	//**************************
	//*??3?5?7????**
	//*?? : ?? 1300012761**
	//*?? : 2013.10.03**
	//**************************
	public static int Main()
	{
		int a; //????
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if ((a % 3 == 0 && a % 5 == 0 && a % 7 == 0) == 1) //??????3?5?7??
		{
			System.out.print("3 5 7");
			System.out.print("\n");
		}
		if ((a % 3 == 0 && a % 5 == 0 && a % 7 != 0) == 1) //??????3?5??
		{
			System.out.print("3 5");
			System.out.print("\n");
		}
		if ((a % 3 == 0 && a % 5 != 0 && a % 7 == 0) == 1) //??????3?7??
		{
			System.out.print("3 7");
			System.out.print("\n");
		}
		if ((a % 3 != 0 && a % 5 == 0 && a % 7 == 0) == 1) //??????5?7??
		{
			System.out.print("5 7");
			System.out.print("\n");
		}
		if ((a % 3 == 0 && a % 5 != 0 && a % 7 != 0) == 1) //??????3??
		{
			System.out.print("3");
			System.out.print("\n");
		}
		if ((a % 3 != 0 && a % 5 == 0 && a % 7 != 0) == 1) //??????5??
		{
			System.out.print("5");
			System.out.print("\n");
		}
		if ((a % 3 != 0 && a % 5 != 0 && a % 7 == 0) == 1) //??????7??
		{
			System.out.print("7");
			System.out.print("\n");
		}
		if ((a % 3 != 0 && a % 5 != 0 && a % 7 != 0) == 1) //???????3?5?7??
		{
			System.out.print("n");
			System.out.print("\n");
		}
		return 0;
	}

}

