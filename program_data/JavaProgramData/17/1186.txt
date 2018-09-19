package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int len;
		int e;
		String s = new String(new char[102]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 0;k < n;k++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			len = s.length();
			System.out.printf("%s\n",s);
			for (j = 0;j < len;j++)
			{
				if (s.charAt(j) != '(' && s.charAt(j) != ')')
				{
					s = tangible.StringFunctions.changeCharacter(s, j, ' ');
				}
			}
			for (i = len - 1;i >= 0;i--)
			{
				if (s.charAt(i) == '(')
				{
					for (e = i + 1;e < len;e++)
					{
						if (s.charAt(e) == ')')
						{
							s = tangible.StringFunctions.changeCharacter(s, i, ' ');
							s = tangible.StringFunctions.changeCharacter(s, e, ' ');
							break;
						}
					}
				}
			}
			for (j = 0;j < len;j++)
			{
				if (s.charAt(j) == '(')
				{
					s = tangible.StringFunctions.changeCharacter(s, j, '$');
				}
				if (s.charAt(j) == ')')
				{
					s = tangible.StringFunctions.changeCharacter(s, j, '?');
				}
			}
			System.out.printf("%s\n",s);
		}
		return 0;
	}
}

