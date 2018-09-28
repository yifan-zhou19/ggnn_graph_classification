package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[101]);
		String modified = new String(new char[101]);
		int i;
		int j;
		s = new Scanner(System.in).nextLine();
		j = 0;
		for (i = 0;i < s.length() - 1;i++)
		{
			if (s.charAt(i) != ' ' || (s.charAt(i) == ' ' && s.charAt(i + 1) != ' '))
			{
				modified = tangible.StringFunctions.changeCharacter(modified, j, s.charAt(i));
				j++;
			}
		}
		if (s.charAt(s.length() - 1) != ' ')
		{
			modified = tangible.StringFunctions.changeCharacter(modified, j, s.charAt(s.length() - 1));
			modified = modified.substring(0, j + 1);
		}
		else
		{
			modified = modified.substring(0, j);
		}
		System.out.printf("%s\n",modified);
		return 0;
	}
}

