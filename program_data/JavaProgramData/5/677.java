package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int c;
		int d;
		int i;
		double q;
		double p;
		double e = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p = Double.parseDouble(tempVar);
		}
		String a = new String(new char[501]);
		String b = new String(new char[501]);
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
		c = a.length();
		d = b.length();
		if (c != d)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < d;i++)
			{
				if (a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'G' && a.charAt(i) != 'C')
				{
					System.out.print("error");
					break;
				}
				else if (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'G' && b.charAt(i) != 'C')
				{
					System.out.print("error");
					break;
				}
				else if (a.charAt(i) == b.charAt(i))
				{
					e++;
				}
			}
			if (i == d)
			{
				q = e / d;
				if (q >= p)
				{
					System.out.print("yes");
				}
				else
				{
					System.out.print("no");
				}
			}
		}
		return 0;
	}
}

