package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int number = 0;
		String num = new String(new char[100]);
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		num = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		if (num.charAt(0) == '0')
		{
			System.out.print(0);
			return 0;
		}
		for (int i = 0; num.charAt(i) != '\0'; i++)
		{
			if (num.charAt(i) >= 'A' && num.charAt(i) <= 'Z')
			{
				num = tangible.StringFunctions.changeCharacter(num, i, num.charAt(i) + 32);
			}
		}

		for (int i = 0; num.charAt(i) != '\0'; i++)
		{
			if (num.charAt(i) >= '0' && num.charAt(i) <= '9')
			{
				num = tangible.StringFunctions.changeCharacter(num, i, num.charAt(i) - 48);
			}
			else
			{
				num = tangible.StringFunctions.changeCharacter(num, i, num.charAt(i) - 97 + 10);
			}

			number = number * a + num.charAt(i);
		}

		String na = new String(new char[100]);
		int i;
		for (i = 0; number != 0; i++)
		{
			na = tangible.StringFunctions.changeCharacter(na, i, number % b);
			if (na.charAt(i) > 9)
			{
				na = tangible.StringFunctions.changeCharacter(na, i, na.charAt(i) + 55);
			}
			else
			{
				na = tangible.StringFunctions.changeCharacter(na, i, na.charAt(i) + 48);
			}
			number = number / b;
		}
		for (int j = i - 1; j >= 0; j--)
		{
			System.out.print(na.charAt(j));
		}


		return 0;
	}

}

