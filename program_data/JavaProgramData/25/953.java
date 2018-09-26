package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int length = 1;
		int i;
		String result = new String(new char[51]);
		for (i = 1; i < 51; i++)
		{
			result = tangible.StringFunctions.changeCharacter(result, i, '0');
		}
		result = tangible.StringFunctions.changeCharacter(result, 0, '1');
		for ((x; x > 0; x-- = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			for (i = 0; i < length; i++)
			{
				result = tangible.StringFunctions.changeCharacter(result, i, result.charAt(i) * 2 - '0');
			}
			for (i = 0; i < length - 1; i++)
			{
				if (result.charAt(i) > '9')
				{
					result.charAt(i) -= 10;
					result.charAt(i + 1)++;
				}
			}
			if (result.charAt(i) > '9')
			{
				result.charAt(i) -= 10;
				result.charAt(i + 1)++;
				length++;
			}
		}
		for (length--; length >= 0; length--)
		{
			System.out.print(result.charAt(length));
		}
		return 0;
	}
}

