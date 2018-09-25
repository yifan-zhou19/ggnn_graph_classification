package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		String s = new String(new char[1000]);
		String t = new String(new char[1000]);
		char c;
		s = new Scanner(System.in).nextLine();
		t = new Scanner(System.in).nextLine();
		while (s.charAt(i) != '\0')
		{
			if (s.charAt(i) >= 65 && s.charAt(i) <= 90)
			{
				c = s.charAt(i);
				s = tangible.StringFunctions.changeCharacter(s, i, c + 'a'-'A');
			}
			i++;
		}
		i = 0;
		while (t.charAt(i) != '\0')
		{
			if (t.charAt(i) >= 65 && t.charAt(i) <= 90)
			{
				c = t.charAt(i);
				t = tangible.StringFunctions.changeCharacter(t, i, c + 'a'-'A');
			}
			i++;
		}
		if (strcmp(s,t) == 0)
		{
			System.out.print('=');
		}
		else if (strcmp(s,t) > 0)
		{
			System.out.print('>');
		}
		else
		{
			System.out.print('<');
		}
		System.out.print('\n');
		return 0;
	}


}

