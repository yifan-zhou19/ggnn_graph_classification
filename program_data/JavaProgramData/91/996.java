package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	String s1 = new String(new char[101]);
	String s2 = new String(new char[101]);
	int i = 0;
	s1 = new Scanner(System.in).nextLine();
	while (s1.charAt(++i) != '\0')
	{
		s2 = tangible.StringFunctions.changeCharacter(s2, i - 1, s1.charAt(i) + s1.charAt(i - 1));
	}
	s2 = tangible.StringFunctions.changeCharacter(s2, i - 1, s1.charAt(0) + s1.charAt(i - 1));
	s2 = tangible.StringFunctions.changeCharacter(s2, i, '\0');
	System.out.printf("%s",s2);
	}

}

