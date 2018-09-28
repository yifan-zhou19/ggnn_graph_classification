package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String number = new String(new char[100]);
		String result = new String(new char[100]);
		int a = 0;
		int b = 0;
		int lenght = 0;
		int flag = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			number = tempVar.charAt(0);
		}
		lenght = number.length();
		b = number.charAt(0) - '0';
		for (int i = 0;i < lenght - 1;i++)
		{
			a = b * 10 + (number.charAt(i + 1) - '0');
			result = tangible.StringFunctions.changeCharacter(result, i, a / 13 + '0');
			b = a % 13;
		}
		if (lenght == 1)
		{
			result = tangible.StringFunctions.changeCharacter(result, 0, '0');
			result = tangible.StringFunctions.changeCharacter(result, 1, '\0');
		}
		else
		{
			result = tangible.StringFunctions.changeCharacter(result, lenght - 1, '\0');
			for (int i = 0;result.charAt(i) != '\0';i++)
			{
				if (result.charAt(i) != '0' && result.charAt(i) != '\0')
				{
					flag = i;
					break;
				}
			}
		}
		System.out.printf("%s\n%d\n",result.Substring(flag),b);
		return 0;
	}
}

