package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int slen;
		int alen;
		String[] ss = new String[2];
		String s = new String(new char[256]);
		String s1 = new String(new char[256]);
		String s2 = new String(new char[256]);
		int flag = 0;
		s = new Scanner(System.in).nextLine();
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		slen = s.length();
		alen = s1.length();
		/* no NEED
		blen=strlen(s2);
		*/

		for (i = 0;i < slen - alen + 1;i++)
		{
			for (j = 0;j < alen;j++)
			{
				if (s.charAt(i + j) != s1.charAt(j))
				{
					break;
				}
			}
			if (j == alen)
			{
				ss[1] = s.charAt(i + j);
				s = tangible.StringFunctions.changeCharacter(s, i, '\0');
				ss[0] = s;
				flag = 1; // find the substring

				break;
			}
		}
		if (flag == 0)
		{
			System.out.printf("%s\n", s);
		}
		else
		{
			System.out.printf("%s%s%s\n", ss[0], s2, ss[1]);
		}

		return 0;
	}

}

