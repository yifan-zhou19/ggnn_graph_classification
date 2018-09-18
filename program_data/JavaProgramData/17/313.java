package <missing>;

public class GlobalMembers
{
	public static final String num2 = "";

	public static int left(String num, int point, int sum, int l)
	{ // check if it is a wrong '('
		if (point == l)
		{ // finish the function
			if (num[point].equals('('))
			{
				num2 = tangible.StringFunctions.changeCharacter(num2, point, '$');
				return 0;
			}
			if (num[point].equals(')'))
			{
				sum = 1;
				return sum;
			}
			if (!num[point].equals('(') && !num[point].equals(')'))
			{
				return 0;
			}
		}
		else
		{
			int k = left(num, point + 1, sum, l);
			if (num[point].equals('(') && k == 0)
			{
				num2 = tangible.StringFunctions.changeCharacter(num2, point, '$');
				return 0;
			}
			if (num[point].equals('(') && k != 0)
			{
				sum = k - 1;
				return sum;
			}
			if (num[point].equals(')'))
			{
				sum = k + 1;
				return sum;
			}
			if (!num[point].equals('(') && !num[point].equals(')'))
			{
				return k;
			}
		}
	}

	public static int right(String num, int point, int sum, int l)
	{ // check if it is a wrong '('
		if (point == l)
		{ // finish the function
			if (num[point].equals(')'))
			{
				num2 = tangible.StringFunctions.changeCharacter(num2, point, '?');
				return 0;
			}
			if (num[point].equals('('))
			{
				sum = 1;
				return sum;
			}
			if (!num[point].equals('(') && !num[point].equals(')'))
			{
				return 0;
			}
		}
		else
		{
			int k = right(num, point - 1, sum, l);
			if (num[point].equals(')') && k == 0)
			{
				num2 = tangible.StringFunctions.changeCharacter(num2, point, '?');
				return 0;
			}
			if (num[point].equals(')') && k != 0)
			{
				sum = k - 1;
				return sum;
			}
			if (num[point].equals('('))
			{
				sum = k + 1;
				return sum;
			}
			if (!num[point].equals('(') && !num[point].equals(')'))
			{
				return k;
			}
		}
	}


	public static int Main()
	{
		final String num = "";
		while ((num = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
		int l = num.length(); // store the total length of the num
		System.out.print(num);
		System.out.print("\n");
		for (int i = 0; i < l; i++) // build a new num to show the wrong '(' and ')'
		{
			num2 = tangible.StringFunctions.changeCharacter(num2, i, ' ');
		}
		num2 = tangible.StringFunctions.changeCharacter(num2, l, '\0');
		left(num, 0, 0, l - 1);
		right(num, l - 1, 0, 0);
		System.out.print(num2);
		System.out.print("\n");
		}

		return 0;
	}
}

