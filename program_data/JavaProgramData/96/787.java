package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[200]);
		String s1 = new String(new char[200]);
		int i;
		int j;
		int len;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		len = s.length();
		m = 0;
		for (i = 0, j = 0; i < len; i++)
		{
			m = m * 10 + s.charAt(i) - '0';
			if (m >= 13)
			{
				s1 = tangible.StringFunctions.changeCharacter(s1, j, m / 13 + '0');
				m = m % 13;
				j++;
			}
			else
			{
				if (j != 0)
				{
					s1 = tangible.StringFunctions.changeCharacter(s1, j, '0');
					j++;
				}
			}
		}
		if (j == 0)
		{
			s1 = tangible.StringFunctions.changeCharacter(s1, 0, '0');
			j = 1;
		}
		s1 = tangible.StringFunctions.changeCharacter(s1, j, '\0');
		System.out.printf("%s\n%d\n", s1, m);
		return 0;
	}
}

