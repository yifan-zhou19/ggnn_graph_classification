package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int n = 0;
		int c;
		int i;
		String d = new String(new char[100]);
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();

		while ((c = System.in.read()) != ' ')
		{
			if (48 <= c != 0 && c <= 57)
			{
				c = c - 48;
			}
			if (65 <= c != 0 && c <= 90)
			{
				c = c - 55;
			}
			if (97 <= c != 0 && c <= 122)
			{
				c = c - 87;
			}
			n = n * a + c;
		}

		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 0)
		{
			System.out.print('0');
			System.out.print("\n");
		}

		for (i = 1; n != 0; i++)
		{
			d = tangible.StringFunctions.changeCharacter(d, i, n % b);
			n = n / b;
		}

		for (i = i - 1; i >= 1; i--)
		{
			if (0 <= d.charAt(i) && d.charAt(i) <= 9)
			{
				d = tangible.StringFunctions.changeCharacter(d, i, d.charAt(i) + 48);
			}
			else
			{
				d = tangible.StringFunctions.changeCharacter(d, i, d.charAt(i) + 55);
			}
			System.out.print(d.charAt(i));
		}
		System.out.print("\n");

		return 0;
	}

}

