package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String s1 = new String(new char[80]);
		String s2 = new String(new char[80]);
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		int i;
		int p = 0;
		int q = 0;
		for (i = 0;s1.charAt(i) != '\0';i++)
		{
			if (s1.charAt(i) <= 'Z' && s1.charAt(i) >= 'A')
			{
				s1 = tangible.StringFunctions.changeCharacter(s1, i, s1.charAt(i) + 32);
			}
		}
		for (i = 0;s2.charAt(i) != '\0';i++)
		{
			if (s2.charAt(i) <= 'Z' && s2.charAt(i) >= 'A')
			{
				s2 = tangible.StringFunctions.changeCharacter(s2, i, s2.charAt(i) + 32);
			}
		}
		for (i = 0;s1.charAt(i) != '\0' && s2.charAt(i) != '\0';i++)
		{
			if (s1.charAt(i) == s2.charAt(i))
			{
				continue;
			}
			if (s1.charAt(i) > s2.charAt(i))
			{
				System.out.print(">");
				p = 1;
				break;

			}
			if (s1.charAt(1) < s2.charAt(i))
			{
				System.out.print("<");
				q = 1;
				break;

			}
		}
		if (p == 0 && q == 0)
		{
			System.out.print("=");
		}

	}

}

