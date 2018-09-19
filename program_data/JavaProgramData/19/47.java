package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int r = 1;
		int j;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String c = new String(new char[200]);
		c = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = 0;i < 100;i++)
		{
			if (c.charAt(i) == 'G' && c.charAt(i + 1) == 'I' && c.charAt(i + 2) == 'S' && c.charAt(i - 1) == ' ')
			{
				for (j = 100 + r * 3;j >= (i + 3);j--)
				{
					c = tangible.StringFunctions.changeCharacter(c, j, c.charAt(j - 3));
				}
				r = r + 1;
				c = tangible.StringFunctions.changeCharacter(c, i, 'W');
				c = tangible.StringFunctions.changeCharacter(c, i + 1, 'e');
				c = tangible.StringFunctions.changeCharacter(c, i + 2, 'b');

			}
			if (c.charAt(i) == 'Y' && c.charAt(i + 1) == 'o' && c.charAt(i + 2) == 'u')
			{

				c = tangible.StringFunctions.changeCharacter(c, i, 'I');
				for (j = i + 1;j < 100;j++)
				{
					c = tangible.StringFunctions.changeCharacter(c, j, c.charAt(j + 2));
				}


			}
			if (c.charAt(i) == 'o' && c.charAt(i + 1) == 'f' && c.charAt(i - 1) == ' ')
			{
				for (j = 100 + r * 1;j >= (i + 1);j--)
				{
					c = tangible.StringFunctions.changeCharacter(c, j, c.charAt(j - 1));
				}
				r = r + 1;
				c = tangible.StringFunctions.changeCharacter(c, i, 'f');
				c = tangible.StringFunctions.changeCharacter(c, i + 1, 'o');
				c = tangible.StringFunctions.changeCharacter(c, i + 2, 'r');

			}

		}
		System.out.printf("%s",c);
	}



}

