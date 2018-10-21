package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String s = ""; //????
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i;
		int j;

		s = tangible.StringFunctions.changeCharacter(s, 0, ConsoleInput.readToWhiteSpace(true));
		i = 1;
		while (cin.peek() == ' ')
		{
			s = tangible.StringFunctions.changeCharacter(s, i++, ConsoleInput.readToWhiteSpace(true));
		}
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);

		for (i = 0;s.charAt(i)[0] != '\0';i++)
		{
			if (strcmp(a,s.charAt(i)) == 0)
			{
				s = tangible.StringFunctions.changeCharacter(s, i, b);
			}
		}

	System.out.print(s.charAt(0));
		for (i = 1;s.charAt(i)[0] != '\0';i++)
		{
			System.out.print(" ");
			System.out.print(s.charAt(i));
		}


		return 0;
	}

}

