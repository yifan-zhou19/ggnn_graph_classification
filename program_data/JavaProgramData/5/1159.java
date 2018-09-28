package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int x;
		int m;
		int c;
		int r;
		int k;
		double n;
		double y;
		String a = new String(new char[502]);
		String b = new String(new char[502]);
		x = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
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
		c = b.length();
		r = 1;
	k = 1;
		if (m != c)
		{
			k = 0;
		}
		for (i = 0;i < m;i++)
		{
			if (a.charAt(i) == 'A' || a.charAt(i) == 'T' || a.charAt(i) == 'G' || a.charAt(i) == 'C' || b.charAt(i) == 'A' || b.charAt(i) == 'T' || b.charAt(i) == 'G' || b.charAt(i) == 'C')
			{
				r = 1;
			}
			else
			{
			r = 0;
			}
			if (r == 0 || k == 0)
			{
				System.out.print("error");
				break;
			}
		}
		if (r == 1 && k == 1)
		{
			for (i = 0;i < m;i++)
			{
				if (a.charAt(i) == b.charAt(i))
				{
					x++;
				}
			}
			y = 1.0 * x / m;
			if (y > n)
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

