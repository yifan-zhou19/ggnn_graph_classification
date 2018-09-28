package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int e;
				String s = new String(new char[256]);
				String b = new String(new char[256]);
				String a = new String(new char[256]);
				s = new Scanner(System.in).nextLine();
				a = new Scanner(System.in).nextLine();
				b = new Scanner(System.in).nextLine();
				int c;
				i = 0;
		for (i = 0;s.charAt(i) != '\0';i++)
		{
		j = 0;
		c = 0;
		e = i;
		if (s.charAt(i) == a.charAt(j))
		{
		for (;a.charAt(j) != '\0';j++,i++)
		{
			if (a.charAt(j) != s.charAt(i))
			{
			c++;
			}
		}
		if (c == 0)
		{
			for (j = 0;a.charAt(j) != '\0';j++,e++)
			{
				s = tangible.StringFunctions.changeCharacter(s, e, b.charAt(j));
			}
			break;
		}
		}
	i = e;
		}

	System.out.printf("%s",s);
	return 0;
	}

}

