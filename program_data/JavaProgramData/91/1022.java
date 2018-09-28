package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[102]);
		String s1 = new String(new char[102]);
		char c;
		int i;
		int len;
		s = new Scanner(System.in).nextLine();
		len = s.length();
		for (i = 1;(c = s.charAt(i)) != '\0';i++)
		{
			s1 = tangible.StringFunctions.changeCharacter(s1, i, s.charAt(i - 1) + s.charAt(i));
		}
		for (i = 1;i < len;i++)
		{
			System.out.printf("%c",s1.charAt(i));
		}
		System.out.printf("%c\n",s.charAt(0) + s.charAt(len - 1));
	}

}

