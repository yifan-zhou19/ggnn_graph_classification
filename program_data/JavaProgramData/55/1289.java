package <missing>;

public class GlobalMembers
{
	public static int i;
	public static int zh(String c, int i)
	{
		if ((c[i].compareTo(48) >= 0) && (c[i].compareTo(57) <= 0))
		{
			return c[i] - 48;
		}
		if ((c[i].compareTo(65) >= 0) && (c[i].compareTo(90) <= 0))
		{
			return c[i] - 55;
		}
		if ((c[i].compareTo(97) >= 0) && (c[i].compareTo(122) <= 0))
		{
			return c[i] - 87;
		}
	}
	public static char ch(int a)
	{
		if (a <= 9)
		{
			return a + 48;
		}
		if (a > 9)
		{
			return a + 55;
		}
	}
	public static int Main()
	{
		int a;
		int b;
		int i;
		int j;
		int k;
		int l;
		int s = 0;
		String c = new String(new char[99]);
		String d = new String(new char[99]);
		for (k = 0; k <= 99; k++)
		{
			c = tangible.StringFunctions.changeCharacter(c, k, ' ');
			d = tangible.StringFunctions.changeCharacter(d, k, ' ');
		}
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; c.charAt(i) != '\0'; i++)
		{
			s = a * s + zh(c, i);
		}
		for (j = 0; j <= 99; j++)
		{
			d = tangible.StringFunctions.changeCharacter(d, j, ch(s % b));
			s = s / b;
			if (s == 0)
			{
				break;
			}
		}
		for (l = 30; l >= 0; l--)
		{
			if (d.charAt(l) != ' ')
			{
			System.out.print(d.charAt(l));
			}
		}
		return 0;
	}
}

