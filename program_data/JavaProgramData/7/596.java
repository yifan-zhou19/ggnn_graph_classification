package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[256]);
		String a = new String(new char[256]);
		String b = new String(new char[256]);
		int i;
		int j;
		int x = 0;
		int m;
		int n;
		int y = 0;
		int p;
		char c;
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
		n = b.length();
		p = s.length();
		for (i = 0;i <= p - n;i++)
		{
			c = s.charAt(i);
			if (c == a.charAt(0))
			{
				for (j = 0;j < n;j++)
				{
					if (a.charAt(j) != s.charAt(i + j))
					{
						x = 1;
					}
					else
					{
						x = 0;
					}
				}
				if (x == 0)
				{
					m = i;
					y = 1;
					break;
				}
			}
		}
		if (y == 1)
		{
		for (i = m,j = 0;i < m + n;i++,j++)
		{
			s = tangible.StringFunctions.changeCharacter(s, i, b.charAt(j));
		}
		}
		System.out.println(s);
		return 0;
	}



}

