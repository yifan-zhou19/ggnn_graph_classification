package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[251]);
		String b = new String(new char[251]);
		String c = new String(new char[251]);
		String d = new String(new char[251]);
		int i;
		int t = 0;
		int m;
		int n;
		int l1;
		int l2;
		int x;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		m = a.length();
		n = b.length();
		i = 0;
		while (a.charAt(i) == '0')
		{
			i++;
		}
		l1 = m - i;
		j = 0;
		while (b.charAt(j) == '0')
		{
			j++;
		}
		l2 = n - j;
		if (l1 >= l2)
		{
			for (i = 1;i <= l1;i++)
			{
				if (i <= l2)
				{
					x = a.charAt(m - i) + b.charAt(n - i) - 96 + t;
				c = tangible.StringFunctions.changeCharacter(c, l1 - i, x % 10 + 48);
				if (x >= 10)
				{
					t = 1;
				}
				else
				{
					t = 0;
				}
				}
				else
				{
					x = a.charAt(m - i) - 48 + t;
				c = tangible.StringFunctions.changeCharacter(c, l1 - i, x % 10 + 48);
				if (x >= 10)
				{
					t = 1;
				}
				else
				{
					t = 0;
				}
				}
			}
			c = tangible.StringFunctions.changeCharacter(c, l1, '\0');
			if (t == 1)
			{
				d = tangible.StringFunctions.changeCharacter(d, 0, 49);
				d = tangible.StringFunctions.changeCharacter(d, 1, '\0');
				d += c;
			}
			else
			{
				d = tangible.StringFunctions.changeCharacter(d, 0, '\0');
				d += c;
			}
			System.out.printf("%s",d);
		}
		else
		{
			for (i = 1;i <= l2;i++)
			{
				if (i <= l1)
				{
					x = a.charAt(m - i) + b.charAt(n - i) - 96 + t;
				c = tangible.StringFunctions.changeCharacter(c, l2 - i, x % 10 + 48);
				if (x >= 10)
				{
					t = 1;
				}
				else
				{
					t = 0;
				}
				}
				else
				{
					x = b.charAt(n - i) - 48 + t;
				c = tangible.StringFunctions.changeCharacter(c, l2 - i, x % 10 + 48);
				if (x >= 10)
				{
					t = 1;
				}
				else
				{
					t = 0;
				}
				}
			}
			c = tangible.StringFunctions.changeCharacter(c, l2, '\0');
			if (t == 1)
			{
				d = tangible.StringFunctions.changeCharacter(d, 0, 49);
				d = tangible.StringFunctions.changeCharacter(d, 1, '\0');
				d += c;
			}
			else
			{
				d = tangible.StringFunctions.changeCharacter(d, 0, '\0');
				d += c;
			}
			System.out.printf("%s",d);
		}
		if (l1 == 0 && l2 == 0)
		{
			System.out.print("0");
		}
	}
}

