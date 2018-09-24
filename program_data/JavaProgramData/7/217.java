package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String string = new String(new char[256]);
		String substring = new String(new char[256]);
		String replacement = new String(new char[256]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * str;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * sub;
		int a;
		int n = 0;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			String = tempVar;
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			substring = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			replacement = tempVar3.charAt(0);
		}
		sub = substring;
		a = substring.length();

		for (str = String; * str != '\0';str++)
		{
			if (*sub == *str)
			{
				if (*(sub + 1) != '\0')
				{
					sub++;
				}
				else
				{
					str = str - a + 1;
					n = 1;
					break;
				}
			}
			else
			{
				sub = substring;
			}
		}

		if (n == 0)
		{
			System.out.printf("%s",String);
			return 0;
		}

		sub = replacement;
		for (b = 0;b < substring.length();b++)
		{
			*str = sub;
			sub++;
			str++;
		}
		System.out.printf("%s",String);
		return 0;
	}


}

