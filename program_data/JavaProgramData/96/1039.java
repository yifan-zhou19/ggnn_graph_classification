package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int l;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String c = new String(new char[100]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		l = a.length();


		for (i = 0;i < l;i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(i) - '0');
			c = c.substring(0, i);
		}
		if (l == 1)
		{
			System.out.print(0);
			System.out.print("\n");
			System.out.print(b.charAt(0) + 48 - 48);
			return 0;
		}
		c = c.substring(0, l);
		for (i = 0;i < l;i++)
		{
			c = tangible.StringFunctions.changeCharacter(c, i, Math.abs(10 * c.charAt(i) + b.charAt(i)));
			c = tangible.StringFunctions.changeCharacter(c, i + 1, Math.abs(c.charAt(i) % 13));
			c = tangible.StringFunctions.changeCharacter(c, i, Math.abs(c.charAt(i) / 13));

		}
		if (c.charAt(1) != 0)
		{
			c = tangible.StringFunctions.changeCharacter(c, 1, c.charAt(1) + '0');
			System.out.print(c.charAt(1));
		}
		if (b.charAt(0) == 1 && b.charAt(1) < 3 && l < 3)
		{
			System.out.print(0);
		}
		for (i = 2;i < l;i++)
		{
			c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) + '0');
			System.out.print(c.charAt(i));
		}
		System.out.print("\n");
		System.out.print(c.charAt(l) + 48 - 48);
		return 0;
	}
}

