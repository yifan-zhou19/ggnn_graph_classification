package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int l;
		int j;
		String s = new String(new char[1000]);
		s = new Scanner(System.in).nextLine();
		l = s.length();
		for (i = 0;i < l;i++)
		{
			if (s.charAt(i) == ' ' && s.charAt(i - 1) == ' ')
			{
			for (j = i;j < l - 1;j++)
			{
				s = tangible.StringFunctions.changeCharacter(s, j, s.charAt(j + 1));
			}
			l = l - 1;
			i = i - 1;
			}
		}
			for (i = 0;i < l;i++)
			{
			System.out.printf("%c",s.charAt(i));
			}
			return 0;
	}

}

