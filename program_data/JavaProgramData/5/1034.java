package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int m;
		int n;
		int a;
		int b;
		int k;
		k = 0;
		a = 0;
		b = 0;
		double p;
		String f = new String(new char[501]);
		String g = new String(new char[501]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			f = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			g = tempVar3.charAt(0);
		}
		m = f.length();
		n = g.length();
		for (i = 0;i < m;i++)
		{
			if (f.charAt(i) != 'A' && f.charAt(i) != 'T' && f.charAt(i) != 'C' && f.charAt(i) != 'G')
			{
				a++;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (g.charAt(i) != 'A' && g.charAt(i) != 'T' && g.charAt(i) != 'C' && g.charAt(i) != 'G')
			{
				b++;
			}
		}
		if (m != n || a != 0 || b != 0)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < m;i++)
			{
				 if (f.charAt(i) == g.charAt(i))
				 {
					 k++;
				 }
			}
			if (1.0 * k / m > p)
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

