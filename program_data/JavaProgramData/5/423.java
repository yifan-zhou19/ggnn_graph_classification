package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	double r;
	double t;
	int i;
	int k;
	int u;
	int z;
	z = 0;
	u = 0;
	String a = new String(new char[500]);
	String b = new String(new char[500]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		r = Double.parseDouble(tempVar);
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
	for (i = 0;a.charAt(i) != '\0';i++)
	{
	if (a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'G' && a.charAt(i) != 'C')
	{
	System.out.print("error");
	z = 1;
	break;
	}
	if (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'G' && b.charAt(i) != 'C')
	{
	System.out.print("error");
	z = 1;
	break;
	}
	if (b.charAt(i) == '\0')
	{
	System.out.print("error");
	z = 1;
	break;
	}
	}
	if (b.charAt(i) != '\0' && z == 0)
	{
	System.out.print("error");
	}
	else if (z == 0)
	{
	for (k = 0;k < i;k++)
	{
	if (a.charAt(k) == b.charAt(k))
	{
	u = u + 1;
	}
	}
	t = 1.0 * u / i;
	if (t > r)
	{
	System.out.print("yes");
	}
	if (t <= r)
	{
	System.out.print("no");
	}
	}
	return 0;
	}
}

