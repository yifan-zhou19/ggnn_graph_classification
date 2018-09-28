package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		String s = new String(new char[50]);
		String w = new String(new char[50]);
		String p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			w = tempVar2.charAt(0);
		}
		p = tangible.StringFunctions.strStr(w,s);
		i = p - w;
		System.out.printf("%d",i);
		return 0;
	}
}

