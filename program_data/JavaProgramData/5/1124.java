package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int m;
		int n;
		double d;
		double k;
		double r;
		k = 0;
		String p = new String(new char[N]);
		String q = new String(new char[N]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			r = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			q = tempVar3.charAt(0);
		}
		m = p.length();
		n = q.length();
		if (m != n)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < n;i++)
			{
				if ((p.charAt(i) != 'A' && p.charAt(i) != 'T' && p.charAt(i) != 'C' && p.charAt(i) != 'G') || (q.charAt(i) != 'A' && q.charAt(i) != 'T' && q.charAt(i) != 'C' && q.charAt(i) != 'G'))
				{
					System.out.print("error");
					return 0;
				}
				else if (p.charAt(i) == q.charAt(i))
				{
					k++;
				}
			}
				d = 1.0 * k / n;
				if (d > r)
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

