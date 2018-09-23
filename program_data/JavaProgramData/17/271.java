package <missing>;

public class GlobalMembers
{
	public static void deal(String s)
	{
		int i;
		int j;
		int p = 0;
		for (i = 0;i < s.length();i++)
		{
		if (s[i].equals('('))
		{
			for (j = i + 1;j < s.length();j++)
			{
			if (s[j].equals('(') || s[j].equals(')'))
			{
			break;
			}
			}
			if (s[j].equals(')'))
			{
				s[j] = 'a';
				s[i] = 'a';
				p++;
			}
		}
		}
		if (p != 0)
		{
		deal(s);
		}
	}
	public static int Main()
	{
		int i;
		int j;
		String s = new String(new char[1000]);
		String s1 = new String(new char[1000]);
		String t = new String(new char[1000]);
		while (0 == 0)
		{
		for (i = 0;i < 1000;i++)
		{
		s = s.substring(0, i);
		}
		s = new Scanner(System.in).nextLine();
		if (s.charAt(0) == '\0')
		{
			break;
		}
		s1 = s;
		deal(s1);
		for (i = 0;i < s.length();i++)
		{
		if (s1.charAt(i) == '(')
		{
			t = tangible.StringFunctions.changeCharacter(t, i, '$');
		}
		else if (s1.charAt(i) == ')')
		{
			t = tangible.StringFunctions.changeCharacter(t, i, '?');
		}
		else
		{
			t = tangible.StringFunctions.changeCharacter(t, i, ' ');
		}
		}
		t = tangible.StringFunctions.changeCharacter(t, s.length(), '\0');
		System.out.printf("%s\n%s\n",s,t);
		}
		return 0;
	}
}

