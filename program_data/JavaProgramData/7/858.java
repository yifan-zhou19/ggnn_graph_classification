package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[256]);
		String a = new String(new char[256]);
		String b = new String(new char[256]);
		String c = new String(new char[256]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = tempVar3.charAt(0);
		}
		int i;
		int j;
		int n;
		int k;
		int m = 0;
		int max;
		for (i = 0;i < s.length() - a.length() + 1;i++)
		{
				for (j = 0;j < a.length();j++)
				{
					c = tangible.StringFunctions.changeCharacter(c, j, s.charAt(i + j));
				}
					c = tangible.StringFunctions.changeCharacter(c, j + 1, '\0');
					if (strcmp(c,a) == 0)
					{
					break;
					}
					c = c.substring(0, j);
					m++;
		}

		if (b.length() > a.length())
		{
			max = b.length();
		}
		else
		{
			max = a.length();
		}
			if (m != s.length() - a.length() + 1)
			{
					for (j = 0;j < max;j++) //???????????????a?b?????????????????????
					{
							if (b.charAt(j) == '\0')
							{
							break;
							}
							s = tangible.StringFunctions.changeCharacter(s, i + j, b.charAt(j));
					}
						System.out.printf("%s",s);
			}
			else
			{
				System.out.printf("%s",s);
			}
		return 0;
	}

}

