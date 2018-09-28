package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[101]);
		s1 = new Scanner(System.in).nextLine();
		int i;
		int t;
		String s2 = new String(new char[101]);
		for (i = 0;i < 101;i++)
		{
						   if (s1.charAt(i + 2) != '\0')
						   {
											 s2 = tangible.StringFunctions.changeCharacter(s2, i, s1.charAt(i) + s1.charAt(i + 1));
						   }
						   else
						   {
								t = i;
								s2 = tangible.StringFunctions.changeCharacter(s2, i, s1.charAt(i) + s1.charAt(i + 1));
								break;
						   }
		}
		s2 = tangible.StringFunctions.changeCharacter(s2, t + 1, s1.charAt(t + 1) + s1.charAt(0));
		for (i = 0;i < t + 2;i++)
		{
						   System.out.printf("%c",s2.charAt(i));
		}

		return 0;
	}
}

