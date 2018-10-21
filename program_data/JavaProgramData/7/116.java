package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[256]);
		String a = new String(new char[256]);
		String t = new String(new char[256]);
		char c;
		int i;
		int ls;
		int j;
		int la;
		int lt;
		int g;
		int word = 0;
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
			t = tempVar3.charAt(0);
		}
		ls = s.length();
		la = a.length();
		lt = t.length();

		for (i = 0;i < ls;i++)
		{
			if (word == 0)
			{
				g = 0;
				if (s.charAt(i) == a.charAt(0))
				{
					g++;
					for (j = i + 1;j < i + la;j++)
					{
						if (s.charAt(j) == a.charAt(g))
						{
							g++;
						}
					}
					if (g == la)
					{
						word = 1;
						for (j = i;j < i + la;j++)
						{
							s = tangible.StringFunctions.changeCharacter(s, j, t.charAt(j - i));
						}
					}
				}
			}
		}

		System.out.printf("%s",s);
		return 0;
	}








}

