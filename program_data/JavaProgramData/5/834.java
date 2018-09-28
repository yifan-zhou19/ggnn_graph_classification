package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int e;
	int z;
	double n;
	e = 0;
	z = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Double.parseDouble(tempVar);
	}
	final String a = "";
	final String b = "";
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
	int c;
	int d;
	c = a.length();
	d = b.length();
	if (c != d)
	{
		System.out.print("error");
	}
	else
	{
	for (int i = 0;a.charAt(i) != '\0';i++)
	{
		if (a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'C' && a.charAt(i) != 'G')
		{
			z = 1;
		}
		if (a.charAt(i) == b.charAt(i))
		{
			e++;
		}
	}
		if (z == 0)
		{
	int t = 1.0000000 * e / (c - 3);
	if (t >= n)
	{
		System.out.print("yes");
	}
	else
	{
		System.out.print("no");
	}
		}
	else
	{
		System.out.print("error");
	}

	}


	return 0;
	}


}

