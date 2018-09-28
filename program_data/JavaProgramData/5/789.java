package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int x;
	int y;
	int w = 0;
	int i;
	int o = 0;
	double c;
	double k;
	String a = new String(new char[501]);
	String b = new String(new char[501]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		c = Double.parseDouble(tempVar);
	}
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
	x = a.length();
	y = b.length();
	if (x != y)
	{
	System.out.print("error");
	}
	else if (x == y)
	{
	for (i = 0;i < x;i++)
	{
	if ((a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'G' && a.charAt(i) != 'C') || (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'G' && b.charAt(i) != 'C'))
	{
	System.out.print("error");
	o++;
	break;
	}
	else
	{
	if (a.charAt(i) == b.charAt(i))
	{
	w++;
	}
	}
	}
	k = 1.0 * w / x;
	if (o == 0)
	{
	if (k > c)
	{
	System.out.print("yes");
	}
	else
	{
	System.out.print("no");
	}
	}
	}
	return 0;
	}


}

