package <missing>;

public class GlobalMembers
{
	public static String mystrrchr(tangible.RefObject<String> strcopy, tangible.RefObject<String> end)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * tmp = end.argValue-1;
		while (tmp >= strcopy.argValue)
		{
			if (*tmp == '(')
			{
				return tmp;
			}
			tmp--;
		}
		return null;
	}

	public static void judge(tangible.RefObject<String> str, tangible.RefObject<String> flag)
	{
		String strcopy = new String(new char[101]);
		strcopy = str.argValue;
		int len = strcopy.length();
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: char * index1=strchr(strcopy,')');
		char index1 = tangible.StringFunctions.strChr(strcopy,')');
		while (index1 != null && (index1 - strcopy) < len)
		{
		tangible.RefObject<String> tempRef_strcopy = new tangible.RefObject<String>(strcopy);
		tangible.RefObject<String> tempRef_index1 = new tangible.RefObject<String>(index1);
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: char * index2=mystrrchr(strcopy,index1);
			char index2 = mystrrchr(tempRef_strcopy, tempRef_index1);
			index1 = tempRef_index1.argValue;
			strcopy = tempRef_strcopy.argValue;
			if (index2 != null)
			{
				strcopy = tangible.StringFunctions.changeCharacter(strcopy, index1 - strcopy, '-');
				strcopy = tangible.StringFunctions.changeCharacter(strcopy, index2 - strcopy, '-');
			}
			index1 = tangible.StringFunctions.strChr(index1 + 1,')');
		}
		int i = 0;
		for (i = 0;i < len;i++)
		{
			if (strcopy.charAt(i) == '(')
			{
				flag.argValue.charAt(i) = '$';
			}
			if (strcopy.charAt(i) == ')')
			{
				flag.argValue.charAt(i) = '?';
			}
		}
		System.out.printf("%s\n%s\n",str.argValue,flag.argValue);
	}

	public static int Main()
	{
		int n = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		String str = new String(new char[101]);
		String flag = new String(new char[101]);
		while (n > 0)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(flag,' ',(Character.SIZE / Byte.SIZE));
			str = new Scanner(System.in).nextLine();
			flag = tangible.StringFunctions.changeCharacter(flag, str.length(), '\0');
		tangible.RefObject<String> tempRef_str = new tangible.RefObject<String>(str);
		tangible.RefObject<String> tempRef_flag = new tangible.RefObject<String>(flag);
			judge(tempRef_str, tempRef_flag);
			flag = tempRef_flag.argValue;
			str = tempRef_str.argValue;
			n--;
		}
		return 0;
	}

}

