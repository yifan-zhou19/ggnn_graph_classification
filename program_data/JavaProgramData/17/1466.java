package <missing>;

public class GlobalMembers
{
	public static String s = new String(new char[1000]);
	public static String m = new String(new char[1000]);
	public static int match(int l)
	{
		//&ordm;&macr;&Ecirc;&yacute;�&micro;&raquo;&Oslash;&Otilde;&Ograve;&micro;&frac12;&micro;&Auml;&Oacute;&Ograve;&Agrave;�&ordm;&Aring;&micro;&Auml;&Iuml;&Acirc;��
		int r = l;
		while (s.charAt(++r) != ')')
		{
			if (s.charAt(r) == '(')
			{
				r = match(r);
			}
			if (s.charAt(r) == '\0')
			{
				break;
			}
		}
		if (s.charAt(r) == '\0')
		{
			m = tangible.StringFunctions.changeCharacter(m, l, '$');
		}
		return r;
	}
	public static int nextL(int i)
	{
		while (s.charAt(i) != '\0' && s.charAt(i) != '(')
		{
			if (s.charAt(i) == ')')
			{
				m = tangible.StringFunctions.changeCharacter(m, i, '?');
			}
			i++;
		}
		return i;
	}
	public static int Main()
	{
		int i;
		int j;
		int k;
		while ((s = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			for (i = 0;i < s.length();++i)
			{
				m = tangible.StringFunctions.changeCharacter(m, i, ' ');
			}
			m = tangible.StringFunctions.changeCharacter(m, i, '\0');
			i = 0;
			i = nextL(i);
			while (s.charAt(i) != '\0')
			{
				i = match(i);
				if (s.charAt(i) == '\0')
				{
					break;
				}
				else
				{
					i++;
				}
				i = nextL(i);
			}
			System.out.print(s);
			System.out.print("\n");
			System.out.print(m);
			System.out.print("\n");
		}
		return 0;
	}

}

