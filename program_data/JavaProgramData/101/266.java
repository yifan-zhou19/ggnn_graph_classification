package <missing>;

public class GlobalMembers
{
	/**
	 * ????bifanliang.cpp
	 * ????????
	 * ??????
	 * ???2010.11.19
	 */



	public static int Main()
	{
		int a; //a,b,c????
		int b;
		int c;
		for (a = 1; a <= 3; a++) //1,2,3??????
		{
			for (b = 1; b <= 3; b++)
			{
				for (c = 1; c <= 3; c++)
				{
					if (((a < b) + (c == a) == 3 - a) && ((a > b) + (a > c) == 3 - b) && ((c > b) + (b > a) == 3 - c))
					{
						;
					}
				}
			}
		}
						if (a > b) //?a,b,c????????
						{
							if (b > c)
							{
								System.out.print("ABC");
							}
							else if (c > a)
							{
								System.out.print("CAB");
							}
							else
							{
								System.out.print("ACB");
							}
						}
						else
						{
							if (a > c)
							{
								System.out.print("BAC");
							}
							else if (c > b)
							{
								System.out.print("CBA");
							}
							else
							{
								System.out.print("BCA");
							}
						}
		System.out.print("\n");

		return 0;
	}
}
