package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[81]);
		String b = new String(new char[81]);
		int i;
		s = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = 0;i <= 80;i++)
		{
		if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
		{
			s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) - 'A'+'a');
		}
		}

		 for (i = 0;i <= 80;i++)
		 {
		if (b.charAt(i) >= 'A' && b.charAt(i) <= 'Z')
		{
			b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) - 'A'+'a');
		}
		 }

		if (strcmp(s,b) > 0)
		{
			System.out.print(">");
		}
		if (strcmp(s,b) < 0)
		{
			System.out.print("<");
		}
		if (strcmp(s,b) == 0)
		{
			System.out.print("=");
		}
	return 0;
	}
}

