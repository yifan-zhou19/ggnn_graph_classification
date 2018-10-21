package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[MAX]);
		String s2 = new String(new char[MAX]);
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		int i = 0;
		while (s1.charAt(i) != '\0')
		{
		s1 = tangible.StringFunctions.changeCharacter(s1, i, Character.toUpperCase(s1.charAt(i)),i++);
		}
		  i = 0;
		  while (s2.charAt(i) != '\0')
		  {
		s2 = tangible.StringFunctions.changeCharacter(s2, i, Character.toUpperCase(s2.charAt(i)),i++);
		  }
		if (strcmp(s1,s2) > 0)
		{
		System.out.print(">");
		}
		else if (strcmp(s1,s2) < 0)
		{
		System.out.print("<");
		}
		else
		{
		System.out.print("=");
		}
		return 0;
	}

}

