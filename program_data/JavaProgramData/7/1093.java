package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int t = 0;
		String c = new String(new char[256]);
		String d = new String(new char[256]);
		String e = new String(new char[256]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			d = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			e = tempVar3.charAt(0);
		}
		m = c.length();
		n = d.length();
		for (i = 0;i < m;i++)
		{
			if (c.charAt(i) == d.charAt(0))
			{
				t = 0;
				for (j = i;j < i + n;j++)
				{
					if (c.charAt(j) == d.charAt(j - i))
					{
						t = t + 1;
					}
				}
				if (t == n)
				{
					for (j = i;j < i + n;j++)
					{
						c = tangible.StringFunctions.changeCharacter(c, j, e.charAt(j - i));
					}
					break;
				}
			}
		}
		System.out.printf("%s",c);
		return 0;
	}


}

