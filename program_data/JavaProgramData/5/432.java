package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	double a;
	double b;
	double s;
	double g;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Double.parseDouble(tempVar);
	}
	String nm = new String(new char[501]);
	String qw = new String(new char[501]);
	nm = new Scanner(System.in).nextLine();
	qw = new Scanner(System.in).nextLine();
	int d;
	int f;
	int c;
	int e;
	int k;
	c = 0;
	e = 0;
	k = 0;
	d = nm.length();
	f = qw.length();
	if (d != f)
	{
	c = 0;
	}
	else
	{
		c = 1;
		  for (int h = 0;h < d;h++)
		  {
	if ((nm.charAt(h) != 'A' && nm.charAt(h) != 'T' && nm.charAt(h) != 'C' && nm.charAt(h) != 'G') || (qw.charAt(h) != 'A' && qw.charAt(h) != 'T' && qw.charAt(h) != 'C' && qw.charAt(h) != 'G'))
	{
				  e = e+1;
	}
	if (nm.charAt(h) == qw.charAt(h))
	{
				  k = k + 1;
	}
		  }
	}
	if (c == 0 || e != 0)
	{
		System.out.print("error");
	}
	if (c != 0 && e == 0)
	{
	s = k * 1.0;
	g = d * 1.0;
	b = s / g;
	if (b >= a)
	{
	System.out.print("yes");
	}
	if (b < a)
	{
	System.out.print("no");
	}
	}
	}
}

