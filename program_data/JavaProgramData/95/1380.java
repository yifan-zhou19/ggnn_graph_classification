package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[81]);
		String s2 = new String(new char[81]);
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		int t = 0;
		int l1;
		int l2;
		int i;
		l1 = s1.length();
		l2 = s2.length();
		for (i = 0;i < l1;i++)
		{
			if (s1.charAt(i) >= 'A' && s1.charAt(i) <= 'Z')
			{
				s1 = tangible.StringFunctions.changeCharacter(s1, i, s1.charAt(i) - 'A'+'a');
			}
		}
		for (i = 0;i < l2;i++)
		{
			if (s2.charAt(i) >= 'A' && s2.charAt(i) <= 'Z')
			{
				s2 = tangible.StringFunctions.changeCharacter(s2, i, s2.charAt(i) - 'A'+'a');
			}
		}
		if (l1 > l2)
		{
			l1 = l2;
		}
		while (t < l1 && s1.charAt(t) == s2.charAt(t))
		{
			t++;
		}
		if (s1.charAt(t) > s2.charAt(t))
		{
			System.out.print(">");
		}
			else if (s1.charAt(t) < s2.charAt(t))
			{
				System.out.print("<");
			}
				else
				{
					System.out.print("=");
				}
	}
}

