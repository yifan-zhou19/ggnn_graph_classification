package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int k;
		int j;
		int r = 0;
		int m = 0;
		int lens;
		int lena;
		String s = new String(new char[256]);
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String c = new String(new char[100]);
		String d = new String(new char[100]);
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
		lens = s.length();
		lena = a.length();
		for (i = 0;i < lens;i++)
		{
			m = 0;
			for (k = i;k < i + lena;k++)
			{
				if (a.charAt(k - i) != s.charAt(k))
				{
					m = 1;
				}
			}
			if (m == 0)
			{
				for (n = 0;n < i;n++)
				{
				 c = tangible.StringFunctions.changeCharacter(c, n, s.charAt(n));
				}
				c = tangible.StringFunctions.changeCharacter(c, n, '\0');
				for (j = i + lena;j < lens;j++)
				{
				 d = tangible.StringFunctions.changeCharacter(d, j - i - lena, s.charAt(j));
				}
				 d = tangible.StringFunctions.changeCharacter(d, j - i - lena, '\0');
				 r = 1;
				 System.out.printf("%s%s%s",c,b,d);
				 break;
			}

		}
		if (r == 0)
		{
			System.out.printf("%s",s);
		}

		return 0;
	}

}

