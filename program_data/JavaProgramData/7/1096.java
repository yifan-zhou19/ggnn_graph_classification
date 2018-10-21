package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String an = new String(new char[270]);
		String bn = new String(new char[270]);
		String cn = new String(new char[270]);
		String temp = new String(new char[270]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			an = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			bn = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			cn = tempVar3.charAt(0);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: char *p=strstr(an,bn);
		char p = tangible.StringFunctions.strStr(an,bn);
		int len = bn.length();
		if (p != null)
		{
			temp = p + len;
			p = '\0';
			an += cn;
			an += temp;
		}
		System.out.printf("%s",an);
		return 0;
	}
}

