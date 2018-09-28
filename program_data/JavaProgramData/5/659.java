package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int a;
	int b;
	int c = 0;
	double e;
	double d;
	String x = new String(new char[256]);
	String y = new String(new char[256]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		d = Double.parseDouble(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		x = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		y = tempVar3.charAt(0);
	}
	a = x.length();
	b = y.length();
	if (a != b)
	{
		System.out.print("error");
	}
	else if (a == b)
	{
		for (i = 0;i < a;i++)
		{
			if ((x.charAt(i) != 'A' && x.charAt(i) != 'T' && x.charAt(i) != 'C' && x.charAt(i) != 'G') || (y.charAt(i) != 'A' && y.charAt(i) != 'T' && y.charAt(i) != 'C' && y.charAt(i) != 'G'))
			{
			System.out.print("error");
			return 0;
			}
			else
			{
				if (x.charAt(i) == y.charAt(i))
				{
					c += 1;
				}
			}
		}
		e = 1.0 * c / a;
		if (e >= d)
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

