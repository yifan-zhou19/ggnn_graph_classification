package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		int max;
		String a = new String(new char[250]);
		String b = new String(new char[250]);
		String c = new String(new char[1000]);
		String d = new String(new char[250]);
		String e = new String(new char[250]);
		for (i = 0;i <= 249;i++)
		{
			c = c.substring(0, i);
		}
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		m = a.length();
		n = b.length();
		for (i = m - 1,j = 0;i >= 0;j++,i--)
		{
			d = tangible.StringFunctions.changeCharacter(d, j, a.charAt(i));
		}
		for (;j <= 249;j++)
		{
			d = tangible.StringFunctions.changeCharacter(d, j, '0');
		}
		for (i = n - 1,j = 0;i >= 0;j++,i--)
		{
			e = tangible.StringFunctions.changeCharacter(e, j, b.charAt(i));
		}
		for (;j <= 249;j++)
		{
			e = tangible.StringFunctions.changeCharacter(e, j, '0');
		}
		max = (m > n)? m:n;
		for (i = 0;d.charAt(i) > '0' || e.charAt(i) > '0' || i <= max;i++)
		{
			c = tangible.StringFunctions.changeCharacter(c, i, d.charAt(i) + e.charAt(i) - '0');
			if (c.charAt(i) > '9')
			{
				c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) - 10);
				d = tangible.StringFunctions.changeCharacter(d, i + 1, d.charAt(i + 1) + 1);

			}
		}
		for (i = 249;i >= 0;i--)
		{
			if (c.charAt(i) > '0')
			{
			break;
			}
		}

		if (i < 0)
		{
			System.out.print("0\n");
		}
		else
		{
			for (;i >= 0;i--)
			{
				System.out.printf("%c",c.charAt(i));
			}
		}
		return 0;
	}
}

