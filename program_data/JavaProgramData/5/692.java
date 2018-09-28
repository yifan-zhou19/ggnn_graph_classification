package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	double z;
	double r = 0;
	int m;
	int n;
	int i;
	int error = 0;
	String a = new String(new char[500]);
	String b = new String(new char[500]);
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
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		b = tempVar3.charAt(0);
	}
	m = a.length();
	n = b.length();
	if (m != n)
	{
	error = error + 1;
	}
	else
	{
		for (i = 0;a.charAt(i);i++)
		{
			if (!(a.charAt(i) == 'A' || a.charAt(i) == 'T' || a.charAt(i) == 'C' || a.charAt(i) == 'G'))
			{
			error = error + 1;
			}
			else if (!(b.charAt(i) == 'A' || b.charAt(i) == 'T' || b.charAt(i) == 'C' || b.charAt(i) == 'G'))
			{
			error = error + 1;
			}
			else
			{
				if (a.charAt(i) == 'A' && b.charAt(i) == 'A')
				{
				r = r + 1;
				}
				if (b.charAt(i) == 'T' && a.charAt(i) == 'T')
				{
				r = r + 1;
				}
				if (a.charAt(i) == 'G' && b.charAt(i) == 'G')
				{
				r = r + 1;
				}
				if (a.charAt(i) == 'C' && b.charAt(i) == 'C')
				{
				r = r + 1;
				}
			}
		}
		r = r / m;
	}
	if (error != 0)
	{
	System.out.print("error");
	}
	else if (r >= z)
	{
	System.out.print("yes");
	}
	else
	{
	System.out.print("no");
	}
	return 0;
	}
}

