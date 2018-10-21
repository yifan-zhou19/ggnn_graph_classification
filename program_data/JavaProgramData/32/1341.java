package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String a = new String(new char[108]);
		String b = new String(new char[108]);
		String c = new String(new char[108]);
		int i;
		int j;
		int k;
		int la;
		int lb;
		int bit;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (k = 0; k < n; k++)
		{
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			b = ConsoleInput.readToWhiteSpace(true).charAt(0);

			bit = 0;

			la = a.length();
			lb = b.length();

			for (i = la - 1; i >= la - lb; i--)
			{
				if (a.charAt(i) - b.charAt(i - la + lb) - bit >= 0)
				{
					c = tangible.StringFunctions.changeCharacter(c, i, a.charAt(i) - b.charAt(i - la + lb) - bit + '0');
					bit = 0;
				}
				else
				{
					c = tangible.StringFunctions.changeCharacter(c, i, a.charAt(i) - b.charAt(i - la + lb) - bit + 10 + '0');
					bit = 1;
				}
			}

			c = tangible.StringFunctions.changeCharacter(c, la - lb - 1, a.charAt(la - lb - 1) - bit);

			for (i = 0; i < la - lb - 1; i++)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, a.charAt(i));
			}

			c = tangible.StringFunctions.changeCharacter(c, la, '\0');

			System.out.print(c);
			System.out.print("\n");

		}


		return 0;
	}

}

