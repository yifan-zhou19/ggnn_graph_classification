package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int number = 0;
		int day = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int nn = n * n;
		String a = new String(new char[nn]);
		String b = new String(new char[nn]);
		for (int iii = 0;iii < n;iii++)
		{
		for (int i = 0;i < n;i++)
		{
		a = tangible.StringFunctions.changeCharacter(a, n * iii + i, ConsoleInput.readToWhiteSpace(true));
		}
		}
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int m = 1;m < day;m++)
		{
			for (int i = 0;i < nn;i++)
			{
			b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(i));
			}
		for (int ii = 0;ii < nn;ii++)
		{
			if (a.charAt(ii) == '@')
			{
				if (a.charAt(ii + 1) != '#')
				{
					if ((ii + 1) % n != 0)
					{
					b = tangible.StringFunctions.changeCharacter(b, ii + 1, '@');
					}
				}
				if (a.charAt(ii - 1) != '#')
				{
								if ((ii) % n != 0)
								{
								b = tangible.StringFunctions.changeCharacter(b, ii - 1, '@');
								}
				}
				if (a.charAt(ii + n) != '#')
				{
								b = tangible.StringFunctions.changeCharacter(b, ii + n, '@');
				}
				if (a.charAt(ii - n) != '#')
				{
								b = tangible.StringFunctions.changeCharacter(b, ii - n, '@');
				}
			}
		}


		for (int w = 0;w < nn;w++)
		{
				a = tangible.StringFunctions.changeCharacter(a, w, b.charAt(w));
		}
		}
		for (int q = 0;q < nn;q++)
		{
				if (a.charAt(q) == '@')
				{
					number = number + 1;
				}
		}
			System.out.print(number);
		return 0;
	}

}

