package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	double n;
	double w;
	int i;
	int m;
	int z = 0;
	int e = 0;
	String a = new String(new char[600]);
	String b = new String(new char[600]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Double.parseDouble(tempVar);
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
	m = a.length();
	for (i = 0;i < m;i++)
	{
	if (a.charAt(i) == b.charAt(i))
	{
		z++;
	}
	if ((a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'C' && a.charAt(i) != 'G') || (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'C' && b.charAt(i) != 'G'))
	{
	System.out.print("error");
	e = 1;
	break;
	}
	}
	w = 1.0 * z / m;
	if (e == 0)
	{
	if (w >= n)
	{
		System.out.print("yes");
	}
	else
	{
		System.out.print("no");
	}
	}
		return 0;
	}
}

