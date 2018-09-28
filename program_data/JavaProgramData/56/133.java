package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String num = new String(new char[11]);
		char i;

		for (i = 1 ; num.charAt(i - 1) != '\n'; i++)
		{
		String tempVar = ConsoleInput.scanfRead(null, 1);
		if (tempVar != null)
		{
			num = tangible.StringFunctions.changeCharacter(num, i, tempVar);
		}
		}
		for (i = 6 ; i <= 10 ; i++)
		{
		num = tangible.StringFunctions.changeCharacter(num, i, num.charAt(11 - i));
		}
		for (i = 6 ; i <= 10 ; i++)
		{
		System.out.printf("%c", num.charAt(i));
		}


		return (0);

	}


}

