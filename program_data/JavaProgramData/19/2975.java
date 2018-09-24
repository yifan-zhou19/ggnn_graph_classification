package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[101]);
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		String c = new String(new char[203]);
		s = tangible.StringFunctions.changeCharacter(s, 0, a[0] = b[0] = ' ');
		s = tangible.StringFunctions.changeCharacter(s, 1, new Scanner(System.in).nextLine());
		a = tangible.StringFunctions.changeCharacter(a, 1, ConsoleInput.readToWhiteSpace(true));
		b = tangible.StringFunctions.changeCharacter(b, 1, ConsoleInput.readToWhiteSpace(true));
		int slen = s.length() + 1;
		int alen = a.length() + 1;
		int blen = b.length() + 1;
		s = tangible.StringFunctions.changeCharacter(s, slen - 1, a[alen - 1] = b[blen - 1] = ' ');
		s = tangible.StringFunctions.changeCharacter(s, slen, a[alen] = b[blen] = '\0');
		int i;
		int j;
		for (i = 0, j = 0; i < slen; ++i, ++j)
		{
			if (strncmp(s.Substring(i), a, alen) == 0)
			{
				c.Substring(j) = b;
				i = i + alen - 1;
				j = j + blen - 1;
			}
			else
			{
				c = tangible.StringFunctions.changeCharacter(c, j, s.charAt(i));
			}
		}
		c = c.substring(0, j - 1);
		System.out.print(c.charAt(1));
		System.out.print("\n");
		return 0;
	}

}

