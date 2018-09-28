package <missing>;

public class GlobalMembers
{
	public static int p1;
	public static int p2;
	public static int p3;
	public static int i;
	public static String a = new String(new char[1000]);
	public static String b = new String(new char[1000]);
	public static String c = new String(new char[1000]);
	public static int max(int a,int b)
	{
		if (a > b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}
	public static int za(int m)
	{
		if (m < 0)
		{
			return 0;
		}
		else
		{
			return a.charAt(m) - '0';
		}
	}
	public static int zb(int m)
	{
		if (m < 0)
		{
			return 0;
		}
		else
		{
			return b.charAt(m) - '0';
		}
	}
	public static int Main()
	{
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		p1 = 0;
		while (a.charAt(p1) != '\0')
		{
			p1++;
		}
		p1--;
		p2 = 0;
		while (b.charAt(p2) != '\0')
		{
			p2++;
		}
		p2--;
		c = null;
		for (i = 0;i <= max(p1, p2) + 1;i++)
		{
			c = tangible.StringFunctions.changeCharacter(c, i, za(p1 - i) + zb(p2 - i));
		}
		for (i = 0;i <= max(p1, p2) + 1;i++)
		{
			c.charAt(i + 1) += c.charAt(i) / 10;
			c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) % 10);
		}
		p3 = 900;
		while ((c.charAt(p3) == 0) && (p3 >= 0))
		{
			p3--;
		}
		for (i = p3;i >= 0;i--)
		{
			System.out.print((int)c.charAt(i));
		}
		if (p3 <= 0)
		{
			System.out.print(0);
		}
		System.out.print("\n");
		return 0;
	}
}

