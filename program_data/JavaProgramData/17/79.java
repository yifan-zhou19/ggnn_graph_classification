package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int l;
		String as = new String(new char[110]);
		String bs = new String(new char[110]);
		String cs = new String(new char[110]);
		for (k = 0;;k++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				as = tempVar.charAt(0);
			}
			int len = as.length();
			if (strcmp(as,bs) == 0)
			{
				break;
			}
			bs = as;
			for (i = 0;i < len;i++)
			{
			cs = tangible.StringFunctions.changeCharacter(cs, i, ' ');
			}
			cs = cs.substring(0, len);
			for (l = 0;l < len;l++)
			{
			for (i = l;i < len;i++)
			{
				if (as.charAt(i) == ')')
				{
					for (j = i;j >= 0;j--)
					{
						if (as.charAt(j) == '(')
						{
							as = tangible.StringFunctions.changeCharacter(as, i, ' ');
							as = tangible.StringFunctions.changeCharacter(as, j, ' ');
							j = 0;
							i = 0;
						}
					}
				}
			}
			}
			for (i = 0;i < len;i++)
			{
				if (as.charAt(i) == '(')
				{
					cs = tangible.StringFunctions.changeCharacter(cs, i, '$');
				}
				else if (as.charAt(i) == ')')
				{
					cs = tangible.StringFunctions.changeCharacter(cs, i, '?');
				}
			}
			System.out.printf("%s\n%s\n",bs,cs);
			bs = as;
		}
		return 0;
	}
}

