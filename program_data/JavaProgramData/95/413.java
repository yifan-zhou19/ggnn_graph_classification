package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[100]);
		String s2 = new String(new char[100]);
		int i;
		int a;
		int b;
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		a = s1.length();
		b = s2.length();
		for (i = 0;i < a;i++)
		{
			if (s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z')
			{
				s1 = tangible.StringFunctions.changeCharacter(s1, i, s1.charAt(i) - 'a'+'A');
			}
		}
		for (i = 0;i < b;i++)
		{
			if (s2.charAt(i) >= 'a' && s2.charAt(i) <= 'z')
			{
				s2 = tangible.StringFunctions.changeCharacter(s2, i, s2.charAt(i) - 'a'+'A');
			}
		}
		if (strcmp(s1,s2) > 0)
		{
			System.out.print(">");
		}
		if (strcmp(s1,s2) < 0)
		{
			System.out.print("<");
		}
		if (strcmp(s1,s2) == 0)
		{
			System.out.print("=");
		}
		return 0;
	}



}

