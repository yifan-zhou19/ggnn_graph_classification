package <missing>;

public class GlobalMembers
{
	/*
	 *?????
	 *???2010 - 12 - 20
	 *?????????  ??2?N??
	 */
	public static void power(String str, int n)
	{
		int i;
		int j;
		if (g_count == n)
		{
			for (i = 0; i <= 34; i++)
			{
				if (!str[i].equals('0')) //???????????????????
				{
					for (j = i; j <= 34; j++)
					{
						System.out.print(str[j]);
					}
					return;
				}
			}
		}
		String line = new String(new char[35]);
		for (i = 0; i <= 34; i++)
		{
			line = tangible.StringFunctions.changeCharacter(line, i, '0');
		}
		for (i = 34; i >= 0; i--)
		{
			if ((str[i] - '0') * 2 > 9 != null)
			{
				line.charAt(i - 1)++;
				line.charAt(i) += (str[i] - '0') * 2 - 10;
			}
			if (((str[i] - '0') * 2 < 9) && (str[i].compareTo('9') < 0))
			{
				line.charAt(i) += (str[i] - '0') * 2;
			}
		}
		g_count++;
		power(line, n);
	}
	public static int g_count = 0; //??????????2?????N??????
	public static int Main()
	{
		String str = new String(new char[35]);
		int i;
		int n;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i <= 34; i++) //?????????2??????00000000��1
		{
			str = tangible.StringFunctions.changeCharacter(str, i, '0');
		}
		str = tangible.StringFunctions.changeCharacter(str, 34, '1');
		power(str, n);
		return 0;
	}
}

