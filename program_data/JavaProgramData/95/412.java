package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[80]);
		String s2 = new String(new char[80]);
		int i;
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		for (i = 0;s1.charAt(i) != '\0';i++)
		{
			if (s1.charAt(i) <= 'z' && s1.charAt(i) >= 'a')
			{
			   s1 = tangible.StringFunctions.changeCharacter(s1, i, s1.charAt(i) - 32);
			}
		}
		for (i = 0;s2.charAt(i) != '\0';i++)
		{
			if (s2.charAt(i) <= 'z' && s2.charAt(i) >= 'a')
			{
				s2 = tangible.StringFunctions.changeCharacter(s2, i, s2.charAt(i) - 32);
			}
		}
		i = strcmp(s1,s2);
		if (i == 0)
		{
			System.out.print("=");
		}
		else if (i < 0)
		{
			System.out.print("<");
		}
		else if (i > 0)
		{
			System.out.print(">");
		}
		return 0;
	}



}

