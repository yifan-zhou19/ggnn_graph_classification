package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int d = 'a' - 'A';
		String s = new String(new char[80]);
		String sl = new String(new char[80]);
		int p = 1;
		s = new Scanner(System.in).nextLine();
		sl = new Scanner(System.in).nextLine();
		int i;
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			if (s.charAt(i) < 'Z')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) + d);
			}
		}
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			if (sl.charAt(i) < 'Z')
			{
				sl = tangible.StringFunctions.changeCharacter(sl, i, sl.charAt(i) + d);
			}
		}
		for (i = 0;s.charAt(i) != '\0' && sl.charAt(i) != '\0';i++)
		{
			if (s.charAt(i) > sl.charAt(i))
			{
				p = 0;
				System.out.print(">");
				break;
			}
			else if (s.charAt(i) < sl.charAt(i))
			{
				p = 0;
				System.out.print("<");
				break;
			}
		}
		if (p != 0)
		{
			System.out.print("=");
		}
		return 0;
	}
}

