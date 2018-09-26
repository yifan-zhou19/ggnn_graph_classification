package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[251]);
		String b = new String(new char[251]);
		String c = new String(new char[251]);
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
		int i;
		int j;
		int m;
		int n;
		int t;
		int x = 0;
		int y = 0;
		m = a.length();
		n = b.length();
		if (n > m)
		{
			c = b;
			b = a;
			a = c;
			t = n;
			n = m;
			m = t;
		}
		for (i = m - 1,j = n - 1;j >= 0;i--,j--)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 48 + b.charAt(j));
			if (a.charAt(i) > 57)
			{
				if (i != 0)
				{
					a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 10);
					a = tangible.StringFunctions.changeCharacter(a, i - 1, a.charAt(i - 1) + 1);
				}
				else
				{
					a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 10);
					System.out.print("1");
					x = 1;
				}

			}
		}
		for (i = m - 1;i >= 0;i--)
		{
			if (a.charAt(i) > 57)
			{
				if (i != 0)
				{
					a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 10);
					a = tangible.StringFunctions.changeCharacter(a, i - 1, a.charAt(i - 1) + 1);
				}
				else
				{
					a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 10);
					System.out.print("1");
					x = 1;
				}

			}

		}
		if (x == 1)
		{
			System.out.printf("%s",a);
		}

		else
		{
			for (i = 0;i < m;i++)
			{
				y++;
				if (a.charAt(i) != '0')
				{
					break;
				}
			}
			for (i = y - 1;i < m;i++)
			{
				System.out.printf("%c",a.charAt(i));
			}

		}

	}
}

