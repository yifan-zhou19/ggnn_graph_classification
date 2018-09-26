package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int len;
		int n = 0;
		String s = new String(new char[NUM]);
		String c = new String(new char[NUM]);
		s = new Scanner(System.in).nextLine();
		len = s.length();
		for (i = 0;i < len - 1;i++)
		{
			if (s.charAt(i) == ' ' && s.charAt(i + 1) == ' ')
			{
				continue;
			}
			else
			{
				c = tangible.StringFunctions.changeCharacter(c, n, s.charAt(i));
				n++;
			}
		}
		if (s.charAt(len - 1) != ' ')
		{
			c = tangible.StringFunctions.changeCharacter(c, n, s.charAt(len - 1));
			c = tangible.StringFunctions.changeCharacter(c, n + 1, '\0');
		}
		else
		{
			c = tangible.StringFunctions.changeCharacter(c, n, '\0');
		}
		System.out.printf("%s",c);
		return 0;
	}

}

