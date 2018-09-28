package <missing>;

public class GlobalMembers
{
	//????
	public static int Main()
	{
		int a;
		int b;
		int j = 0;
		String str1 = new String(new char[33]);
		String str2 = new String(new char[33]);
		String str3 = new String(new char[33]);
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		str1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i = 0;
		int dec = 0;
		while (str1.charAt(i) != 0) //?????????
		{
			dec = dec * a;
			if (str1.charAt(i) <= '9' && str1.charAt(i) >= '0')
			{
				dec = dec + str1.charAt(i) - '0';
			}
			else if (str1.charAt(i) >= 'A' && str1.charAt(i) <= 'Z')
			{
				dec = dec + str1.charAt(i) - 'A' + 10;
			}
			else if (str1.charAt(i) >= 'a' && str1.charAt(i) <= 'z')
			{
			dec = dec + str1.charAt(i) - 'a' + 10;
			}
			i++;
		}
		if (dec == 0)
		{
			System.out.printf("%d", "\n");
			return 0;
		}
		while (dec != 0) //??????b???
		{
			str3 = tangible.StringFunctions.changeCharacter(str3, j, dec % b);
			if (str3.charAt(j) > 9 || str3.charAt(j) < 0)
			{
				str3 = tangible.StringFunctions.changeCharacter(str3, j, str3.charAt(j) + 'A' - 10);
			}
			else
			{
				str3.charAt(j) += '0';
			}
			dec = dec / b;
			j++;
		}
		for (j--;j >= 0;j--) //????
		{
			System.out.printf("%d", str3.charAt(j));
		}
		System.out.printf("%d", "\n");
		return 0;
	}

}

