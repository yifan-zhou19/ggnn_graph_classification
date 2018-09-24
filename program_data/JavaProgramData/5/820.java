package <missing>;

public class GlobalMembers
{
	public static int yn(char x)
	{
	int a;
	if ((x == 'A') || (x == 'T') || (x == 'C') || (x == 'G'))
	{
		a = 0;
	}
	else
	{
		a = 1;
	}
	return a;
	}
	public static int Main()
	{
	String a = new String(new char[501]);
	String b = new String(new char[501]);
	double q;
	double p;
	int i;
	int s;
	int l1;
	int l2;
	int o;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		p = Double.parseDouble(tempVar);
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
	o = 0;
	if (l1 != l2)
	{
		o = 1;
	}
	for (i = 0;i < l1;i++)
	{
	if (yn(a.charAt(i)) == 1)
	{
		o = 1;
		break;
	}
	}
	for (i = 0;i < l2;i++)
	{
	if (yn(b.charAt(i)) == 1)
	{
		o = 1;
		break;
	}
	}
	if (o == 1)
	{
		System.out.print("error");
	}
	else
	{
	s = 0;
	for (i = 0;i < l1;i++)
	{
	if ((a.charAt(i)) == b.charAt(i))
	{
		s = s + 1;
	}
	}
	q = 1.0 * s / l1;
	if (q > p)
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

