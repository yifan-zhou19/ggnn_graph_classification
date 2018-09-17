package <missing>;

public class GlobalMembers
{
	/*
	 * ????ercha.cpp
	 * ?????x,y,?xi.
	 * ????: 2012-11-30
	 * ??: ?   ?
	 */



	public static int Main()
	{
		int x = 0; //?????????
		int y = 0;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (x != y)
		{
			if (x > y)
			{
				x = x / 2; //??x>y,??x?????
			}
			else
			{
				y = y / 2; //???y?????
			}
		}
		System.out.print(x);
		System.out.print("\n");
		return 0; //????
	}

}

