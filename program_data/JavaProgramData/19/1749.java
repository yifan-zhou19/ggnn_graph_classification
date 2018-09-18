package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[101]);
		s = new Scanner(System.in).nextLine();
		int l = s.length();
		s = tangible.StringFunctions.changeCharacter(s, l, ' ');
		s = tangible.StringFunctions.changeCharacter(s, l + 1, '\0');
		String a = new String(new char[100]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		String b = new String(new char[100]);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		String s1 = new String(new char[100]);
		int i;
		int j = 0;
		for (i = 0; i < s.length(); i++)
		{
			if (s.charAt(i) != ' ')
			{
				s1 = tangible.StringFunctions.changeCharacter(s1, j, s.charAt(i));
				j++;
			}
			else
			{
				s1 = tangible.StringFunctions.changeCharacter(s1, j, '\0');
				j = 0;
				if (strcmp(a, s1) == 0)
				{
					System.out.print(b);
				}
				else
				{
					System.out.print(s1);
				}
				if (i != s.length() - 1)
				{
					System.out.print(' ');
				}
			}
		}
	}

}

