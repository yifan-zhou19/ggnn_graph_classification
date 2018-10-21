package <missing>;

public class GlobalMembers
{
	public static int DO(tangible.RefObject<String> SPE, int length)
	{
		int k1 = 0;
		String p1 = null;
		String p2 = null;
		for (int i = 0;i < length;i++)
		{
			if (SPE.argValue.charAt(i) == '$')
			{
				k1++;
				p1 = SPE.argValue.Substring(i);
			}
			else if (SPE.argValue.charAt(i) == '?')
			{
				p2 = SPE.argValue.Substring(i);
				if (k1 != 0)
				{
					p1 = ' ';
					p2 = ' ';
					return DO(SPE, length);
				}
			}
		}
		return 0;
	}
	public static int Main()
	{
		String SPE = new String(new char[101]);
		while (~scanf("%s",SPE) != 0)
		{
			System.out.println(SPE);
			int length = SPE.length();
			for (int i = 0;i < length;i++)
			{
				if (SPE.charAt(i) != '(' && SPE.charAt(i) != ')')
				{
					SPE = tangible.StringFunctions.changeCharacter(SPE, i, ' ');
				}
				else if (SPE.charAt(i) == '(')
				{
					SPE = tangible.StringFunctions.changeCharacter(SPE, i, '$');
				}
				else if (SPE.charAt(i) == ')')
				{
					SPE = tangible.StringFunctions.changeCharacter(SPE, i, '?');
				}
			}
		tangible.RefObject<String> tempRef_SPE = new tangible.RefObject<String>(SPE);
			DO(tempRef_SPE, length);
			SPE = tempRef_SPE.argValue;
			System.out.println(SPE);
		}
		return 0;
	}
}

