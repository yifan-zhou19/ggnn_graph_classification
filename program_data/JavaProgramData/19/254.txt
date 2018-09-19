package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[102]);
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		final String s0 = "";
		final String c = "";
		int i;
		int j = 0;
		int t;
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();

		for (i = 0; s.charAt(i) != '\0'; i++)
		{
			if (s.charAt(i) != ' ')
			{
				s0 = tangible.StringFunctions.changeCharacter(s0, j, s.charAt(i));
				j++;
			}
			if (s.charAt(i) == ' ' || s.charAt(i + 1) == '\0')
			{
				if (strcmp(s0, a) == 0)
				{
					c += b;
					c += " "; //??????????
					j = 0;
					for (t = 0; s0.charAt(t) != '\0'; t++)
					{
						s0 = tangible.StringFunctions.changeCharacter(s0, t, '\0');
					}
				}
				else
				{
					c += s0;
					c += " ";
					j = 0;
					for (t = 0; s0.charAt(t) != '\0'; t++)
					{
						s0 = tangible.StringFunctions.changeCharacter(s0, t, '\0');
					}
				}

			}
		}
		for (i = 0; c.charAt(i) != '\0'; i++)
		{
			if (c.charAt(i) == ' ' && c.charAt(i + 1) == '\0')
			{
				c = tangible.StringFunctions.changeCharacter(c, i, '\0');
			}
		}
		System.out.println(c);
		return 0;
	}

}

