package <missing>;

public class GlobalMembers
{
	public static final String c1 = ""; //??????
	public static final String c2 = ""; //??????
	public static final String c3 = ""; //??
	public static int Main()
	{
		void cal(int);
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c1 = tangible.StringFunctions.changeCharacter(c1, 0, '1'); //???????1
		cal(n);
		final String c = "";
		for (i = 0;i < c1.length();i++)
		{
			c = tangible.StringFunctions.changeCharacter(c, i, c1.charAt(c1.length() - i - 1)); //?????
		}
		System.out.print(c);
		return 0;
	}
	public static void cal(int n)
	{
		int i;
		if (n != 0)
		{
			for (i = 0;c1.charAt(i) != '\0';i++)
			{
				if ((c1.charAt(i) - '0') * 2 >= 10)
				{
					c2 = tangible.StringFunctions.changeCharacter(c2, i, (c1.charAt(i) - '0') * 2 - 10 + '0');
					c3 = tangible.StringFunctions.changeCharacter(c3, i + 1, '1'); //???1
				}
				else
				{
					c2 = tangible.StringFunctions.changeCharacter(c2, i, (c1.charAt(i) - '0') * 2 + '0');
					c3 = tangible.StringFunctions.changeCharacter(c3, i + 1, '0');
				}
			}
			for (i = 1;c3.charAt(i) != '\0';i++)
			{
				if (c2.charAt(i) != '\0')
				{
					c2 = tangible.StringFunctions.changeCharacter(c2, i, c2.charAt(i) + c3.charAt(i) - '0');
				}
				else if (c3.charAt(i) == '1')
				{
					c2 = tangible.StringFunctions.changeCharacter(c2, i, c3.charAt(i)); //???????????????
				}
			}
			c1 = c2;
			cal(n - 1);
		}
	}
}

