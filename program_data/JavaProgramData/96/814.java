package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		String s = new String(new char[101]);
		char p;
		int i;
		int j;
		int len;
		int sh;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		len = a.length();
		for (i = 0;i <= len - 1;i++)
		{
			s = tangible.StringFunctions.changeCharacter(s, i, '0');
		}
		if (a.charAt(0) == '1' && a.charAt(1) == '0')
		{
			i = 2;
		}
		else
		{
			i = 1;
		}
		while (i < len)
		{
			if (i >= 2)
			{
				p = a.charAt(i - 2);
			}
			else
			{
				p = '0';
			}
			while ((int)(s.charAt(i) - '0') * 13 <= (int)(p - '0') * 100 + (int)(a.charAt(i - 1) - '0') * 10 + (int)(a.charAt(i) - '0'))
			{
				s.charAt(i)++;
			}
			if (s.charAt(i) > '0')
			{
				s.charAt(i)--;
			}
				sh = (int)(s.charAt(i) - '0') * 13;
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - sh % 10);
				if (a.charAt(i) < '0')
				{
					a.charAt(i - 1)--;
					a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + 10);
				}
				a = tangible.StringFunctions.changeCharacter(a, i - 1, a.charAt(i - 1) - ((sh % 100) / 10));
				if (a.charAt(i - 1) < '0')
				{
					a.charAt(i - 2)--;
					a = tangible.StringFunctions.changeCharacter(a, i - 1, a.charAt(i - 1) + 10);
				}
				if (i >= 2)
				{
					a.charAt(i - 2) -= sh / 100;
				}
				i++;
		}
		i = 0;
		while (s.charAt(i) == '0' && i < len - 1)
		{
			i++;
		}
		for (j = i;j <= len - 1;j++)
		{
			System.out.printf("%c",s.charAt(j));
		}
		System.out.print("\n");
		i = 0;
		while (a.charAt(i) == '0' && i < len - 1)
		{
			i++;
		}
		for (j = i;j <= len - 1;j++)
		{
			System.out.printf("%c",a.charAt(j));
		}
		return 0;
	}



}

