package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int len;
		int temp;
		String str1 = new String(new char[MAXLEN]);
		String str2 = new String(new char[MAXLEN]);

		str1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = str1.length();

		temp = 0;
		for (i = 0;i < len;i++)
		{
			temp = (temp % 13) * 10 + str1.charAt(i) - '0';
			str2 = tangible.StringFunctions.changeCharacter(str2, i, '0' + temp / 13);
		}

		for (i = 0;i < len;i++)
		{
			if (str2.charAt(i) != '0')
			{
				break;
			}
		}
		if (i == len)
		{
			System.out.print("0");
			System.out.print("\n");
		}
		else
		{
			for (;i < len;i++)
			{
				System.out.print(str2.charAt(i));
			}
			System.out.print("\n");
		}
		System.out.print(temp % 13);
		System.out.print("\n");
		return 0;
	}
}

