package <missing>;

public class GlobalMembers
{
	public static int reverse(int c)
	{
		int i;
		int j;
		int b;
		String a = new String(new char[100]);
		if (c >= 0)
		{
			for (i = 0;10 * c / 10 > 0;i++)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, c % 10);
				c = c / 10;
			}
			c = 0;
			for (j = i - 1;j >= 0;j--)
			{

				c = c + a.charAt(j) * Math.pow((double)10,(i - j - 1));
			}
		}

		if (c < 0)
		{
			b = 0 - c;
			for (i = 0;10 * b / 10 > 0;i++)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, b % 10);
				b = b / 10;
			}
			b = 0;
			for (j = i - 1;j >= 0;j--)
			{

				b = b + a.charAt(j) * Math.pow((double)10,(i - j - 1));

			}
			c = 0 - b;
		}

		return c;
	}







	public static int Main()
	{
		int a;
		int i;
		for (i = 1;i <= 6;i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(reverse(a));
			System.out.print("\n");
		}
		return 0;
	}


}

