package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[251]);
		String b = new String(new char[251]);
		String c = new String(new char[252]);
		int m;
		int n;
		int i;
		int t = 0;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		m = a.length();
		n = b.length();
		if (m < n)
		{
			c = a;
			a = b;
			b = c;
			i = m;
			m = n;
			n = i;
		}
		for (i = 0;i < n;i++)
		{
			c = tangible.StringFunctions.changeCharacter(c, i, (a.charAt(m - 1 - i) + b.charAt(n - 1 - i) - '0' * 2 + t) % 10 + '0');
			t = (a.charAt(m - 1 - i) + b.charAt(n - 1 - i) - '0' * 2 + t) / 10;
		}
		for (i = n;i < m;i++)
		{
			c = tangible.StringFunctions.changeCharacter(c, i, (a.charAt(m - 1 - i) - '0' + t) % 10 + '0');
			t = (a.charAt(m - 1 - i) - '0' + t) / 10;
		}
		if (t != 0)
		{
			c = tangible.StringFunctions.changeCharacter(c, i, 1 + '0');
			i++;
		}
		c = tangible.StringFunctions.changeCharacter(c, i, '\0');
		m = c.length();
		t = n = 0;
		while (m-- != 0)
		{
			t += *(c.Substring(m)) - '0';
			if (t != 0)
			{
				System.out.printf("%c",*(c.Substring(m)));
			n++;
			}
		}
		if (n == 0)
		{
			System.out.print("0");
		}
	}
}

