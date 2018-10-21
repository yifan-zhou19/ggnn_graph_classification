package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a = 0;
		int b = 0;
		int c = 0;
		String temp = new String(new char[3]);

		for (a = 0;a <= 2;a++)
		{
			for (b = 0;b <= 2;b++)
			{
				if (a != b)
				{
					c = 3 - a - b;


					if ((b > a) + (c == a) == 2 - a && (b < a) + (a > c) == 2 - b && (c > b) + (b > a) == 2 - c)
					{
						temp = tangible.StringFunctions.changeCharacter(temp, a, 'A');
						temp = tangible.StringFunctions.changeCharacter(temp, b, 'B');
						temp = tangible.StringFunctions.changeCharacter(temp, c, 'C');

						System.out.print(temp.charAt(0));
						System.out.print(temp.charAt(1));
						System.out.print(temp.charAt(2));
					}
				}


			}
		}



		return 0;

	}
}

