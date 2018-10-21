package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String n = new String(new char[33]);
		String m = new String(new char[33]);
		int c;
		int x;
		int y;
		int a;
		int b;
		int d;
		int e;
		int l;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		l = n.length();
		for (i = 0;i < l;i++)
		{
			if (n.charAt(i) >= 'a' && n.charAt(i) <= 'z')
			{
				n = tangible.StringFunctions.changeCharacter(n, i, n.charAt(i) + 10 - 'a');
			}
		if (n.charAt(i) >= 'A' && n.charAt(i) <= 'Z')
		{
			n = tangible.StringFunctions.changeCharacter(n, i, n.charAt(i) + 10 - 'A');
		}
		if (n.charAt(i) >= '0' && n.charAt(i) <= '9')
		{
			n = tangible.StringFunctions.changeCharacter(n, i, n.charAt(i) - '0');
		}
		}
		c = 0;
		for (i = 0;i <= l - 1;i++)
		{
			c = c * a + n.charAt(i);
		}
		d = 0;
		do
		{
			x = c / b;
			y = c % b;
			for (i = d - 1;i >= 0;i--)
			{
				m = tangible.StringFunctions.changeCharacter(m, i + 1, m.charAt(i));
			}
			m = tangible.StringFunctions.changeCharacter(m, 0, y);
			c = x;
			d++;
		} while (x != 0);
		m = tangible.StringFunctions.changeCharacter(m, d, '\0');
		for (i = 0;i < d;i++)
		{
			if (m.charAt(i) >= 0 && m.charAt(i) <= 9)
			{
				m = tangible.StringFunctions.changeCharacter(m, i, m.charAt(i) + '0');
			}
			else
			{
				m = tangible.StringFunctions.changeCharacter(m, i, m.charAt(i) + 'A' - 10);
			}
		}
		System.out.printf("%s\n",m);
	}
}

