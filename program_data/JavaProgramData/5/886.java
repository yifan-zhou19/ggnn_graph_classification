package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int x;
	int y;
	int m = 0;
	int c = 1;
	double z;
	double w;
	String a = new String(new char[1000]);
	String b = new String(new char[1000]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		z = Double.parseDouble(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
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
	  c = 0;
	}
	else
	{
	for (i = 0;i < x;i++)
	{
	if ((a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'C' && a.charAt(i) != 'G') || (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'C' && b.charAt(i) != 'G'))
	{
		System.out.print("error");
		c = 0;
		break;
	}
	else if (a.charAt(i) == b.charAt(i))
	{
		m++;
	w = 1.0 * m / x;
	}
	}
	}

	if (c != 0)
	{
		if (w > z)
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

