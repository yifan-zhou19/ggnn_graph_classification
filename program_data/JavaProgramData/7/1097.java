package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[256]);
		String b = new String(new char[256]);
		String c = new String(new char[256]);
		int la;
		int lb;
		int lc;
		int i;
		int j;
		int p = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = tempVar3.charAt(0);
		}
		la = a.length();
		lb = b.length();
		lc = c.length();
		for (i = 0;i < la;i++)
		{
			if (b.charAt(0) == a.charAt(i))
			{
				for (j = 1;j < lb;j++)
				{
					if (b.charAt(j) == a.charAt(i + j))
					{
						p = 0;
					}
					else
					{
						p = 1;
					}
				}
				if (p == 0)
				{
					for (j = 0;j < lc;j++)
					{
						a = tangible.StringFunctions.changeCharacter(a, i + j, c.charAt(j));
					}
					break;
				}
			}
		}
		System.out.printf("%s",a);
		return 0;
	}
}

