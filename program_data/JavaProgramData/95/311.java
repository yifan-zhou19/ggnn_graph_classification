package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String s = new String(new char[81]);
		String m = new String(new char[81]);
		s = new Scanner(System.in).nextLine();
		m = new Scanner(System.in).nextLine();
		int a;
		int b;
		int i;
		a = s.length();
		b = m.length();
		for (i = 0;i < a;i++)
		{
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) - 32);
			}
		}
		for (i = 0;i < b;i++)
		{
			if (m.charAt(i) >= 'a' && m.charAt(i) <= 'z')
			{
				m = tangible.StringFunctions.changeCharacter(m, i, m.charAt(i) - 32);
			}
		}
		int c;
		int k = 0;
		if (a >= b)
		{
			c = a;
		}
		else
		{
			c = b;
		}
		for (i = 0;i < c;i++)
		{
			if (s.charAt(i) > m.charAt(i))
			{
				System.out.print(">");
				break;
			}
			else if (s.charAt(i) < m.charAt(i))
			{
				System.out.print("<");
				break;
			}
			k++;
		}
		if (k == c)
		{
			System.out.print("=");
		}
	}
}

