package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[N]);
		String b = new String(new char[N]);
		String c = new String(new char[N]);
		char t;
		int i;
		int r;
		int x;
		int la;
		int lb;
		for (i = 0;i < N;i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, '\0');
			b = tangible.StringFunctions.changeCharacter(b, i, '\0');
			c = tangible.StringFunctions.changeCharacter(c, i, '\0');
		}

		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();

		while (a.charAt(0) == '0' && a.length() != 1)
		{
			for (i = 0;a.charAt(i + 1) != '\0';i++)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i + 1));
			}
			a = tangible.StringFunctions.changeCharacter(a, i, '\0');
		}
		while (b.charAt(0) == '0' && b.length() != 1)
		{
			for (i = 0;b.charAt(i + 1) != '\0';i++)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i + 1));
			}
			b = tangible.StringFunctions.changeCharacter(b, i, '\0');
		}

		la = a.length();
		for (i = 0;i <= la / 2.0 - 1;i++)
		{
			t = a.charAt(i);
			a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(la - i - 1));
			a = tangible.StringFunctions.changeCharacter(a, la - i - 1, t);
		}

		lb = b.length();
		for (i = 0;i <= lb / 2.0 - 1;i++)
		{
			t = b.charAt(i);
			b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(lb - i - 1));
			b = tangible.StringFunctions.changeCharacter(b, lb - i - 1, t);
		}



		for (i = 0;i < ((la >= lb)?la:lb);i++)
		{
			if (a.charAt(i) == '\0')
			{
				c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) + b.charAt(i) - '0');
			}
			else if (b.charAt(i) == '\0')
			{
				c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) + a.charAt(i) - '0');
			}
			else
			{
				c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) + a.charAt(i) - '0' + b.charAt(i) - '0');
			}

			//printf("%d %d %d\n",a[i],b[i],c[i]);

			r = i;
			while (c.charAt(r) >= 10)
			{
				x = c.charAt(r);
				c = tangible.StringFunctions.changeCharacter(c, r, x % 10);
				c = tangible.StringFunctions.changeCharacter(c, r + 1, (x - c.charAt(r)) / 10);
				r++;
			}
		}

		for (i = 0;i <= r;i++)
		{
			c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) + '0');
		}

		for (i = r;i >= 0;i--)
		{
			System.out.printf("%c",c.charAt(i));
		}
		System.out.print("\n");

		return 0;
	}
}

