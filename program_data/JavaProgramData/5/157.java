package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int len;
		int lena;
		double r;
		double ra;
		String z = new String(new char[200]);
		String x = new String(new char[200]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			r = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			z = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			x = tempVar3.charAt(0);
		}
		len = z.length();
		lena = x.length();
		d = 0;
		for (a = 0;a <= len - 1;a++)
		{
			if (len != lena)
			{
				d = 1;
			}
			if ((z.charAt(a) != 'A') && (z.charAt(a) != 'T') && (z.charAt(a) != 'C') && (z.charAt(a) != 'G'))
			{
				d = 1;
			}
			if ((x.charAt(a) != 'A') && (x.charAt(a) != 'T') && (x.charAt(a) != 'C') && (x.charAt(a) != 'G'))
			{
				d = 1;
			}
		}
		if (d == 1)
		{
			System.out.print("error");
			return 0;
		}
		b = 0;
		c = 0;
		for (a = 0;a <= len - 1;a++)
		{
			c++;
			if (z.charAt(a) == x.charAt(a))
			{
				b++;
			}
		}
		ra = b * 1.0 / c;
		if (ra > r)
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

