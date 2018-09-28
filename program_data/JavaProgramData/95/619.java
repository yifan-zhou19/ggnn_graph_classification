package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int n;
		int m;
		int i;
		String s1 = new String(new char[80]);
		String s2 = new String(new char[80]);
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		n = s1.length();
		m = s2.length();
		for (i = 0;i < n;i++)
		{
			if (s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z')
			{
				s1 = tangible.StringFunctions.changeCharacter(s1, i, s1.charAt(i) - 32);
			}
		}
		for (i = 0;i < m;i++)
		{
			if (s2.charAt(i) >= 'a' && s2.charAt(i) <= 'z')
			{
				s2 = tangible.StringFunctions.changeCharacter(s2, i, s2.charAt(i) - 32);
			}
		}
		a = strcmp(s1,s2);
		if (a == 0)
		{
			System.out.print("=");
		}
		else if (a > 0)
		{
			System.out.print(">");
		}
		else if (a < 0)
		{
			System.out.print("<");
		}
	}
}

