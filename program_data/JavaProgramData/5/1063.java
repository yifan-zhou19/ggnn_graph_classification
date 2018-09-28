package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String a = new String(new char[501]);
	String b = new String(new char[501]);
	double n;
	double y;
	double x;
	double m;
	double q;
	double p;
	x = 0;
	p = 1;
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
	q = b.length();
	for (int i = 0;i < m;i++)
	{
		if (a.charAt(i) != 'A' && a.charAt(i) != 'C' && a.charAt(i) != 'G' && a.charAt(i) != 'T')
		{
			p = 0;
			break;
		}
	}
	for (int i = 0;i < q;i++)
	{
		if (b.charAt(i) != 'A' && b.charAt(i) != 'C' && b.charAt(i) != 'G' && b.charAt(i) != 'T')
		{
			p = 0;
			break;
		}
	}
	if (m != q)
	{
		p = 0;
	}
	if (p == 0)
	{
		System.out.print("error");
	}
	else
	{
		for (int i = 0;i < m;i++)
		{
			if (a.charAt(i) == b.charAt(i))
			{
				x++;
			}
		}
	y = x / m;
		if (y > n)
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

