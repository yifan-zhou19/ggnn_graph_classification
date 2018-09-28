package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	double n;
	String a = new String(new char[MAX + 1]);
	String b = new String(new char[MAX + 1]);
	int p;
	int q;
	int i;
	int j;
	int x = 0;
	int y = 0;
	int l = 0;
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
	p = a.length();
	q = b.length();
	if (p != q)
	{
	System.out.print("error");
	}
	if (p == q)
	{
	for (i = 0;a.charAt(i);i++)
	{
	if (a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'C' && a.charAt(i) != 'G')
	{
	System.out.print("error");
	x++;
	break;
	}
	}
	for (j = 0;b.charAt(j);j++)
	{
	if (b.charAt(j) != 'A' && b.charAt(j) != 'T' && b.charAt(j) != 'C' && b.charAt(j) != 'G' && x == 0)
	{
	System.out.print("error");
	y++;
	break;
	}
	}
	}
	if (p == q && x == 0 && y == 0)
	{
	for (i = 0;i < p;i++)
	{
	if (a.charAt(i) == b.charAt(i))
	{
	l++;
	}
	}
	if (l * 1.0 / p > n)
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

