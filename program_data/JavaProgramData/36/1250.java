package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[number]);
		String s = new String(new char[number]);
		char tmp;
		int i;
		int m;
		int j;
		for (i = 0;i < 100;i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, ' ');
			s = tangible.StringFunctions.changeCharacter(s, i, ' ');
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		for (j = 0;j < 98;j++)
		{
			for (i = 0;i < 98 - j;i++)
			{
				if (a.charAt(i) < a.charAt(i + 1))
				{
					tmp = a.charAt(i);
					a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i + 1));
					a = tangible.StringFunctions.changeCharacter(a, i + 1, tmp);
				}
				if (s.charAt(i) < s.charAt(i + 1))
				{
					tmp = s.charAt(i);
					s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i + 1));
					s = tangible.StringFunctions.changeCharacter(s, i + 1, tmp);
				}
			}
		}
		m = 1;
		for (i = 0;i < 98;i++)
		{
			if (a.charAt(i) != s.charAt(i))
			{
				m = 0;
				break;
			}
			if (a.charAt(i) == ' ')
			{
				break;
			}
		}
		if (m == 0)
		{
			System.out.print("NO\n");
		}
		else if (m == 1)
		{
			System.out.print("YES");
		}
		return 0;
	}
}

