package <missing>;

public class GlobalMembers
{
	//**********************************************************
	//????????
	//??????
	//???2010?12?20?
	//**********************************************************
	public static String temp = new String(new char[10]);
	public static void strsub(tangible.RefObject<String> a, int start)
	{
		int i;
		int len = a.argValue.length();
		for (i = start;i < len;i++)
		{
			temp = tangible.StringFunctions.changeCharacter(temp, i - start, a.argValue.charAt(i));
			a.argValue.charAt(i) = '\0';
		}
		temp = tangible.StringFunctions.changeCharacter(temp, len - start, '\0');

	}

	public static int Main()
	{
		String str1 = new String(new char[10]);
		String str2 = new String(new char[10]);
		char max;
		int flag;
		int i;
		int len;
		while ((str1 = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0 && (str2 = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			len = str1.length();
			max = 0;
			for (i = 0;i < len;i++)
			{
				if (max < str1.charAt(i))
				{
					max = str1.charAt(i);
					flag = i;
				}
			}
		tangible.RefObject<String> tempRef_str1 = new tangible.RefObject<String>(str1);
			strsub(tempRef_str1, flag + 1);
			str1 = tempRef_str1.argValue;
			str1 += str2;
			str1 += temp;
			System.out.print(str1);
			System.out.print("\n");
		}
		return 0;
	}

}

