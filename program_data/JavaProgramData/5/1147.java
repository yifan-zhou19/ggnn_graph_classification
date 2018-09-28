package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int x;
	int y;
	int s = 0;
	String a = new String(new char[501]);
	String b = new String(new char[501]);
	double m;
	double o;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Double.parseDouble(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead("\n");
	if (tempVar2 != null)
	{
		a = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead("\n");
	if (tempVar3 != null)
	{
		b = tempVar3.charAt(0);
	}
	x = a.length();
	y = b.length();
	if (x != y)
	{
		System.out.print("error");
	}
	if (x == y)
	{
	for (i = 0;i < x;i++)
	{
		if ((a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'C' && a.charAt(i) != 'G') || (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'C' && b.charAt(i) != 'G'))
		{
			System.out.print("error");
			return 0;
		}
	}

		for (i = 0;i < x;i++)
		{
			if (a.charAt(i) == b.charAt(i))
			{
				s = s + 1;
			}
		}
	o = 1.0 * s / x;
	if (o > m)
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

