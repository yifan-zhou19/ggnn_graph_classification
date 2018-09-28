package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int y;
	int q;
	int n;
	int i;
	int m;
	int l;
	double p;
	double k;
	String sz = new String(new char[500]);
	String dz = new String(new char[500]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		p = Double.parseDouble(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		sz = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		dz = tempVar3.charAt(0);
	}
	m = 0;
	y = 0;
	n = 0;
	l = 0;
	n = sz.length();
	q = 0;
	m = dz.length();
	if (m != n)
	{
	System.out.print("error");
	}
	else
	{
		for (i = 0;i < n;i++)
		{
			if (sz.charAt(i) != 'A' && sz.charAt(i) != 'T' && sz.charAt(i) != 'C' && sz.charAt(i) != 'G')
			{
				y++;
				System.out.print("error");
				break;
			}
			if (dz.charAt(i) != 'A' && dz.charAt(i) != 'T' && dz.charAt(i) != 'C' && dz.charAt(i) != 'G')
			{
				l++;
			   System.out.print("error");
			   break;
			}
		}
		if (l == 0 && y == 0)
		{
	for (i = 0;i < n;i++)
	{
		if (sz.charAt(i) == dz.charAt(i))
		{
		q++;
		}
	}
	k = 1.0 * q / n;
	if (k > p)
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

