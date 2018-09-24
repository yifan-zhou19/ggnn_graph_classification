package <missing>;

public class GlobalMembers
{
	/*
	 * ????bifanliang.cpp
	 * ??????
	 * ?????2012 11 9
	 * ??????????
	 */



	public static int Main()
	{
		int a; //???????abc??????i
		int b;
		int c;
		int i;
		i = 0; //i???0
		for (a = 1;a <= 3;a++)
		{
			for (b = 1;b <= 3;b++)
			{
				if (b == a)
				{
					continue;
				}
				c = 6 - a - b; //????abc?????abc????
				if ((((b < a) + (c == a)) == (a - 1)) && (((a < b) + (a < c)) == (b - 1)) && (((c < b) + (b < a)) == (c - 1)))
				{
					//????????????????
				String order = new String(new char[4]);
						   order = tangible.StringFunctions.changeCharacter(order, a, 'A');
						   order = tangible.StringFunctions.changeCharacter(order, b, 'B');
						   order = tangible.StringFunctions.changeCharacter(order, c, 'C'); //???????????ABC?????
						   System.out.print(order.charAt(3));
						   System.out.print(order.charAt(2));
						   System.out.print(order.charAt(1));
						   System.out.print("\n");
						   i = 1; //???????1
						   break; //????
				}
			}
			if (i == 1)
			{
				break; //????????????
			}
		}
		return 0;
	}

}

