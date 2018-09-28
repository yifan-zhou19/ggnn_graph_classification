package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int m;
	int n;
	int p = 0;
	int c = 0;
	int d = 0;
	double k;
	double t;
	String a = new String(new char[501]);
	String b = new String(new char[501]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		k = Double.parseDouble(tempVar);
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
	n = b.length();
	if (m == n)
	{
	for (i = 0;i < n;i++)
	{
	if (a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'C' && a.charAt(i) != 'G')
	{
	c++;
	}
	if (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'C' && b.charAt(i) != 'G')
	{
	d++;
	}
	if (a.charAt(i) == b.charAt(i))
	{
	p++;
	}
	}
	t = 1.0 * p / n;
	if (c == 0 && d == 0)
	{
	if (t > k)
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
	}
	else
	{
	System.out.print("error");
	}
	return 0;
	}





}

