package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int i;
		String n = new String(new char[4]);
		for (a = 1;a <= 3;a++)
		{
			for (b = 1;b <= 3 && b != a;b++)
			{
				c = 6 - a - b;
				if (a + (b > a) == 3 && b + (a > b) + (a > c) == 3 && c + (c > b) + (b > a) == 3)
				{
					n = tangible.StringFunctions.changeCharacter(n, a, 'A');
					n = tangible.StringFunctions.changeCharacter(n, b, 'B');
					n = tangible.StringFunctions.changeCharacter(n, c, 'C');
					for (i = 1;i <= 3;i++)
					{
						System.out.print(n.charAt(i));
					}
				}
			}
		}
	}
}

