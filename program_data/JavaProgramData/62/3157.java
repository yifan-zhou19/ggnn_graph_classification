package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[201]);
		String q = new String(new char[201]);
		int i = 0;
		int j = 0;
		s = new Scanner(System.in).nextLine();
		while (s.charAt(j) != null)
		{
			if (s.charAt(j) != ' ' || (s.charAt(j) == ' ' && s.charAt(j - 1) != ' '))
			{
			   q = tangible.StringFunctions.changeCharacter(q, i, s.charAt(j));
			i = i + 1;
			}
			j = j + 1;
		}
		q = tangible.StringFunctions.changeCharacter(q, i, '\0');
		System.out.printf("%s",q);
		return 0;

	}

}

