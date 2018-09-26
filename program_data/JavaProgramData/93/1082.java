package <missing>;

public class GlobalMembers
{
	//*********************************************
	// *file:    3.cpp
	// *author:  ????1200012986?
	// *date:    2012-9-28
	// *description:
	//         ???????:??3?5?7???? 
	//*********************************************
	public static int Main() // ???
	{
		int k; // ??????k
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		{
			if (k % 3 == 0 && k % 5 == 0 && k % 7 == 0) // ??k?????3?5?7??
			{
				System.out.print("3");
				System.out.print(" ");
				System.out.print("5");
				System.out.print(" ");
				System.out.print("7");
				System.out.print("\n");
			}
			else if (k % 3 != 0 && k % 5 != 0 && k % 7 != 0) // ?k????????
			{
				System.out.print('n');
				System.out.print("\n");
			}
		}
		{
				if (k % 15 == 0 && k % 7 != 0) // ?k????3,5??????7??
				{
					System.out.print("3");
					System.out.print(" ");
					System.out.print("5");
					System.out.print("\n");
				}
				else if (k % 21 == 0 && k % 5 != 0) // ?k????3,7??????5??
				{
					System.out.print("3");
					System.out.print(" ");
					System.out.print("7");
					System.out.print("\n");
				}
					else if (k % 35 == 0 && k % 3 != 0) // ?k????5,7??????5??
					{
						System.out.print("5");
						System.out.print(" ");
						System.out.print("7");
						System.out.print("\n");
					}
		}

		{
					if (k % 3 != 0 && k % 5 != 0 && k % 7 == 0) // ?k???7??
					{
						System.out.print("7");
						System.out.print("\n");
					}
					else if (k % 3 != 0 && k % 7 != 0 && k % 5 == 0) // ?k???5??
					{
						System.out.print("5");
						System.out.print("\n");
					}
						else if (k % 5 != 0 && k % 7 != 0 && k % 3 == 0) // ?k???3??
						{
							System.out.print("3");
							System.out.print("\n");
						}
			}
		return 0;
	} // ?????

}

