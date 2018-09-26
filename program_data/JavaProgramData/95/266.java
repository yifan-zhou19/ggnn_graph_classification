package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String s = new String(new char[80]);
		String t = new String(new char[80]);
		int i;
		s = new Scanner(System.in).nextLine();
		t = new Scanner(System.in).nextLine();
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) - 32);
			}
		}
		for (i = 0;t.charAt(i) != '\0';i++)
		{
			if (t.charAt(i) >= 'a' && t.charAt(i) <= 'z')
			{
				t = tangible.StringFunctions.changeCharacter(t, i, t.charAt(i) - 32);
			}
		}
		if (strcmp(s,t) > 0)
		{
			System.out.print(">");
		}
		else if (strcmp(s,t) < 0)
		{
			System.out.print("<");
		}
		else
		{
			System.out.print("=");
		}
	}


}

