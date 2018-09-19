package <missing>;

public class GlobalMembers
{
	public static String s = new String(new char[1000]);
	public static void findr(int left)
	{
		for (int i = left + 1;s.charAt(i) != '\0';i++)
		{
			if (s.charAt(i) != '(' && s.charAt(i) != ')' && s.charAt(i) != '$' && s.charAt(i) != '?')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, ' ');
			}
			if (s.charAt(i) == '(')
			{
				findr(i);
			}
			if (s.charAt(i) == ')')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, ' ');
				s = tangible.StringFunctions.changeCharacter(s, left, ' ');
				return;
			}
		}
		s = tangible.StringFunctions.changeCharacter(s, left, '$');
	}



	public static int Main()
	{
		while ((s = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			System.out.print(s);
			System.out.print("\n");
			for (int i = 0;s.charAt(i) != '\0';i++)
			{
				if (s.charAt(i) != '(' && s.charAt(i) != ')' && s.charAt(i) != '$' && s.charAt(i) != '?')
				{
					s = tangible.StringFunctions.changeCharacter(s, i, ' ');
				}
				if (s.charAt(i) == '(')
				{
					findr(i);
				}
				if (s.charAt(i) == ')')
				{
					s = tangible.StringFunctions.changeCharacter(s, i, '?');
				}
			}
			System.out.print(s);
			System.out.print("\n");
		}
		return 0;
	}
}

