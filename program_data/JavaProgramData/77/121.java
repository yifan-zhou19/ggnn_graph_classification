package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char m;
		char f;
		char p;
		char l;
		String a = new String(new char[100]);
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		m = a.charAt(0);
		for (i = 0;i < a.length();i++)
		{
			if (a.charAt(i) != m)
			{
				f = a.charAt(i);
			}
		}
		p = 0;
		for (i = 0;i < a.length() / 2;i++)
		{
			for (j = 1;j < a.length();j++)
			{
				l = j;
				if (a.charAt(l) == f)
				{
					System.out.printf("%d %d\n",p,l);
					a = tangible.StringFunctions.changeCharacter(a, p, '|');
					a = tangible.StringFunctions.changeCharacter(a, l, '|');
					p = 0;
					break;
				}
				else if (a.charAt(l) == m)
				{
					p = l;
				}
			}
		}

		return 0;
	}
}

