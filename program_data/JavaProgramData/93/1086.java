package <missing>;

public class GlobalMembers
{
	//********************************
	//*?????3?5?7????   **
	//*?????? 1200012988 **
	//*???2012.09.30  **
	//********************************

	public static int Main() //???
	{
		int n; //?n??
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		//??n?????3?5?7??
		if (n % 3 == 0 && n % 5 == 0 && n % 7 == 0)
		{
		System.out.print("3 5 7");
		System.out.print("\n");
		}
		else //????
		{
			if (n % 3 == 0 && n % 5 == 0) //??????3?5??
			{
			System.out.print("3 5");
			System.out.print("\n");
			}
			else
			{
				if (n % 5 == 0 && n % 7 == 0) //??????5?7??
				{
				System.out.print("5 7");
				System.out.print("\n");
				}
				else
				{
					if (n % 3 == 0 && n % 7 == 0) //??????3?7??
					{
					System.out.print("3 7");
					System.out.print("\n");
					}
					else //????????????
					{
						if (n % 3 == 0) //????3??
						{
						System.out.print("3");
						System.out.print("\n");
						}
						if (n % 5 == 0) //????5??
						{
						System.out.print("5");
						System.out.print("\n");
						}
						if (n % 7 == 0) //????7??
						{
						System.out.print("7");
						System.out.print("\n");
						}
						//??n???3?5?7??
						if (n % 3 != 0 && n % 5 != 0 && n % 7 != 0)
						{
						System.out.print("n");
						System.out.print("\n");
						}
					}
				}
			}

		}
		return 0; //??????
	}

}

