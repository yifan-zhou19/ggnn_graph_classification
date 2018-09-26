package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[270]);
	public static String b = new String(new char[270]);

	public static int MAX(int e1, int e2)
	{
		if (e1 > e2)
		{
			return e1;
		}
		return e2;
	}

	public static int Main()
	{
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);


		String c = new String(new char[270]);

		int len1 = a.length();
		int len2 = b.length();
		int len = MAX(len1, len2);

		int ic = 0;
		int ia;
		int ib;
		int j1 = len1 - 1;
		int j2 = len2 - 1;
		int j3 = len - 1;
		c = c.substring(0, len);

		while (j1 >= 0 && j2 >= 0)
		{
			ia = a.charAt(j1) - '0';
			ib = b.charAt(j2) - '0';
			ic += ia + ib;
			c = tangible.StringFunctions.changeCharacter(c, j3, ic % 10 + '0');
			ic /= 10;
			j1--;
			j2--;
			j3--;
		}
		if (j2 > 0)
		{
			while (j2 >= 0)
			{
					ib = b.charAt(j2) - '0';
					ic += ib;
					c = tangible.StringFunctions.changeCharacter(c, j3, ic % 10 + '0');
					ic /= 10;
					j2--;
					j3--;
			}
		}
		if (j1 > 0)
		{
			while (j1 >= 0 && ic > 0)
			{
					ia = a.charAt(j1) - '0';
					ic += ia;
					c = tangible.StringFunctions.changeCharacter(c, j3, ic % 10 + '0');
					ic /= 10;
					j1--;
					j3--;
			}
		}
		if (ic > 0)
		{
			System.out.print(ic);
			System.out.print(c);
		}
		else
		{
			int i;
			for (i = 0; i < c.length() - 1; i++)
			{
				if (c.charAt(i) == '0')
				{
					continue;
				}
				else
				{
					break;
				}
			}
			while (i < c.length())
			{
				System.out.print(c.charAt(i));
				i++;
			}
		}
		return 0;

	}


}

