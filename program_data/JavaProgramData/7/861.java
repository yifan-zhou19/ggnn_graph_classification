package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[256]);
		String b = new String(new char[256]);
		String c = new String(new char[256]);
		String d = new String(new char[256]);
		String e = new String(new char[256]);
		int i;
		int j;
		int lena;
		int lenb;
		int m;
		int n;
		int k;
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
		lena = a.length();
		lenb = b.length();
		for (i = 0;i < lena;i++)
		{
			m = 0;
			for (j = i;j < i + lenb;j++)
			{
				if (b.charAt(j - i) != a.charAt(j))
				{
				   m = 1;
				}
			}
			if (m == 0)
			{
				for (n = 0;n < i;n++)
				{
					d = tangible.StringFunctions.changeCharacter(d, n, a.charAt(n));
				}
				d = tangible.StringFunctions.changeCharacter(d, n, '\0');
				for (k = i + lenb;k < lena;k++)
				{
					e = tangible.StringFunctions.changeCharacter(e, k - i - lenb, a.charAt(k));
				}
				e = tangible.StringFunctions.changeCharacter(e, k - i - lenb, '\0');
				System.out.printf("%s%s%s",d,c,e);
				break;
			}
		}
		if (m == 1)
		{
			System.out.printf("%s",a);
		}
		return 0;
	}

}

