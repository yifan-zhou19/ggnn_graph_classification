package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int lem;
	int len;
	int q;
	double p;
	double l;
	String m = new String(new char[501]);
	String n = new String(new char[501]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		p = Double.parseDouble(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		m = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		n = tempVar3.charAt(0);
	}
	lem = m.length();
	len = n.length();
	if (lem != len)
	{
	System.out.print("error");
	return 0;
	}
	else
	{
	q = len;
	}
	int r = 0;
	for (i = 0;i < q;i++)
	{
		if (((m.charAt(i) != 'A') && (m.charAt(i) != 'T') && (m.charAt(i) != 'C') && (m.charAt(i) != 'G')) || ((n.charAt(i) != 'A') && (n.charAt(i) != 'T') && (n.charAt(i) != 'C') && (n.charAt(i) != 'G')))
		{
			System.out.print("error");
			break;
		}
		else if (m.charAt(i) == n.charAt(i))
		{
			r++;
		}
	}
	if (i == q)
	{
		l = 1.0 * r / q;
	if (l >= p)
	{
	System.out.print("yes");
	}
	else if (l < p)
	{
	System.out.print("no");
	}
	}

	return 0;
	}


}

