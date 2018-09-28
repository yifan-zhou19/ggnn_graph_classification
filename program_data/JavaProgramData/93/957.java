package <missing>;

public class GlobalMembers
{
	//******************************************************************************
	//****?????? ???1200012772  ???2012???3?                   *****
	//****???2012?10?5?                                                  *****
	//****?????3?5?7????                                            *****
	//******************************************************************************
	public static int Main()
	{
		int a; //????a
		//cout << " ?????" << endl;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (a % 3 == 0 && a % 5 == 0 && a % 7 == 0) //??3,5,7??
		{
			System.out.print("3");
			System.out.print(" 5");
			System.out.print(" 7");
			System.out.print("\n");
		}
		else if (a % 3 == 0 && a % 5 == 0 && a % 7 != 0) //??3,5??
		{
			System.out.print("3");
			System.out.print(" 5");
			System.out.print("\n");
		}
		else if (a % 3 == 0 && a % 5 != 0 && a % 7 == 0) //??3,7??
		{
			System.out.print("3");
			System.out.print(" 7");
			System.out.print("\n");
		}
		else if (a % 3 != 0 && a % 5 == 0 && a % 7 == 0) //??5,7??
		{
			System.out.print("5");
			System.out.print(" 7");
			System.out.print("\n");
		}
		else if (a % 3 == 0 && a % 5 != 0 && a % 7 != 0) //???3??
		{
			System.out.print("3");
			System.out.print("\n");
		}
		else if (a % 3 != 0 && a % 5 == 0 && a % 7 != 0) //???5??
		{
			System.out.print("5");
			System.out.print("\n");
		}
		else if (a % 3 != 0 && a % 5 != 0 && a % 7 == 0) //???7??
		{
			System.out.print("7");
			System.out.print("\n");
		}
		else //???3,5,7??
		{
			System.out.print("n");
			System.out.print("\n");
		}
		return 0;
	}

}

