package <missing>;

public class GlobalMembers
{
	//*****************************
	//**?????3?5?7????**
	//**?????               **
	//**???2013.9.27          **
	//**????5.cpp            **
	public static int Main() //???
	{
		int flag = 0;
		int a; //????a
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (a % 3 == 0) //??a???3??
		{
			if (flag == 0)
			{
				System.out.print("3");
				flag = 1;
			}
			else
			{
				System.out.print(" 3");
			}
		}
		if (a % 5 == 0) //??a???5??
		{
			if (flag == 0)
			{
				System.out.print("5");
				flag = 1;
			}
			else
			{
				System.out.print(" 5");
			}
		}
		if (a % 7 == 0) //??a???7??
		{
			if (flag == 0)
			{
				System.out.print("7");
				flag = 1;
			}
			else
			{
				System.out.print(" 7");
			}
		}
		if (a % 3 != 0 && a % 5 != 0 && a % 7 != 0)
		{
			System.out.print("n");
			System.out.print("\n");
		}
		return 0;
	} //?????
}

