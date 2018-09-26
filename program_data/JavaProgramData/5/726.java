package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int c = 0;
	int m = 0;
	int i;
	int a;
	int b;
	int j;
	int z = 1;
	double n;
	double q = 0;
	double w;
	String x = new String(new char[505]);
	String y = new String(new char[505]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Double.parseDouble(tempVar);
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
		z = 0;
	}
	else
	{
		for (i = 0;i < a;i++)
		{
			if ((x.charAt(i) == 'A' || x.charAt(i) == 'T' || x.charAt(i) == 'C' || x.charAt(i) == 'G') && (y.charAt(i) == 'A' || y.charAt(i) == 'T' || y.charAt(i) == 'C' || y.charAt(i) == 'G'))
			{
				z = 1;
			}
			else
			{
				z = 0;
			}
		}
	}
	if (z == 0)
	{
		System.out.print("error");
	}
	if (z != 0)
	{
		for (i = 0;i < a;i++)
		{
			if (x.charAt(i) == y.charAt(i))
			{
				q++;
			}
		}
	}
	if (z != 0)
	{
		w = q / a;
		if (w >= n)
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

