package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	double link;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		link = Double.parseDouble(tempVar);
	}
	String a = new String(new char[501]);
	String b = new String(new char[501]);
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		b = tempVar3.charAt(0);
	}
	int c;
	int d;
	c = a.length();
	d = b.length();
	int i;
	for (i = 0;i < c;i++)
	{
		if (a.charAt(i) != 'A' && a.charAt(i) != 'G' && a.charAt(i) != 'C' && a.charAt(i) != 'T')
		{
		System.out.print("error");
		return 0;
		}
	}
	for (i = 0;i < d;i++)
	{
		if (b.charAt(i) != 'A' && b.charAt(i) != 'G' && b.charAt(i) != 'C' && b.charAt(i) != 'T')
		{
		System.out.print("error");
		return 0;
		}
	}
	if (c != d)
	{
	System.out.print("error");
	return 0;
	}
	double same;
	same = 0;
	for (i = 0;i < c;i++)
	{
		if (a.charAt(i) == b.charAt(i))
		{
			same = same+1;
		}
	}
	double hl;
	hl = same / (c * 1.0000);
	if (hl <= link)
	{
	System.out.print("no");
	}
	else
	{
	System.out.print("yes");
	}
	return 0;
	}
}

