package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[80]);
		String t = new String(new char[80]);
		s = new Scanner(System.in).nextLine();
		t = new Scanner(System.in).nextLine();
		int m;
		int n;
		int i;
		m = s.length();
		n = t.length();
		for (i = 0;i < m;i++)
		{
			if (s.charAt(i) > 'A' && s.charAt(i) < 'Z')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) - 'A'+'a');
			}
		}
		for (i = 0;i < n;i++)
		{
			if (t.charAt(i) > 'A' && t.charAt(i) < 'Z')
			{
				t = tangible.StringFunctions.changeCharacter(t, i, t.charAt(i) - 'A'+'a');
			}
		}
		int p;
		p = strcmp(s,t);
		if (p > 0)
		{
			System.out.print(">");
		}
		else if (p < 0)
		{
			System.out.print("<");
		}
		else
		{
			System.out.print("=");
		}
		return 0;
	}
}

