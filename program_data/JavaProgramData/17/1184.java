package <missing>;

public class GlobalMembers
{
	public static final String x = "";
	public static final String tar = "";
	public static int len = 0;
	public static int ctr;

	public static void F(int s)
	{
		int i;
		for (i = s + 1;i < len;i++)
		{
			if (x.charAt(i) == '(' && tar.charAt(i) == '$' && ctr != 0)
			{
				F(i);
			}
			if (x.charAt(i) == ')' && tar.charAt(i) == '?')
			{
				tar = tangible.StringFunctions.changeCharacter(tar, s, tar[i] = ' ');
				ctr--;
				return;
			}
		}
		return;
	}

	public static int Main()
	{
		int i;
		while ((x = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			ctr = 0;
			System.out.print(x);
			System.out.print("\n");
			len = x.length();
			for (i = 0;i < len;i++)
			{
				if (x.charAt(i) == '(')
				{
					tar = tangible.StringFunctions.changeCharacter(tar, i, '$');
				}
				else if (x.charAt(i) == ')')
				{
					tar = tangible.StringFunctions.changeCharacter(tar, i, '?');
					ctr++;
				}
				else
				{
					tar = tangible.StringFunctions.changeCharacter(tar, i, ' ');
				}
			}
			tar = tangible.StringFunctions.changeCharacter(tar, len, '\0');
			for (i = 0;i < len - 1;i++)
			{
				if (x.charAt(i) == '(' && tar.charAt(i) == '$' && ctr != 0)
				{
					F(i);
				}
			}
			System.out.print(tar);
			System.out.print("\n");
		}
		return 0;
	}



}

