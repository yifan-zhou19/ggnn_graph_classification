package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'str', so pointers on this parameter are left unchanged:
	public static char oneChar(char * str)
	{
		String deq = new String(new char[26]);
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int i = 0,j=0;
		int i = 0;
		int j = 0;
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned char letter[26];
		byte[] letter = new byte[26];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(letter,0,26);
		while (*str != '\0')
		{
			letter[*str - 'a']++;
			if (letter[*str - 'a'] == 1)
			{
				deq = tangible.StringFunctions.changeCharacter(deq, i++, *str);
			}
			str = str.Substring(1);
		}
		for (;j < i;j++)
		{
			if (letter[deq.charAt(j) - 'a'] == 1)
			{
				return deq.charAt(j);
			}
		}
		if (i == j)
		{
			return 0;
		}
	}
	public static int Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: const unsigned int num;
		int num;
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int i;
		int i;
		char ch;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		String[] str = new String[num];
		for (i = 0;i < num;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			str[i] = (String)malloc(MAX_LEN);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str[i] = tempVar2.charAt(0);
			}
			fflush(stdin);
			Character.toLowerCase(str[i]);
		}
		for (i = 0;i < num;i++)
		{
			ch = oneChar(str[i]);
			if (ch == 0)
			{
				System.out.printf("no\n",i + 1);
			}
			else
			{
				System.out.printf("%c\n",ch);
			}
		}
	 for (i = 0;i < num;i++)
	 {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(str[i]);
	 }
		return 0;
	}


}

