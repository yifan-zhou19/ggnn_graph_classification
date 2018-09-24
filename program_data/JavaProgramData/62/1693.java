package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[250]);
		String t = new String(new char[250]);
		int i;
		int j = 0;
		s = new Scanner(System.in).nextLine();
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			if (s.charAt(i) != ' ')
			{
				t = tangible.StringFunctions.changeCharacter(t, j, s.charAt(i));
				j++;
			}
			else
			{
				t = tangible.StringFunctions.changeCharacter(t, j, ' ');
				j++;
				while (s.charAt(i) == ' ')
				{
					i++;
				}
					i = i - 1;

			}
		}
			t = tangible.StringFunctions.changeCharacter(t, j, '\0');
			System.out.println(t);
	return 0;
	}
}

