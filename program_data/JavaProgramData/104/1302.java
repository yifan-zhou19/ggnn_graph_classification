package <missing>;

public class GlobalMembers
{
	//*****************************************************************************
	//*                                                                           *
	//*              ??????       ???        1300012743                  *
	//*                                                                           *
	//*****************************************************************************

	//                          ?? - ???



	public static int Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int x,y;
		int x;
		int y;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (x != y)
		{
			if (x > y)
			{
				x /= 2;
			}
			else
			{
				y /= 2;
			}
		}
		System.out.print(x);
		System.out.print("\n");
		return 0;
	}
}

