package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[257]);
		String b = new String(new char[257]);
		String c = new String(new char[257]);
		String d = new String(new char[257]);
		String p;
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
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = tempVar3.charAt(0);
		}
		p = tangible.StringFunctions.strStr(a,b);
		if (p == null)
		{
			System.out.println(a);
		}
		else
		{
		p = '\0';
		d = a;
		d += c;
		d += p + b.length();
		System.out.println(d);
		}
	}
}

