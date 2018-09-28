package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String num = new String(new char[101]);
		String quot = new String(new char[101]);
		int r = 0;
		int index = 0;

		num = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (int i = 0; num.charAt(i) != '\0'; i++)
		{
			r = r * 10 + num.charAt(i) - '0';
			if (r < 13)
			{
				if (index != 0)
				{
					quot = tangible.StringFunctions.changeCharacter(quot, index++, '0');
				}
			}
			else
			{
				quot = tangible.StringFunctions.changeCharacter(quot, index++, r / 13 + '0');
				r = r % 13;
			}
		}
		if (index == 0)
		{
			System.out.print(0);
			System.out.print("\n");
		}
		else
		{
			quot = tangible.StringFunctions.changeCharacter(quot, index, '\0');
			System.out.print(quot);
			System.out.print("\n");
		}
		System.out.print(r);
		System.out.print("\n");
		return 0;
	}
}

