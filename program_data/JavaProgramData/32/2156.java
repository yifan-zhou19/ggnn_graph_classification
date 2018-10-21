package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String c = new String(new char[100]);
		String r = new String(new char[100]);
		String str = new String(new char[100]);
		String substr = new String(new char[100]);
		int i;
		int j;
		int m1;
		int m2;
		int n;
		int k;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 1;k <= n;k++)
		{
			str = tangible.StringFunctions.changeCharacter(str, 0, '\0');
			substr = tangible.StringFunctions.changeCharacter(substr, 0, '\0');
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				substr = tempVar3.charAt(0);
			}
			m1 = str.length();
			m2 = substr.length();
			for (i = 0,j = m1 - 1;i < m1;i++,j--)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, str.charAt(j));
			}
			a = tangible.StringFunctions.changeCharacter(a, i, '\0');
			for (i = 0,j = m2 - 1;i < m2;i++,j--)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, substr.charAt(j));
			}
			if (m1 > m2)
			{
				for (i = m2;i < m1;i++)
				{
					b = tangible.StringFunctions.changeCharacter(b, i, '0');
				}
			}
			b = tangible.StringFunctions.changeCharacter(b, i, '\0');
			for (i = 0;i < m1;i++)
			{
				if (a.charAt(i) >= b.charAt(i))
				{
					c = tangible.StringFunctions.changeCharacter(c, i, a.charAt(i) - b.charAt(i) + 48);
				}
				else
				{
					c = tangible.StringFunctions.changeCharacter(c, i, a.charAt(i) + 10 - b.charAt(i) + 48);
					a.charAt(i + 1)--;
				}
			}
			for (i = m1 - 1;c.charAt(i) == '0';i--)
			{
				;
			}
			c = tangible.StringFunctions.changeCharacter(c, i + 1, '\0');
			t = c.length();
			for (i = 0,j = t - 1;i < t;i++,j--)
			{
				r = tangible.StringFunctions.changeCharacter(r, i, c.charAt(j));
			}
			r = tangible.StringFunctions.changeCharacter(r, i, '\0');
			System.out.println(r);
		}

	}


}

