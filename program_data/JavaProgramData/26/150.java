package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[100]);
		s = new Scanner(System.in).nextLine();
		int i;
		int j = 1;
		for (i = 0; i < s.length(); i++)
		{
			j = 1;
			if (s.charAt(i) == ' ')
			{
				while (s.charAt(i + j) == ' ')
				{
					s = tangible.StringFunctions.changeCharacter(s, i + j, '/');
					j++;
				}
			}
		}
		//printf("%s",s);
		for (i = 0; i < s.length(); i++)
		{
			if (s.charAt(i) != '/')
			{
				System.out.printf("%c",s.charAt(i));
			}
		}
	}
}

