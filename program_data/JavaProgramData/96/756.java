package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String dividend = new String(new char[100]);
		String quotient = new String(new char[100]);
		int remainder;
		int i;
		dividend = ConsoleInput.readToWhiteSpace(true).charAt(0);
		remainder = dividend.charAt(0) - '0';
		quotient = tangible.StringFunctions.changeCharacter(quotient, 0, '0');
		quotient = tangible.StringFunctions.changeCharacter(quotient, 1, '\0');
		for (i = 1; dividend.charAt(i) != '\0'; i++)
		{
			quotient = tangible.StringFunctions.changeCharacter(quotient, i - 1, (remainder * 10 + (int)(dividend.charAt(i) - '0')) / 13 + '0');
			remainder = (remainder * 10 + (int)(dividend.charAt(i) - '0')) % 13;
		}
		if (quotient.charAt(1) != '\0')
		{
			quotient = tangible.StringFunctions.changeCharacter(quotient, i - 1, '\0');
		}
		if (quotient.charAt(0) == '0' && quotient.charAt(1) != '\0')
		{
			System.out.print(quotient.Substring(1));
			System.out.print("\n");
		}
		else
		{
			System.out.print(quotient);
			System.out.print("\n");
		}
		System.out.print(remainder);
		return 0;
	}
}

