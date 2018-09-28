package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[50]);
		String str1 = new String(new char[50]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			str1 = tempVar2.charAt(0);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: char *tmp = strstr(str1,str);
		char tmp = tangible.StringFunctions.strStr(str1,str);
		int i;
		int len = str1.length();
		for (i = 0;i < len;i++)
		{
			if (strcmp(str1.Substring(i),tmp) == 0)
			{
				System.out.printf("%d",i);
				break;
			}
		}
		return 0;
	}

}

