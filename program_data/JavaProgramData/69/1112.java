package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sa = new String(new char[250]);
		String sb = new String(new char[250]);
		String s = new String(new char[250]);
		String t = new String(new char[250]);
		char temp;
		int la;
		int lb;
		int i;
		int l;
		int c = 0;
		int dl;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			sa = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			sb = tempVar2.charAt(0);
		}
		la = sa.length();
		lb = sb.length();
		if (la > lb)
		{
			l = la;
		}
		else
		{
			l = lb;
			t = sa;
			sa = sb;
			sb = t;
		}
		dl = Math.abs(la - lb);
		for (i = l;i > 0;i--)
		{
			if (i - dl - 1 >= 0)
			{
				temp = sb.charAt(i - dl - 1);
			}
			else
			{
				temp = '0';
			}
			if ((int)sa.charAt(i - 1) + (int)temp + c - 96 > 9)
			{
				s = tangible.StringFunctions.changeCharacter(s, i, sa.charAt(i - 1) + temp - 58 + c);
				c = 1;
			}
			else
			{
				s = tangible.StringFunctions.changeCharacter(s, i, sa.charAt(i - 1) + temp - 48 + c);
				c = 0;
			}
		}
		if (c == 1)
		{
			s = tangible.StringFunctions.changeCharacter(s, 0, '1');
		}
		else
		{
			s = tangible.StringFunctions.changeCharacter(s, 0, '0');
		}
		c = 1;
		for (i = 0;i <= l;i++)
		{
			if (s.charAt(i) != '0' || c == 0)
			{
				System.out.printf("%c",s.charAt(i));
				c = 0;
			}
		}
		System.out.print("\n");
		return 0;
	}
}

