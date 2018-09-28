package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		String s = new String(new char[101]);
		String a = new String(new char[101]);
		s = new Scanner(System.in).nextLine();
		for (i = 0,j = 0;s.charAt(i) != '\0';i++)
		{
			if (s.charAt(i) == ' ')
			{
			continue;
			}
			else
			{
				a = tangible.StringFunctions.changeCharacter(a, j++, s.charAt(i));
				if (s.charAt(i + 1) == ' ')
				{
				a = tangible.StringFunctions.changeCharacter(a, j++, ' ');
				}
			}
		}
		a = tangible.StringFunctions.changeCharacter(a, j, '\0');
		System.out.println(a);
		return 0;
	}
}

