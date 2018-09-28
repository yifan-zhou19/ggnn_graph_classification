package <missing>;

public class GlobalMembers
{
	public static String s1 = new String(new char[100]);
	public static String s2 = new String(new char[100]);

	public static void strlwr()
	{
		 int i;
		 int len1;
		 int len2;
		 len1 = s1.length();
		 len2 = s2.length();
		 for (i = 0;i < len1;i++)
		 {
			 if (s1.charAt(i) >= 'A' && s1.charAt(i) <= 'Z')
			 {
							s1 = tangible.StringFunctions.changeCharacter(s1, i, s1.charAt(i) - ('A'-'a'));
			 }
		 }
		 for (i = 0;i < len2;i++)
		 {
			 if (s2.charAt(i) >= 'A' && s2.charAt(i) <= 'Z')
			 {
							s2 = tangible.StringFunctions.changeCharacter(s2, i, s2.charAt(i) - ('A'-'a'));
			 }
		 }
	}

	public static int Main()
	{
		int re;
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		strlwr();
		re = strcmp(s1,s2);
		if (re == 0)
		{
			System.out.print("=");
		}
		if (re > 0)
		{
			System.out.print(">");
		}
		if (re < 0)
		{
			System.out.print("<");
		}
		return 0;
	}

}

