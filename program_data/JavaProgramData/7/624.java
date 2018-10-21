package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[256]);
		String s1 = new String(new char[256]);
		String s2 = new String(new char[256]);
		String ss = new String(new char[20]);
		String re = new String(new char[20]);
		int i;
		int j;
		int x = 0;
		int y = 0;
		int a;
		int flag = 0;
		s = new Scanner(System.in).nextLine();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			ss = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			re = tempVar2.charAt(0);
		}
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			if (s.charAt(i) != ss.charAt(0))
			{
				s1 = tangible.StringFunctions.changeCharacter(s1, x, s.charAt(i));
				x++;
			}
			else if (s.charAt(i) == ss.charAt(0))
			{
				a = i;
				flag = 1;
				for (j = 0;ss.charAt(j) != '\0';j++)
				{
					if (ss.charAt(j) != s.charAt(a))
					{
						flag = 0;
					}
					a++;
				}
				if (flag == 0)
				{
					s1 = tangible.StringFunctions.changeCharacter(s1, x, s.charAt(i));
					x++;
				}
			}
			if (flag == 1)
			{
				s1 = tangible.StringFunctions.changeCharacter(s1, x, '\0');
				break;
			}
		}
		if (flag == 1)
		{
			for (i += ss.length();s.charAt(i) != '\0';i++)
			{
				s2 = tangible.StringFunctions.changeCharacter(s2, y, s.charAt(i));
				y++;
			}
		}
		s2 = tangible.StringFunctions.changeCharacter(s2, y, '\0');
		if (flag == 1)
		{
			System.out.printf("%s%s%s", s1, re, s2);
		}
		if (flag == 0)
		{
			System.out.printf("%s", s);
		}
		return 0;
	}
}

