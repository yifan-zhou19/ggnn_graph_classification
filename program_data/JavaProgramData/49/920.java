package <missing>;

public class GlobalMembers
{
	public static void srev(String str, int len)
	{
		String rev = new String(new char[500]);
		int i;
		for (i = 0; i < len; i++)
		{
			*(rev.Substring(i)) = str[len - i - 1];
		}
		for (i = 0; i < len; i++)
		{
			str[i] = (rev.Substring(i));
		}
	}
	public static int Main()
	{
		String s = new String(new char[500]);
		String str = new String(new char[500]);
		String rev = new String(new char[500]);
		s = new Scanner(System.in).nextLine();
		int len = s.length();
		int i;
		int j;
		for (i = 2; i < len; i++)
		{
			for (j = 0; j < len - i + 1; j++)
			{
				str = s.substring(j, j + i);
				rev = s.substring(j, j + i);
				str = tangible.StringFunctions.changeCharacter(str, i, rev[i] = '\0');
				srev(rev, i);
				if (strcmp(str, rev) == 0)
				{
					System.out.println(str);
				}
			}
		}
		return 0;
	}
}

