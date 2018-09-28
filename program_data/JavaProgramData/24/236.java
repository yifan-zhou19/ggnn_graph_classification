package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String min = new String(new char[510]);
		String max = new String(new char[510]);
		String all = new String(new char[510]);
		String cur = new String(new char[510]);
		int len;
		int i;
		int j;
		int minlen = 510;
		int maxlen = 0;

		all = new Scanner(System.in).nextLine();

		len = all.length();

		j = 0;
		for (i = 0; i < len; ++i)
		{
			if (all.charAt(i) == ' ' || all.charAt(i) == '\0' || i == len - 1)
			{
				if (i == len - 1)
				{
					cur = tangible.StringFunctions.changeCharacter(cur, j++, all.charAt(i));
				}
				cur = tangible.StringFunctions.changeCharacter(cur, j, '\0');

				if (minlen > cur.length())
				{
					minlen = cur.length();
					min = cur;
				}
				if (maxlen < cur.length())
				{
					maxlen = cur.length();
					max = cur;
				}

				if (all.charAt(i) == '\0' || i == len)
				{
					break;
				}

				j = 0;
				continue;
			}

			cur = tangible.StringFunctions.changeCharacter(cur, j++, all.charAt(i));
		}

		System.out.printf("%s\n%s\n", max, min);

		return 0;
	}
}

