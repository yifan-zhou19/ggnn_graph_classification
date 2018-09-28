package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String s1 = new String(new char[80]);
		String s2 = new String(new char[80]);
		String s3 = new String(new char[80]);
		String s4 = new String(new char[80]);
		int i;
		int j;
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		for (i = 0;s1.charAt(i) != '\0';i++)
		{
			if (s1.charAt(i) >= 'A' && s1.charAt(i) <= 'Z')
			{
				s3 = tangible.StringFunctions.changeCharacter(s3, i, Character.toLowerCase(s1.charAt(i))); //???strlwr()?strupr()????????????
			}
			else
			{
				s3 = tangible.StringFunctions.changeCharacter(s3, i, s1.charAt(i));
			}
		}
		s3 = tangible.StringFunctions.changeCharacter(s3, i, '\0'); //????????????????
		for (j = 0;s2.charAt(j) != '\0';j++)
		{
			if (s2.charAt(j) >= 'A' && s2.charAt(j) <= 'Z')
			{
				s4 = tangible.StringFunctions.changeCharacter(s4, j, Character.toLowerCase(s2.charAt(j)));
			}
			else
			{
				s4 = tangible.StringFunctions.changeCharacter(s4, j, s2.charAt(j));
			}
		}
		s4 = tangible.StringFunctions.changeCharacter(s4, i, '\0'); //????????????????

		if (strcmp(s3,s4) > 0)
		{
			System.out.printf("%c\n",'>');
		}
		if (strcmp(s3,s4) == 0)
		{
			System.out.printf("%c\n",'=');
		}
		if (strcmp(s3,s4) < 0)
		{
			System.out.printf("%c\n",'<');
		}
	}


}

