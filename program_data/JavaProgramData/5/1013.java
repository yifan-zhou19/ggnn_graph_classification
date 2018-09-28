package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double m;
		double n;
		double p;
		int l;
		int k;
		int q;
		int i;
		String b = new String(new char[500]);
		String c = new String(new char[500]);
		k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead("\n");
		if (tempVar3 != null)
		{
			c = tempVar3.charAt(0);
		}
		l = b.length();
		q = c.length();
		if (l != q)
		{
			System.out.print("error");
			return 0;
		}
		for (i = 0;i < l;i++)
		{
			if ((b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'C' && b.charAt(i) != 'G') || (c.charAt(i) != 'A' && c.charAt(i) != 'T' && c.charAt(i) != 'C' && c.charAt(i) != 'G'))
			{
				System.out.print("error");
				return 0;
			}
		}
		for (i = 0;i < l;i++)
		{
			if (b.charAt(i) == c.charAt(i))
			{
				k++;
			}
		}
		m = l;
		n = k;
		p = n / m;
		if (p > a)
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

