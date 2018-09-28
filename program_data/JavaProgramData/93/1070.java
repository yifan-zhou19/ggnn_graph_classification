package <missing>;

public class GlobalMembers
{
	/* * * * * * * * * * * * * * * * * * * * * * * * *
	 *              homework.cpp                     *
	 *           ???  1200012964                  *
	 *               2012-9-28                       *
	 *         ????:??3?5?7????          *
	 * * * * * * * * * * * * * * * * * * * * * * * * */
	public static int Main() //???
	{
		int m; //????m
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (m % 3 == 0 && m % 5 == 0 && m % 7 == 0) //???3,5,7??
		{
			System.out.print("3");
			System.out.print(" 5 ");
			System.out.print("7");
			System.out.print("\n");
		}
		else if (m % 3 == 0 && m % 5 == 0 && m % 7 != 0) //???3,5??
		{
			System.out.print("3");
			System.out.print(" 5");
			System.out.print("\n");
		}
		else if (m % 3 == 0 && m % 5 != 0 && m % 7 == 0) //???3,7??
		{
			System.out.print("3");
			System.out.print(" 7");
			System.out.print("\n");
		}
		else if (m % 3 != 0 && m % 5 == 0 && m % 7 == 0) //???5,7??
		{
			System.out.print("5");
			System.out.print(" 7");
			System.out.print("\n");
		}
		else if (m % 3 == 0 && m % 5 != 0 && m % 7 != 0) //??3??
		{
			System.out.print("3");
			System.out.print("\n");
		}
		else if (m % 3 != 0 && m % 5 == 0 && m % 7 != 0) //??5??
		{
			System.out.print("5");
			System.out.print("\n");
		}
		else if (m % 3 != 0 && m % 5 != 0 && m % 7 == 0) //??7??
		{
			System.out.print("7");
			System.out.print("\n");
		}
		else if (m % 3 != 0 && m % 5 != 0 && m % 7 != 0) //???3,5,7??
		{
			System.out.print("n");
			System.out.print("\n");
		}
		return 0;
	}
}

