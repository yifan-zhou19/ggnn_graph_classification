package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[103]);
		String a = new String(new char[103]);
		String b = new String(new char[103]);
		String s2 = new String(new char[210]);
		int alen;
		int slen;
		int blen;
		int i;
		int j;
		s = tangible.StringFunctions.changeCharacter(s, 0, a[0] = b[0] = ' ');
		s = tangible.StringFunctions.changeCharacter(s, 1, new Scanner(System.in).nextLine());
		a = tangible.StringFunctions.changeCharacter(a, 1, ConsoleInput.readToWhiteSpace(true));
		b = tangible.StringFunctions.changeCharacter(b, 1, ConsoleInput.readToWhiteSpace(true));
		slen = s.length();
		alen = a.length();
		blen = b.length();
		s = tangible.StringFunctions.changeCharacter(s, slen, a[alen] = b[blen] = ' ');
		s = tangible.StringFunctions.changeCharacter(s, slen + 1, a[alen + 1] = b[blen + 1] = '\0');
		for (i = 0, j = 0; i <= slen; i++, j++)
		{
			if (strncmp(s.Substring(i), a, alen + 1) == 0)
			{
				s2.Substring(j) = b;
				i = i + alen;
				j = j + blen;
			}
			else
			{
				s2 = tangible.StringFunctions.changeCharacter(s2, j, s.charAt(i));
			}
		}

		s2 = s2.substring(0, j - 1);
		System.out.print(s2.charAt(1));
		System.out.print("\n");
		return 0;
	}



}

