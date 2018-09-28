package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s1 = new String(new char[81]);
		String s2 = new String(new char[81]);
		int i;
		int n;
		int m;

		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		n = s1.length();
		m = s2.length();
		if (n < m)
		{
			n = m;
		}

		for (i = 0;i < n;i++)
		{
			if (s1.charAt(i) != s2.charAt(i) && s1.charAt(i) - s2.charAt(i) != 32 && s2.charAt(i) - s1.charAt(i) != 32)
			{
				break;
			}
		}

		if (i >= n)
		{
			System.out.print("=\n");
		}
		else
		{
			if (s1.charAt(i) < 'a')
			{
				s1 = tangible.StringFunctions.changeCharacter(s1, i, s1.charAt(i) + 32);
			}
			if (s2.charAt(i) < 'a')
			{
				s2 = tangible.StringFunctions.changeCharacter(s2, i, s2.charAt(i) + 32);
			}

			if (s1.charAt(i) > s2.charAt(i))
			{
				System.out.print(">\n");
			}
			else
			{
				System.out.print("<\n");
			}
		}
	}

}

