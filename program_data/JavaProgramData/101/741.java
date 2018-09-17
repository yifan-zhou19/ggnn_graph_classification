package <missing>;

public class GlobalMembers
{
	/*
	 *????food.cpp
	 *??????
	 *?????2012-10-15
	 *??????
	 */



	public static int Main()
	{
		int a;
		int b;
		int c;
		int x;
		int y;
		int z;
		String ans = new String(new char[3]);
		for (a = 0;a < 3;a++) // ????
		{
			for (b = 0;b < 3;b++)
			{
				for (c = 0;c < 3;c++)
				{
					x = 2 - a;
					y = 2 - b;
					z = 2 - c; // ?????????
					ans = tangible.StringFunctions.changeCharacter(ans, a, 'A');
					ans = tangible.StringFunctions.changeCharacter(ans, b, 'B');
					ans = tangible.StringFunctions.changeCharacter(ans, c, 'C'); // ????
					if ((b > a) + (c == a) == x && (a > b) + (a > c) == y && (c > b) + (b > a) == z) // ????????
					{
						System.out.print(ans.charAt(0));
						System.out.print(ans.charAt(1));
						System.out.print(ans.charAt(2));
						System.out.print("\n");
					}
				}
			}
		}
		return 0;
	}
}

