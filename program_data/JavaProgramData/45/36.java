package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int c = 0;
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		c = tangible.StringFunctions.strStr(b,a) - b;
		System.out.printf("%d\n",c);
		return 0;

	}

}

