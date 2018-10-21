package <missing>;

public class GlobalMembers
{
	/*
	 * ????practice2.cpp
	 * ??????
	 * ?????2012-12-24
	 * ??????????
	 */



	public static int chartonum(char c1)
	{
		if (c1 > 64 && c1 < 91)
		{
			return (int) c1 - 65;
		}
		if (c1 > 96 && c1 < 123)
		{
			return (int) c1 - 97;
		}
		return 0;
	}

	public static int Main()
	{
		String c = new String(new char[1000]);
		int z;
		int num;
		int i;
		c = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (i = 0; i < c.length(); ++i)
		{
			z = chartonum(c.charAt(i));
			num = 1;
			while (i != c.length() && chartonum(c.charAt(i)) == chartonum(c.charAt(i + 1)))
			{
				++i;
				++num;
			}
			if (i == c.length())
			{
				num--;
			}
			System.out.print('(');
			System.out.print((char)(z + 65));
			System.out.print(',');
			System.out.print(num);
			System.out.print(')');
		}
		return 0;
	}
}

