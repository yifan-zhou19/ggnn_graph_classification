package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String input_string1 = new String(new char[251]);
		String input_string2 = new String(new char[251]);
		String num1 = new String(new char[252]);
		String num2 = new String(new char[252]);
		String result = new String(new char[252]);
		result = tangible.StringFunctions.changeCharacter(result, 251, '\0');
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			input_string1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			input_string2 = tempVar2.charAt(0);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(num1,'0',252);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(num2,'0',252);
		num1 + (251 - input_string1.length()) = input_string1;
		num2 + (251 - input_string2.length()) = input_string2;
		int i;
		int carry = 0;
		for (i = 250;i >= 0;i--)
		{
			if ((num1.charAt(i) - '0') + (num2.charAt(i) - '0') + carry >= 10)
			{
				result = tangible.StringFunctions.changeCharacter(result, i, (num1.charAt(i) - '0') + (num2.charAt(i) - '0') + carry - 10 + '0');
				carry = 1;
			}
			else
			{
				result = tangible.StringFunctions.changeCharacter(result, i, (num1.charAt(i) - '0') + (num2.charAt(i) - '0') + carry + '0');
				carry = 0;
			}

		}
		for (i = 0;i <= 249;i++)
		{
			if (result.charAt(i) != '0')
			{
				break;
			}
		}
		System.out.printf("%s",result.Substring(i));

		return 0;

	}
}

