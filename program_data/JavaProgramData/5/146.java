package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int x;
	int y;
	int u = 0;
	int t = 0;
	double n;
	String a = new String(new char[505]);
	String b = new String(new char[505]);
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
	x = a.length();
	y = b.length();
	if (x != y)
	{
		t = 0;
	}
	else
	{
	for (i = 0;i < x;i++)
	{
		if ((a.charAt(i) == 'A' || a.charAt(i) == 'T' || a.charAt(i) == 'G' || a.charAt(i) == 'C') && (b.charAt(i) == 'A' || b.charAt(i) == 'T' || b.charAt(i) == 'G' || b.charAt(i) == 'C'))
		{
			t += 1;
			if (a.charAt(i) == b.charAt(i))
			{
			u += 1;
			}

		}
		else if ((a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'G' && a.charAt(i) != 'C') || (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'G' && b.charAt(i) != 'C'))
		{
		t = 0;
		}
	}
	}
	if (t == 0)
	{
		System.out.print("error");
	}
	else if (u * 1.0 / x >= n)
	{
		System.out.print("yes");
	}
	else if (u * 1.0 / x < n)
	{
		System.out.print("no");
	}
	return 0;
	}

}

