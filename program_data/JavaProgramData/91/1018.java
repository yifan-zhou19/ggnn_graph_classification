package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int l;
		int j = 0;
		String s = new String(new char[101]);
		String s1 = new String(new char[101]);
		s = new Scanner(System.in).nextLine();
		l = s.length();
		s = tangible.StringFunctions.changeCharacter(s, l, '\0');
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			if (i == l - 1)
			{
				s1 = tangible.StringFunctions.changeCharacter(s1, j, s.charAt(i) + s.charAt(0));
			}
			else
			{
				s1 = tangible.StringFunctions.changeCharacter(s1, j, s.charAt(i) + s.charAt(i + 1));
			}
			j = j + 1;
		}
		s1 = tangible.StringFunctions.changeCharacter(s1, l, '\0');
		System.out.printf("%s",s1);
		return 0;
	}

}

