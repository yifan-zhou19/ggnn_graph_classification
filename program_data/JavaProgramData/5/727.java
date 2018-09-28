package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int biao = 0;
	int i;
	int j;
	int n;
	int l;
	int d;
	int c = 0;
	int a1 = 0;
	int a2;
	double v;
	double w;
	String a = new String(new char[505]);
	String b = new String(new char[505]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		v = Double.parseDouble(tempVar);
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
	c = a.length();
	d = b.length();
	if (c != d)
	{
		biao = 1;
		System.out.print("error");
	}
	if (biao == 0)
	{
		for (i = 0;i < c;i++)
		{
			if (!((a.charAt(i) == 'A' || a.charAt(i) == 'T' || a.charAt(i) == 'C' || a.charAt(i) == 'G') && (b.charAt(i) == 'A' || b.charAt(i) == 'T' || b.charAt(i) == 'C' || b.charAt(i) == 'G')))
			{
				biao = 1;
				System.out.print("error");
				break;
			}
		}
	}
	if (biao == 0)
	{
		for (i = 0;i < c;i++)
		{
			if (a.charAt(i) == b.charAt(i))
			{
				a1++;
			}
		}
		w = 1.0 * a1 / c * 1.0;
		if (w >= v)
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

