package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[101]);
		int i;
		int k = 0;
		s = new Scanner(System.in).nextLine();
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			if (s.charAt(i) != ' ')
			{
				s = tangible.StringFunctions.changeCharacter(s, k, s.charAt(i));
				k++;
			}
			else if (s.charAt(i) == ' ' && s.charAt(i - 1) != ' ')
			{
				s = tangible.StringFunctions.changeCharacter(s, k, s.charAt(i));
				k++;
			}
			else if (s.charAt(i) == ' ' && s.charAt(i - 1) == ' ')
			{
				k += 0;
			}
		}
		s = tangible.StringFunctions.changeCharacter(s, k, '\0');
		System.out.println(s);
		return 0;
	}

}

