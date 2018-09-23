package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		for (a = 1;a <= 3;a++)
		{
			for (b = 1;b <= 3;b++)
			{
				for (c = 1;c <= 3;c++)
				{
					if (((3 - a) == (b > a) + (c == a)) && ((3 - b) == (a > b) + (a > c)) && ((3 - c) == (c > b) + (b > a)))
					{
							String f = new String(new char[4]);
					f = tangible.StringFunctions.changeCharacter(f, a, 'A');
					f = tangible.StringFunctions.changeCharacter(f, b, 'B');
					f = tangible.StringFunctions.changeCharacter(f, c, 'C');
					System.out.print(f.charAt(1));
					System.out.print(f.charAt(2));
					System.out.print(f.charAt(3));
					}

				}
			}
		}
		return 0;
	}

}

