package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[101]);
		String c = new String(new char[101]);
		s = new Scanner(System.in).nextLine();
		c = tangible.StringFunctions.changeCharacter(c, 0, s.charAt(0));
		int i;
		int j;
		for (i = 1,j = 1;s.charAt(i) != '\0';i++)
		{
			if (s.charAt(i) != ' ')
			{
				c = tangible.StringFunctions.changeCharacter(c, j, s.charAt(i));
				j++;
			}
			else
			{
				if (s.charAt(i - 1) != ' ')
				{
					c = tangible.StringFunctions.changeCharacter(c, j, s.charAt(i));
					j++;
				}
			}
		}
		c = tangible.StringFunctions.changeCharacter(c, j, '\0');
		System.out.printf("%s",c);
		return 0;
	}

}

