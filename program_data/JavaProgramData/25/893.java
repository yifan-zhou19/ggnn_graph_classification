package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1001]);
		a = tangible.StringFunctions.changeCharacter(a, 0, '2');
		int b;
		int i;
		int j;
		int k = 0;
		int k1 = 0;
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (b == 0)
		{
			System.out.print("1");
			System.out.print("\n");
		}
		else
		{
			for (i = 1; i < 1001; i++)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, '0');
			}
			for (i = 1; i < b; i++)
			{
				for (j = 0; j < 1001; j++)
				{
					k = (a.charAt(j) - '0') * 2 / 10;
					a = tangible.StringFunctions.changeCharacter(a, j, (a.charAt(j) - '0') * 2 % 10 + k1 + '0');
					k1 = k;
				}
			}
			k = 0;
			for (i = 1000; i >= 0; i--)
			{
				if (a.charAt(i) != '0')
				{
					k = 1;
				}
				if (k == 1)
				{
					System.out.print(a.charAt(i));
				}
			}
			System.out.print("\n");

		}
		return 0;
	}
}

