package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[1000]);
		int i;
		int j;
		int k;
		int t;
		int l;
		int f = 0;
		s = new Scanner(System.in).nextLine();
		l = s.length();
		for (i = 0;i < l - 1;i++)
		{
			if (s.charAt(i) == ' ' && s.charAt(i + 1) == ' ' && f == 0)
			{
				j = i;
				f = 1;
			}
			else if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ' && f == 1)
			{
				k = i;
				for (t = j;t < l - k + j;t++)
				{
					s = tangible.StringFunctions.changeCharacter(s, t, s.charAt(i));
					i++;
				}
				s = tangible.StringFunctions.changeCharacter(s, t, '\0');
				f = 0;
				i = j;
			}
		}
		System.out.printf("%s",s);
		return 0;
	}
}

