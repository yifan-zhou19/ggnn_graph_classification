package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[251]);
		String b = new String(new char[251]);
		String aa = new String(new char[251]);
		String bb = new String(new char[251]);
		int la;
		int lb;
		int i;
		int ii;
		int jin = 0;
		int l;
		int zero = 0;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (i = 0;i < 251;i++)
		{
			if (a.charAt(i) != '0')
			{
			ii = i;
			break;
			}
		}
		if (ii != 0)
		{
			for (i = ii;i < 251;i++)
			{
				a = tangible.StringFunctions.changeCharacter(a, i - ii, a.charAt(i));
			}
		}
		for (i = 0;i < 251;i++)
		{
			if (b.charAt(i) != '0')
			{
			ii = i;
			break;
			}
		}
		if (ii != 0)
		{
			for (i = ii;i < 251;i++)
			{
				b = tangible.StringFunctions.changeCharacter(b, i - ii, b.charAt(i));
			}
		}
		la = a.length(),lb = b.length(),l = la;
		if (la > lb)
		{
			l = la,b[la] = '\0';
			for (i = la - 1;i >= la - lb;i--)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i - la + lb));
			}
			for (i = 0;i < la - lb;i++)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, '0');
			}
		}
		else if (lb > la)
		{
			l = lb,a[lb] = '\0';
			for (i = lb - 1;i >= lb - la;i--)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i - lb + la));
			}
			for (i = 0;i < lb - la;i++)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, '0');
			}
		}
		for (i = l - 1;i >= 0;i--)
		{
			if (a.charAt(i) + b.charAt(i) - '0' + jin > '9')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + b.charAt(i) - '0' + jin - 10,jin = 1);
			}
			else
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + b.charAt(i) - '0' + jin,jin = 0);
			}
		}
		if (jin == 1)
		{
			System.out.print(1);
			zero = 1;
		}
		for (i = 0;i < l;i++)
		{
			System.out.print(a.charAt(i));
			zero = 1;
		}
		if (zero == 0)
		{
			System.out.print(0);
			System.out.print("\n");
		}
		return 0;
	}


}

