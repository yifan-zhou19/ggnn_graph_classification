package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int doit = int a;
	doit(1);
	}

	public static int doit(int r)
	{
	String a = new String(new char[20]);
	String b = new String(new char[20]);
	String c = new String(new char[20]);
	String d = new String(new char[20]);
	String e = new String(new char[20]);
	String f = new String(new char[20]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = tempVar.charAt(0);
	}
	if (a.charAt(0) != 'e')
	{
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
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			d = tempVar4.charAt(0);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			e = tempVar5.charAt(0);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			f = tempVar6.charAt(0);
		}
					doit(1);
	}
	else
	{
		return 0;
	}
	System.out.printf("%s %s %s %s %s %s\n",a,b,c,d,e,f);
	}

}

