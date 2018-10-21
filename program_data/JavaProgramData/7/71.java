package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[256]);
		String sub = new String(new char[256]);
		String rep = new String(new char[256]);
		int i;
		int j;
		int k;
		int lens;
		int lensub;

		s = new Scanner(System.in).nextLine(), gets(sub), gets(rep);
		lens = s.length();
		lensub = sub.length();

		for (i = 0; i <= lens - lensub; i++)
		{
			for (j = 0; j < lensub; j++)
			{
				if (s.charAt(i + j) != sub.charAt(j))
				{
					break;
				}
			}
			if (j == lensub)
			{
				for (k = 0; k < j; k++)
				{
					s = tangible.StringFunctions.changeCharacter(s, i + k, '@');
				}
				i += j - 1;
				break; // ??????????????????????
			}
		}

		for (i = 0; i < lens; i++)
		{
			if (s.charAt(i) == '@')
			{
				while (s.charAt(i) == '@')
				{
					i++;
				}
				i--;
				System.out.printf("%s", rep);
			}
			else
			{
				System.out.printf("%c", s.charAt(i));
			}
		}

		return 0;
	}

}

