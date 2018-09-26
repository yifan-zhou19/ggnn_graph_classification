package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		String l = new String(new char[100]);

		String p;
		String a;
		int i;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			l = tempVar2.charAt(0);
		}

		p = tangible.StringFunctions.strStr(l,s);
		a = l;
		for (i = 0;;i++)
		{
			if (a.Substring(i) == p)
			{
				System.out.printf("%d",i);
				break;
			}
		}
		return 0;
	}
}

