package <missing>;

public class GlobalMembers
{
	//?????


	//????????????
	public static int getMaxCharIndex(tangible.RefObject<String> str)
	{
		int i = 0;
		int maxIndex = 0;
		char maxChar = str.argValue.charAt(0);

		for (i = 0; i < MAX_STR_LENGTH; i++)
		{
			if (str.argValue.charAt(i) == 0)
			{
				break;
			}

			if (maxChar < str.argValue.charAt(i))
			{
				maxChar = str.argValue.charAt(i);
				maxIndex = i;
			}
		}

		return maxIndex;
	}

	//????str?index???subStr
	public static void insertStr(tangible.RefObject<String> str, int index, tangible.RefObject<String> subStr)
	{
		int i;
		int strLength = str.argValue.length(); //???????

		for (i = strLength; i > index; i--)
		{
			str.argValue.charAt(i + MAX_SUBSTR_LENGTH - 1) = str.argValue.charAt(i);
		}

		for (i = 0; i < MAX_SUBSTR_LENGTH - 1; i++)
		{
			str.argValue.charAt(i + index + 1) = subStr.argValue.charAt(i);
		}
	}

	public static int Main()
	{
		String str = new String(new char[MAX_STR_LENGTH]);
		String subStr = new String(new char[MAX_SUBSTR_LENGTH]);
		int maxIndex;

		while (scanf("%s%s", str, subStr) != EOF)
		{
		tangible.RefObject<String> tempRef_str = new tangible.RefObject<String>(str);
			maxIndex = getMaxCharIndex(tempRef_str);
			str = tempRef_str.argValue;
		tangible.RefObject<String> tempRef_str2 = new tangible.RefObject<String>(str);
		tangible.RefObject<String> tempRef_subStr = new tangible.RefObject<String>(subStr);
			insertStr(tempRef_str2, maxIndex, tempRef_subStr);
			subStr = tempRef_subStr.argValue;
			str = tempRef_str2.argValue;

			System.out.printf("%s\n", str);
		}
		return 0;
	}

}

