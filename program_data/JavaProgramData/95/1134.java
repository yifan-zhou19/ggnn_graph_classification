package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[81]);
		String s2 = new String(new char[81]);
		int i;
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		for (i = 0;;i++)
		{
			if (s1.charAt(i) >= 97 && s1.charAt(i) <= 122)
			{
				s1 = tangible.StringFunctions.changeCharacter(s1, i, s1.charAt(i) - 32);
			}
			if (s2.charAt(i) >= 97 && s2.charAt(i) <= 122)
			{
				s2 = tangible.StringFunctions.changeCharacter(s2, i, s2.charAt(i) - 32);
			}
			if (s1.charAt(i) > s2.charAt(i))
			{
				System.out.print(">\n");
				break;
			}
			else if (s1.charAt(i) < s2.charAt(i))
			{
				System.out.print("<\n");
				break;
			}
			else if (s1.charAt(i) == 0 && s1.charAt(i) == s2.charAt(i))
			{
				System.out.print("=\n");
				break;
			}
		}
		return 0;
	}
}

