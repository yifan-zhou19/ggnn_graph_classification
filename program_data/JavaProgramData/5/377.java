package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	double m;
	double n;
	double r;
	int a;
	int b;
	int c;
	int i;
	int j;
	String d1 = new String(new char[600]);
	String d2 = new String(new char[600]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Double.parseDouble(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		d1 = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		d2 = tempVar3.charAt(0);
	}
	a = d1.length();
	b = d2.length();
	c = 0;
	if (a == b)
	{
	for (i = 0;i < a;i++)
	{
		if (((d1.charAt(i) != 'A') && (d1.charAt(i) != 'T') && (d1.charAt(i) != 'C') && (d1.charAt(i) != 'G')) || ((d2.charAt(i) != 'A') && (d2.charAt(i) != 'T') && (d2.charAt(i) != 'C') && (d2.charAt(i) != 'G')))
		{
		System.out.print("error");
		return 0;
		}
		else
		{
		if (d1.charAt(i) == d2.charAt(i))
		{
			c++;
		}
		}
	r = 1.0 * c / a;
	}
	if (r > m)
	{
	System.out.print("yes");
	}
	else
	{
		System.out.print("no");
	}
	}
	else
	{
		System.out.print("error");
	}
	return 0;
	}



}

