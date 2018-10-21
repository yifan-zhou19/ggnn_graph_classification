package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int lch;
		int lsub;
		int lre;
		String ch = new String(new char[256]);
		String subch = new String(new char[256]);
		String replace = new String(new char[256]);
		ch = ConsoleInput.readToWhiteSpace(true).charAt(0);
		subch = ConsoleInput.readToWhiteSpace(true).charAt(0);
		replace = ConsoleInput.readToWhiteSpace(true).charAt(0);
		lch = ch.length();
		lsub = subch.length();
		lre = replace.length();
		for (i = 0 ; i < lch ; i++)
		{
			if (ch.charAt(i) == subch.charAt(0))
			{
				for (j = 0 ; j < lsub ; j++)
				{
					if (ch.charAt(i + j) != subch.charAt(j))
					{
					break;
					}
				}
				if (j == lsub)
				{
					for (k = 0 ; k < lsub ; k++)
					{
						ch = tangible.StringFunctions.changeCharacter(ch, i + k, replace.charAt(k));
					}
					break;
				}
			}
		}
		for (i = 0 ; i < lch ; i++)
		{
			System.out.print(ch.charAt(i));
		}
		return 0;
	}

}

