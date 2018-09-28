package <missing>;

public class GlobalMembers
{
	public static int add(char x, char y)
	{
		int m;
		int n;
		int result;
		m = ((int)x) - 48;
		n = ((int)y) - 48;
		result = (m + n >= 10)? (m + n - 10):(m + n);
		return result;
	}
	public static int over(char u, char v)
	{
		int p;
		int q;
		int overflow;
		p = ((int)u) - 48;
		q = ((int)v) - 48;
		overflow = (p + q >= 10)? 1:0;
		return overflow;
	}
	public static int Main()
	{
		String a = new String(new char[260]);
		String b = new String(new char[260]);
		String c = new String(new char[260]);
		int i;
		int j;
		int len;
		int lena;
		int lenb;
		int lenc;
		int o = 0;
		int count = 0;
		int highesta;
		int highestb;
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
		lena = (int)a.length();
		lenb = (int)b.length();
		len = (lena > lenb)? lena:lenb;
		if (len == lena)
		{
			for (i = lenb;i >= 0;i--)
			{
				b = tangible.StringFunctions.changeCharacter(b, i + lena - lenb, b.charAt(i));
			}
			for (i = 0;i < lena - lenb;i++)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, '0');
			}
		}
		else
		{
			for (i = lena;i >= 0;i--)
			{
				a = tangible.StringFunctions.changeCharacter(a, i + lenb - lena, a.charAt(i));
			}
			for (i = 0;i < lenb - lena;i++)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, '0');
			}
		}
		for (i = len - 1;i >= 0;i--)
		{
			if (i == len - 1)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, (char)(add(a.charAt(i), b.charAt(i)) + 48));
				o = over(a.charAt(i), b.charAt(i));
			}
			if (i > 0 && i < len - 1)
			{
				if ((add(a.charAt(i), b.charAt(i)) + o) == 10)
				{
					c = tangible.StringFunctions.changeCharacter(c, i, '0');
					o = 1;
				}
				else
				{
					c = tangible.StringFunctions.changeCharacter(c, i, (char)(add(a.charAt(i), b.charAt(i)) + 48 + o));
					o = over(a.charAt(i), b.charAt(i));
				}
			}
			if (i == 0)
			{
				highesta = ((int)a.charAt(0)) - 48;
				highestb = ((int)b.charAt(0)) - 48;
				if (highesta + highestb + o >= 10)
				{
					for (j = len - 1;j >= 1;j--)
					{
						c = tangible.StringFunctions.changeCharacter(c, j + 1, c.charAt(j));
					}
					c = tangible.StringFunctions.changeCharacter(c, 0, '1');
					c = tangible.StringFunctions.changeCharacter(c, 1, (char)((highesta + highestb + o - 10) + 48));
					c = tangible.StringFunctions.changeCharacter(c, len + 1, '\0');
				}
				else
				{
					c = tangible.StringFunctions.changeCharacter(c, 0, (char)((highesta + highestb + o) + 48));
					c = tangible.StringFunctions.changeCharacter(c, len, '\0');
				}
			}
		}
		lenc = c.length();
		for (i = 0;i < lenc - 1;i++)
		{
			if (c.charAt(i) == '0')
			{
				count++;
			}
			else
			{
				break;
			}
		}
		for (i = count;i < lenc - 1;i++)
		{
			System.out.printf("%c",c.charAt(i));
		}
		System.out.printf("%c\n",c.charAt(lenc - 1));
		return 0;
	}
}

