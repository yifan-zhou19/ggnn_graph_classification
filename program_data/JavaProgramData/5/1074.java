package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	char[][] d = new char[3][501];
	double n;
	double m;
	double a;
	double b;
	double c;
	double x;
	x = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Double.parseDouble(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		d[1] = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		d[2] = tempVar3.charAt(0);
	}
	n = String.valueOf(d[1]).length();
	m = String.valueOf(d[2]).length();
	for (i = 0;i < n;i++)
	{
		if ((d[1][i] != 'A' && d[1][i] != 'G' && d[1][i] != 'C' && d[1][i] != 'T') || (d[2][i] != 'A' && d[2][i] != 'G' && d[2][i] != 'C' && d[2][i] != 'T'))
		{
			x++;
		}
	}
	if (m != n || x > 0)
	{
		System.out.print("error");
	}
	else
	{
	for (i = 0;i < n;i++)
	{
		if (d[1][i] == d[2][i])
		{
			b++;
		}
	}
	c = b / n;
	if (c > a)
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

