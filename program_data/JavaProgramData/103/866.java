package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[1005]);
		int num = 0;
		c = ConsoleInput.readToWhiteSpace(true).charAt(0);

		for (int i = 0 ; i < c.length() ; i++)
		{
			if (c.charAt(i) <= 'z' && c.charAt(i) >= 'a')
			{
				c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) - 'a'+'A');
			}
		}
		if (c.charAt(0) != c.charAt(1))
		{
			System.out.print("(");
			System.out.print(c.charAt(0));
			System.out.print(",1)");
		}
		else
		{
			num++;
		}
		for (int i = 1 ; i < c.length() ; i++)
		{
			num++;
			if (c.charAt(i) != c.charAt(i + 1))
			{
				System.out.print("(");
				System.out.print(c.charAt(i));
				System.out.print(",");
				System.out.print(num);
				System.out.print(")");
				num = 0;
			}
		}
	}
}

