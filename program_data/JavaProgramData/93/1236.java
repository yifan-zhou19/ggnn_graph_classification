package <missing>;

public class GlobalMembers
{
	//????:??3 5 7 ????
	//?    ?????
	//?    ??2013?10?7?


	public static int Main() //?????
	{ //?????
		int a; //????????a
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		if (a % 3 == 0 && a % 5 == 0 && a % 7 == 0) //????3 5 7 ??????3 5 7??????3,5??3,7??5,7??3??5??7??????????????
		{
			System.out.print("3 5 7");
			System.out.print("\n");
		}
		else if (a % 3 == 0 && a % 5 == 0 && a % 7 != 0)
		{
			System.out.print("3 5");
			System.out.print("\n");
		}
		else if (a % 3 == 0 && a % 7 == 0)
		{
			System.out.print("3 7");
			System.out.print("\n");
		}
		else if (a % 5 == 0 && a % 7 == 0)
		{
			System.out.print("5 7");
			System.out.print("\n");
		}
		else if (a % 3 == 0)
		{
			System.out.print("3");
			System.out.print("\n");
		}
		else if (a % 5 == 0)
		{
			System.out.print("5");
			System.out.print("\n");
		}
		else if (a % 7 == 0)
		{
			System.out.print("7");
			System.out.print("\n");
		}
	else
	{
			System.out.print("n");
			System.out.print("\n");
	}
		return 0; //?????????0
	} //?????


}

