package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String s = new String(new char[L]);
		s = new Scanner(System.in).nextLine();
		n = s.length();
		for (i = 0;i < n;i++)
		{
			if (s.charAt(i) == 32 && s.charAt(i + 1) == 32)
			{
				for (i;i < n;i++)
				{
					s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i + 1));
				}
				i = 0;
			}
		}
		for (i = 0;i < n;i++)
		{
			if ((s.charAt(i) == '.' && s.charAt(i + 1) == 'd') || (s.charAt(i) == 'c' && s.charAt(i + 1) == 'd'))
			{
				s = tangible.StringFunctions.changeCharacter(s, i + 1, '\0');
			}
		}
		System.out.printf("%s", s);
		return 0;
	}
}

