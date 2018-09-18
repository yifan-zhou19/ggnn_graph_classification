package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		final String c = " ";
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();

		int i;
		String a2 = new String(new char[100]);
		a2 = tangible.StringFunctions.changeCharacter(a2, 0, ' ');
		a2 = tangible.StringFunctions.changeCharacter(a2, 1, a.charAt(0));
		for (i = 1;a.charAt(i - 1) != '\0';i++)
		{
			a2 = tangible.StringFunctions.changeCharacter(a2, i + 1, a.charAt(i));
		}

		String tmp = new String(new char[100]);
		final String s2 = "";

		int j;
		tmp = tangible.StringFunctions.changeCharacter(tmp, 0, s.charAt(0));
		for (i = 1;s.charAt(i - 1) != ' ' && s.charAt(i - 1) != '\0';i++)
		{
			if (s.charAt(i) == ' ' || s.charAt(i) == '\0')
			{
				tmp = tangible.StringFunctions.changeCharacter(tmp, i, '\0');
			}
			else
			{
				tmp = tangible.StringFunctions.changeCharacter(tmp, i, s.charAt(i));
			}
		}
		if (strcmp(tmp,a) == 0)
		{
			System.out.printf("%s",b);
		}
		else
		{
			   System.out.printf("%s",tmp);
		}

		for (i = 0;s.charAt(i) != '\0';i++)
		{
			if (s.charAt(i) == ' ')
			{
				for (j = i + 1;s.charAt(j) != ' ' && s.charAt(j) != '\0';j++)
				{
					tmp = tangible.StringFunctions.changeCharacter(tmp, 0, ' ');
					if (s.charAt(j + 1) == ' ' || s.charAt(j + 1) == '\0')
					{
						tmp = tangible.StringFunctions.changeCharacter(tmp, j - i, s.charAt(j));
						tmp = tangible.StringFunctions.changeCharacter(tmp, j - i + 1, '\0');
					}
					else
					{
						tmp = tangible.StringFunctions.changeCharacter(tmp, j - i, s.charAt(j));
					}
				}
			}
			else
			{
				continue;
			}

			if (strcmp(tmp,a2) == 0)
			{
				System.out.printf("%s",c);
				System.out.printf("%s",b);
			}
			else
			{
				System.out.printf("%s",tmp);
			}
		}
		System.out.print("\n");
		return 0;
	}

}

