package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[300]);
		String s2 = new String(new char[300]);
		String s3 = new String(new char[300]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s2 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			s3 = tempVar3.charAt(0);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: char *p = strstr(s1, s2);
		char p = tangible.StringFunctions.strStr(s1, s2);
		if (p != null)
		{
			char temp = (p + s2.length());
			p = s3;
			*(p + s2.length()) = temp;
		}
		System.out.printf("%s\n", s1);
		return 0;
	}


}

