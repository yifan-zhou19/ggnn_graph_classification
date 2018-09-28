package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[501]);
		String b = new String(new char[501]);
		double c;
		double m;
		double n = 0;
		double p;
		double q;
		int i;
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c = Double.parseDouble(tempVar);
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
		q = a.length();
		p = b.length();
		if (q != p)
		{
			t = t + 1;
		}
		for (i = 0;i < q;i++)
		{
			if (a.charAt(i) != 'T' && a.charAt(i) != 'C' && a.charAt(i) != 'G' && a.charAt(i) != 'A')
			{
				t = t + 1;
			}
		}
		for (i = 0;i < p;i++)
		{
			if (b.charAt(i) != 'T' && b.charAt(i) != 'C' && b.charAt(i) != 'G' && b.charAt(i) != 'A')
			{
				t = t + 1;
			}
		}
		if (t != 0)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < p;i++)
			{
				if (a.charAt(i) == b.charAt(i))
				{
					n = n + 1;
				}
			}
			m = n / p;
			if (m > c)
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

