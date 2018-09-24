package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		int x;
		int y;
		int m;
		String s = new String(new char[300]);
		String a = new String(new char[300]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		s = tangible.StringFunctions.changeCharacter(s, 0, '1');
		for (;n > 0;n--)
		{
			x = y = 0;
			m = i + 1;
			m--;
			for (i = 0; i <= m; i++)
			{
				y = x + (s.charAt(m - i) - '0') * 2;
				a = tangible.StringFunctions.changeCharacter(a, i, y % 10 + '0');
				x = y / 10;
			}
			if (x != 0)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, x + '0');
			}
			else
			{
				i--;
			}
			for (m = 0; m <= i; m++)
			{
				s = tangible.StringFunctions.changeCharacter(s, m, a.charAt(i - m));
			}
		}
		for (m = 0; m <= i ; m++)
		{
			System.out.print(s.charAt(m));
		}
		return 0;
	}

}

