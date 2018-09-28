package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String s = new String(new char[1000]);
	int i;
	int l;
	int k;
	int m;
	s = new Scanner(System.in).nextLine();
	l = s.length();
	m = l;
	for (i = 0;i < l - 1;i++)
	{
		if (s.charAt(i) == ' ' && s.charAt(i + 1) == ' ')
		{
			for (k = i;k < m - 1;k++)
			{
				s = tangible.StringFunctions.changeCharacter(s, k, s.charAt(k + 1));
			}
			i--;
			m--;
		}
	}
	for (i = 0;i < m;i++)
	{
		System.out.printf("%c",s.charAt(i));
	}
	return 0;
	}

}

