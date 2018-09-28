package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[101]);
		String s2 = new String(new char[101]);
		int l;
		int i;
		int j;
		s1 = new Scanner(System.in).nextLine();
		l = s1.length();
		for (i = 0;i < l;i++)
		{
						if (i != l - 1)
						{
						s2 = tangible.StringFunctions.changeCharacter(s2, i, s1.charAt(i) + s1.charAt(i + 1));
						}
						else
						{
						s2 = tangible.StringFunctions.changeCharacter(s2, i, s1.charAt(i) + s1.charAt(0));
						}
		}
		for (j = 0;j < l;j++)
		{
		System.out.printf("%c",s2.charAt(j));
		}
		return 0;
	}


}

