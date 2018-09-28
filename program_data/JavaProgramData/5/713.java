package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double bl;
		double xg;
		int i;
		int l;
		int e;
		int k;
		int c;
		String a = new String(new char[501]);
		String b = new String(new char[501]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			bl = Double.parseDouble(tempVar);
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
		l = a.length();
		k = b.length();
		c = 0;
		e = 0;
		for (i = 0;i < l;i++)
		{
			if ((a.charAt(i) != 'A') && (a.charAt(i) != 'T') && (a.charAt(i) != 'C') && (a.charAt(i) != 'G'))
			{
				c = 1;
			}
		}
		for (i = 0;i < k;i++)
		{
			if ((b.charAt(i) != 'A') && (b.charAt(i) != 'T') && (b.charAt(i) != 'C') && (b.charAt(i) != 'G'))
			{
				c = 1;
			}
		}
		if (l == k && c == 0)
		{
		for (i = 0;i < l;i++)
		{
			if (a.charAt(i) == b.charAt(i))
			{
				e++;
			}
		}
		xg = 1.0 * e / l;
		if (xg > bl)
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

