package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int m;
	int d;
	int e;
	int f;
	int r;
	double a;
	double g;
	r = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Double.parseDouble(tempVar);
	}
	String b = new String(new char[501]);
	String c = new String(new char[501]);
	for (i = 0;i < 2;i++)
	{
		if (i == 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b = tempVar2.charAt(0);
			}
			m = b.length();
		}
		else
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				c = tempVar3.charAt(0);
			}
			d = c.length();
		}
	}
	if (m >= d)
	{
		f = m;
	}
	else
	{
		f = d;
	}
	e = 0;
	 for (i = 0;i < f;i++)
	 {
			if ((b.charAt(i) == 'A' || (b.charAt(i) == 'T') || b.charAt(i) == 'C' || b.charAt(i) == 'G') && (c.charAt(i) == 'A' || (c.charAt(i) == 'T') || c.charAt(i) == 'C' || c.charAt(i) == 'G'))
			{
				if (c.charAt(i) == b.charAt(i))
				{
						e++;
				}
			}
			else
			{
				r = 1;
				break;
			}

	 }
	 if ((m == d) && (r == 0))
	 {
	   g = 1.0 * e / m;
		 if (g > a)
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


	return 0;

	}

}

