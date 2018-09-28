package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[80]);
		String s2 = new String(new char[80]);
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		int i;

		for (i = 0;s1.charAt(i) != '\0' || s2.charAt(i) != '\0';i++)
		{
			s1 = tangible.StringFunctions.changeCharacter(s1, i, (s1.charAt(i) - 'A') % 32 + 'A');
			s2 = tangible.StringFunctions.changeCharacter(s2, i, (s2.charAt(i) - 'A') % 32 + 'A');
			if (s1.charAt(i) == s2.charAt(i))
			{
				continue;
			}
			else
			{
				if (s1.charAt(i) > s2.charAt(i))
				{
					System.out.print(">\n");
					break;
				}
				else
				{
					System.out.print("<\n");
					break;
				}
			}

		}
		if (s1.charAt(i) == '\0')
		{
			System.out.print("=");
		}
		return 0;
	}


}

