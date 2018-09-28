package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[51]);
		String w = new String(new char[51]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		System.out.printf("%d", tangible.StringFunctions.strStr(s, w) - s);


		return 0;
	}
}

