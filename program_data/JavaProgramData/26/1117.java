package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int p;
		int n;
		String ori = new String(new char[101]);
		String tra = new String(new char[101]);
		ori = new Scanner(System.in).nextLine();
		n = ori.length();
		tra = tangible.StringFunctions.changeCharacter(tra, 0, ori.charAt(0));
		p = 1;
		for (i = 1;i <= n;i++)
		{
			if (ori.charAt(i) != ' ' || ori.charAt(i - 1) != ' ')
			{
				tra = tangible.StringFunctions.changeCharacter(tra, p, ori.charAt(i));
				p = p + 1;
			}

		}
		System.out.printf("%s",tra);

		return 0;
	}
}

