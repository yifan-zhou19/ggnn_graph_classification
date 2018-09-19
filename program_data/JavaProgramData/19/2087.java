package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int j = 0;
		int i;
		int l;
		int ls;
		String s = new String(new char[105]);
		String str = new String(new char[105]);
		String a = new String(new char[105]);
		String x = new String(new char[105]);
		final String s1 = " ";
		final String s2 = " ";
		s = new Scanner(System.in).nextLine();
		str = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		s += s2;
		s1 += s;
		s = s1;
		l = str.length();
		ls = a.length();
		x = s;
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			if (s.charAt(i) == str.charAt(j))
			{
				j++;
			}
			else
			{
				j = 0;
			}
			if (l == j && s.charAt(i - j) == ' ' && s.charAt(i + 1) == ' ')
			{
				if (i - j != -1)
				{
					x = tangible.StringFunctions.changeCharacter(x, i - j + 1, '\0');
					x += a;
				}
				else
				{
					x = a;
				}
				x += s.Substring(i) + 1;
				i = i + ls - l;
				j = 0;
				s = x;
			}
		}
		for (i = 0;x.charAt(i + 2) != '\0';i++)
		{
			x = tangible.StringFunctions.changeCharacter(x, i, x.charAt(i + 1));
		}
		x = tangible.StringFunctions.changeCharacter(x, i, '\0');
		System.out.printf("%s",x);
		return 0;
	}
}

