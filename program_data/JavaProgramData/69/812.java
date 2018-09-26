package <missing>;

public class GlobalMembers
{
	public static void AddBigInt(tangible.RefObject<String> result, tangible.RefObject<String> str1, tangible.RefObject<String> str2)
	{
		int i;
		int j;
		int k;
		int a;
		int b;
		int c;
		int x = 0;
		char c1;
		char c2;
		for (i = 0;;i++)
		{
			if (*(str1.argValue.Substring(i)) == '\0')
			{
				a = i - 1;
				break;
			}
		}
		for (i = 0;;i++)
		{
			if (*(str2.argValue.Substring(i)) == '\0')
			{
				b = i - 1;
				break;
			}
		}
		if (a > b)
		{
			c = a + 1;
		}
		else
		{
			c = b + 1;
		}
		*(result.argValue.Substring(c) + 1) = '\0';
		for (i = 0;c >= i;i++)
		{
			if (a < i)
			{
				c1 = '0';
			}
			else
			{
				c1 = (str1.argValue.Substring(a) - i);
			}

			if (b < i)
			{
				c2 = '0';
			}
			else
			{
				c2 = (str2.argValue.Substring(b) - i);
			}
				*(result.argValue.Substring(c) - i) = (c1 - '0' + c2 - '0' + x) % 10 + '0';
			x = (c1 - '0' + c2 - '0' + x) / 10;
		}
		if (result.argValue == '0')
		{
			for (i = 0; * (result.argValue.Substring(i));i++)
			{
				*(result.argValue.Substring(i)) = *(result.argValue.Substring(i) + 1);
			}
		}
	}
	public static int Main()
	{
		int i;
		String str1 = new String(new char[251]);
		String str2 = new String(new char[251]);
		String result = new String(new char[251]);
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
	tangible.RefObject<String> tempRef_result = new tangible.RefObject<String>(result);
	tangible.RefObject<String> tempRef_str1 = new tangible.RefObject<String>(str1);
	tangible.RefObject<String> tempRef_str2 = new tangible.RefObject<String>(str2);
		AddBigInt(tempRef_result, tempRef_str1, tempRef_str2);
		str2 = tempRef_str2.argValue;
		str1 = tempRef_str1.argValue;
		result = tempRef_result.argValue;
		int index = 0;
		for (i = 0; i < result.length();i++)
		{
			if ('0' != result.charAt(i))
			{
				index = i;
				break;
			}
		}

		String k = new String(new char[250]);
		k = result.Substring(index);
		System.out.printf("%s\n",k);
		return 0;
	}
}

