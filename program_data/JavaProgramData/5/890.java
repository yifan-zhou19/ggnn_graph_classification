package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	double n;
	double c;
	int i;
	int j = 0;
	int m;
	int s;
	int t;
	String a = new String(new char[501]);
	String b = new String(new char[501]);
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
	scanf("\n");
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		b = tempVar3.charAt(0);
	}
	m = a.length();
	s = b.length();
	if (m <= s)
	{
		t = m;
	}
	else
	{
		t = s;
	}
	for (i = 0;i < t;i++)
	{
	if (a.charAt(i) != 'A' && a.charAt(i) != 'C' && a.charAt(i) != 'T' && a.charAt(i) != 'G' || m != s)
	{
	System.out.print("error");
	j = -1;
	break;
	}
	if (a.charAt(i) == b.charAt(i))
	{
	j++;
	}
	}
	c = 1.0 * j / m;
	if (c > n)
	{
		System.out.print("yes");
	}
	else if (c <= n != 0 && c >= 0)
	{
		System.out.print("no");
	}
	return 0;
	}





}

