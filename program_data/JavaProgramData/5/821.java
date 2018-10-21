package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	double q;
	double c;
	int t;
	int s;
	int i;
	int l1;
	int l2;
	String a = new String(new char[501]);
	String b = new String(new char[501]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		q = Double.parseDouble(tempVar);
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
	l1 = a.length();
	l2 = b.length();
	if (l1 != l2)
	{
		System.out.print("error");
	}
	else
	{
	t = 0;
	for (i = 0;i < l1;i++)
	{
	if (((a.charAt(i) != 'A') && (a.charAt(i) != 'T') && (a.charAt(i) != 'C') && (a.charAt(i) != 'G')) || ((b.charAt(i) != 'A') && (b.charAt(i) != 'T') && (b.charAt(i) != 'C') && (b.charAt(i) != 'G')))
	{
		System.out.print("error");
		t = 1;
		break;
	}
	}
	if (t == 0)
	{
	s = 0;
	for (i = 0;i < l1;i++)
	{
	if (a.charAt(i) == b.charAt(i))
	{
		s = s + 1;
	}
	}
	c = 1.0 * s / l1;
	if (c > q)
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

