package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		String src = new String(new char[256]);
		String dst = new String(new char[256]);
		String replacement = new String(new char[256]);
		//freopen("3.in","r",stdin);
		//freopen("3.out","w",stdout);

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			src = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			dst = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			replacement = tempVar3.charAt(0);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: char* p=strstr(src,dst);
		char p = tangible.StringFunctions.strStr(src,dst);
		if (p == null)
		{
			System.out.printf("%s\n",src);
		}
		else
		{
			int len = replacement.length();
			int i;
			for (i = 0;i < len;i++)
			{
				p = replacement.charAt(i);
				p++;
			} //end for
			System.out.printf("%s\n",src);
		} //end if


		return 0;
	}
}

