package <missing>;

public class GlobalMembers
{
	/*
	 *????pro8.cpp
	 *??????
	 *?????2012-10-07
	 *??????
	 */



	public static void work(int a,int b,int c)
	{
		int x = 2 - a;
		int y = 2 - b;
		int z = 2 - c;
		String ans = new String(new char[3]);
		ans = tangible.StringFunctions.changeCharacter(ans, a, 'A');
		ans = tangible.StringFunctions.changeCharacter(ans, b, 'B');
		ans = tangible.StringFunctions.changeCharacter(ans, c, 'C');
		if ((b > a) + (c == a) == x && (a > b) + (a > c) == y && (c > b) + (b > a) == z) // ????????
		{
			System.out.print(ans.charAt(0));
			System.out.print(ans.charAt(1));
			System.out.print(ans.charAt(2));
			System.out.print("\n");
		}
	}

	public static int Main()
	{
		int a;
		int b;
		int c;
		for (a = 0;a < 3;a++) // ????
		{
			for (b = 0;b < 3;b++)
			{
				for (c = 0;c < 3;c++)
				{
					work(a, b, c);
				}
			}
		}
		return 0;
	}
}

