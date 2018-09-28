package <missing>;

public class GlobalMembers
{
	//*************************************************
	//*?????????3,5,7 ????****************
	//*??????? 1200012979 **********************
	//*???2012.9.25 ********************************
	public static int Main() //?????
	{ //?????
		int x; //??????
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (x % 3 == 0 && x % 5 == 0 && x % 7 == 0)
		{
			 System.out.print("3 5 7");
			 System.out.print("\n");
		}
		else if (x % 3 == 0 && x % 5 == 0 && x % 7 != 0)
		{
			 System.out.print("3 5");
			 System.out.print("\n");
		}
		else if (x % 3 == 0 && x % 5 != 0 && x % 7 == 0)
		{
			 System.out.print("3 7");
			 System.out.print("\n");
		}
		else if (x % 3 != 0 && x % 5 == 0 && x % 7 == 0)
		{
			 System.out.print("5 7");
			 System.out.print("\n");
		}
		else if (x % 3 == 0 && x % 5 != 0 && x % 7 != 0)
		{
			 System.out.print("3");
			 System.out.print("\n");
		}
		else if (x % 3 != 0 && x % 5 != 0 && x % 7 == 0)
		{
			 System.out.print("7");
			 System.out.print("\n");
		}
		else if (x % 3 != 0 && x % 5 == 0 && x % 7 != 0)
		{
			 System.out.print("5");
			 System.out.print("\n");
		}
		else
		{
			System.out.print("n");
			System.out.print("\n");
		}
		return 0; //??????????0
	} //?????
}

