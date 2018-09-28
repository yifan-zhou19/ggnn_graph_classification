package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int k;
	int l;
	int s = 0;
	int p = 0;
	double n;
	double m;
	String a = new String(new char[600]);
	String b = new String(new char[600]);
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
	k = a.length(),l = b.length();
	for (i = 0;i < k;i++)
	{
		if ((a.charAt(i) != 'A') && (a.charAt(i) != 'T') && (a.charAt(i) != 'C') && (a.charAt(i) != 'G'))
		{
			p++;
		}
	}
	for (i = 0;i < k;i++)
	{
		if (a.charAt(i) == b.charAt(i))
		{
			s++;
		}
	}
	m = 1.0 * s / k;
	if ((k == l) && (p == 0) && (m > n))
	{
		System.out.print("yes");
	}
	else if ((k == l) && (p == 0) && (m <= n))
	{
		System.out.print("no");
	}
	else
	{
		System.out.print("error");
	}
	return 0;
	}

}

