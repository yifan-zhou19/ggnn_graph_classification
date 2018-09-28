package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[5]);
		String b = new String(new char[5]);
		String c = new String(new char[5]);
		String d = new String(new char[5]);
		char e;
		int i = 0;
		int l;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		c = new Scanner(System.in).nextLine();
		d = new Scanner(System.in).nextLine();
		while (a.charAt(i) != '\0')
		{
			i = i + 1;
		}
		for (l = 0;l < i / 2;l++)
		{
			e = a.charAt(l);
			a = tangible.StringFunctions.changeCharacter(a, l, a.charAt(i - 1 - l));
			a = tangible.StringFunctions.changeCharacter(a, i - 1 - l, e);
		}
		i = 0;
		while (b.charAt(i) != '\0')
		{
			i = i + 1;
		}
		for (l = 0;l < i / 2;l++)
		{
			e = b.charAt(l);
			b = tangible.StringFunctions.changeCharacter(b, l, b.charAt(i - 1 - l));
			b = tangible.StringFunctions.changeCharacter(b, i - 1 - l, e);
		}
		i = 0;
		while (c.charAt(i) != '\0')
		{
			i = i + 1;
		}
		for (l = 0;l < i / 2;l++)
		{
			e = c.charAt(l);
			c = tangible.StringFunctions.changeCharacter(c, l, c.charAt(i - 1 - l));
			c = tangible.StringFunctions.changeCharacter(c, i - 1 - l, e);
		}
		i = 0;
		while (d.charAt(i) != '\0')
		{
			i = i + 1;
		}
		for (l = 0;l < i / 2;l++)
		{
			e = d.charAt(l);
			d = tangible.StringFunctions.changeCharacter(d, l, d.charAt(i - 1 - l));
			d = tangible.StringFunctions.changeCharacter(d, i - 1 - l, e);
		}
		i = 0;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		return 0;
	}
}

