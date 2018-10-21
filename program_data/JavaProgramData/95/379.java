package <missing>;

public class GlobalMembers
{
	public static int Main()

	{
		String s = new String(new char[80]);
		char c;
		String s1 = new String(new char[80]);
		int i = 0;
		int k;
		s = new Scanner(System.in).nextLine();
		while (s.charAt(i) != '\0')
		{
			if (s.charAt(i) <= 90 && s.charAt(i) >= 65)
			{
				s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) + 32);
			}
			i++;
		}
		i = 0;
		s1 = new Scanner(System.in).nextLine();
		while (s1.charAt(i) != '\0')
		{
			if (s1.charAt(i) <= 90 && s1.charAt(i) >= 65)
			{
				s1 = tangible.StringFunctions.changeCharacter(s1, i, s1.charAt(i) + 32);
			}
			i++;
		}
		k = strcmp(s,s1);
		if (k == 0)
		{
			System.out.print("=");
		}
		if (k > 0)
		{
			System.out.print(">");
		}
		if (k < 0)
		{
			System.out.print("<");
		}

		return 0;
	}




}

