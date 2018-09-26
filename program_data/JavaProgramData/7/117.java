package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[256]);
		String b = new String(new char[256]);
		String c = new String(new char[256]);
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
		int i;
		int l;
		int k;
		int m = 0;
		int n = 0;
		for (;;)
		{
			for (k = m;;k++)
			{
				if (a.charAt(k) == b.charAt(0))
				{
					n = 1;
					break;
				}
				if (a.charAt(k) == '\0')
				{
					n = 2;
					break;
				}
			}
			if (n == 2)
			{
				break;
			}
			else
			{
				m = k + 1;
				for (l = 1;;l++)
				{
					if (b.charAt(l) == '\0')
					{
						n = 3;
						break;
					}
					if (a.charAt(k + l) != b.charAt(l))
					{
						n = 4;
						break;
					}
				}
				if (n == 3)
				{
					break;
				}
			}
		}

		if (n == 2)
		{
			System.out.printf("%s",a);
		}
		else
		{
			for (i = 0;;i++)
			{
				a = tangible.StringFunctions.changeCharacter(a, k + i, a.charAt(k + i + b.length()));
				if (a.charAt(k + i + b.length()) == '\0')
				{
					break;
				}
			}
			for (i = c.length();i > 0;i--)
			{
				int x = a.length();
				for (l = 0;x - l >= k;l++)
				{
					a = tangible.StringFunctions.changeCharacter(a, x + 1 - l, a.charAt(x - l));
				}
				a = tangible.StringFunctions.changeCharacter(a, k, c.charAt(i - 1));
			}

			System.out.printf("%s",a);
		}
		return 0;
	}

}

