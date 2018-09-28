package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[250]);
		String b = new String(new char[250]);
		String c = new String(new char[250]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int x = a.length();
		int y = b.length();
		char counter = '0';
		int i = 0;
		int max;
		if (x > y)
		{
			max = x;
		}
		else
		{
			max = y;
		}
		for (i = 0;i <= max;i++)
		{
			c = tangible.StringFunctions.changeCharacter(c, i, ((a.charAt(x - 1) - '0' + b.charAt(y - 1) - '0' + counter - '0') % 10 + '0'));
			counter = ((a.charAt(x - 1) - '0' + b.charAt(y - 1) - '0' + counter - '0') / 10 + '0');
			if ((x - 1) != 0)
			{
				x--;
			}
			else if ((x - 1) == 0)
			{
				a = tangible.StringFunctions.changeCharacter(a, x - 1, '0');
			}
			if ((y - 1) != 0)
			{
				y--;
			}
			else if ((y - 1) == 0)
			{
				b = tangible.StringFunctions.changeCharacter(b, y - 1, '0');
			}
		}
		int count = 0;
		for (int j = i - 1;j >= 0;j--)
		{
			if (c.charAt(j) == '0' && count == 0)
			{
				continue;
			}
			else if (c.charAt(j) != '0')
			{
				System.out.print(c.charAt(j));
				count++;
			}
			else if (c.charAt(j) == '0' && count != 0)
			{
				System.out.print(c.charAt(j));
			}
		}
		if (i == 2 && c.charAt(0) == '0')
		{
			System.out.print('0');
		}
		System.out.print("\n");
		return 0;
	}
}

