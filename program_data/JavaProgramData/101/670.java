package <missing>;

public class GlobalMembers
{
	/*
	 * ????compare eat.cpp
	 * ?????
	 * ????: 2011-11-3
	 * ??????????
	 */
	public static int Main()
	{
		int a; //??????????A,B,C
		int b;
		int c;
		int as; //??????????????
		int bs;
		int cs;
		String d = new String(new char[4]);
		for (a = 1;a <= 3;a++)
		{
			for (b = 1;b <= 3;b++)
			{
				for (c = 1;c <= 3;c++)
				{
					as = (b > a) + (c == a); //A???
				 bs = (a > b) + (a > c); //B???
				 cs = (c > b) + (b > a); //C???
					if (!(a <= b != 0 && as <= bs != 0 || a <= c != 0 && as <= cs != 0 || b <= a != 0 && bs <= as != 0 || b <= c != 0 && bs <= cs != 0 || c <= a != 0 && cs <= as != 0 || c <= b != 0 && cs <= bs)) //?????????????????
					{
					d = tangible.StringFunctions.changeCharacter(d, a, 'A');
					d = tangible.StringFunctions.changeCharacter(d, b, 'B');
					d = tangible.StringFunctions.changeCharacter(d, c, 'C'); //????
					}
				}
			}
		}
		System.out.print(d.charAt(1));
		System.out.print(d.charAt(2));
		System.out.print(d.charAt(3));
		System.out.print("\n");
		return 0; //????
	}

}

