package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int i;
		String str = new String(new char[3]);
		for (a = 0; a < 3; a++)
		{
			for (b = 0; b < 3; b++)
			{
				for (c = 0; c < 3; c++)
				{
					if ((b > a) + (c == a) + a == 2 && (a > b) + (a > c) + b == 2 && (c > b) + (b > a) + c == 2 && a != b && a != c && b != c)
					{
						str = tangible.StringFunctions.changeCharacter(str, a, 'A');
						str = tangible.StringFunctions.changeCharacter(str, b, 'B');
						str = tangible.StringFunctions.changeCharacter(str, c, 'C');
						for (i = 0; i < 3; i++)
						{
							System.out.print(str.charAt(i));
						}
					}
				}
			}
		}
		System.out.print("\n");
		return 0;
	}


}

