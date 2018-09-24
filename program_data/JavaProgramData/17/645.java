package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[110]);
		while ((s = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
		System.out.print(s);
		System.out.print("\n");
		int l = s.length();
		int i;
		for (i = l - 1;i >= 0;i--)
		{
		if (s.charAt(i) == ')')
		{
			continue;
		}
		else if (s.charAt(i) == '(')
		{
			int j;
		for (j = i;j < l;j++)
		{
				if (s.charAt(j) == ')')
				{
			s = tangible.StringFunctions.changeCharacter(s, i, ' ');
			s = tangible.StringFunctions.changeCharacter(s, j, ' ');
			break;
				}
		}
			if (j == l)
			{
				s = tangible.StringFunctions.changeCharacter(s, i, '$');
			}
		}
		else
		{
			s = tangible.StringFunctions.changeCharacter(s, i, ' ');
		}
		}
		for (i = 0;i < l;i++)
		{
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

