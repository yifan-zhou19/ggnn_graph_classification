package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double n;
		double x;
		double y;
		double m;
		double t;
		x = 0;
		int i;
		int c;
		c = 0;
		String a = new String(new char[501]);
		String b = new String(new char[501]);
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
		t = b.length();
		if (m != t)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < m;i++)
			{
				if (((a.charAt(i) == 'A') || (a.charAt(i) == 'T') || (a.charAt(i) == 'C') || (a.charAt(i) == 'G')) && ((b.charAt(i) == 'A') || (b.charAt(i) == 'T') || (b.charAt(i) == 'C') || (b.charAt(i) == 'G')))
				{
					if (a.charAt(i) == b.charAt(i))
					{
						x = x + 1;
					}
				}
				else
				{
					c = c + 1;
				}
			}
			y = x / m;
			if (c > 0)
			{
				System.out.print("error");
			}
			else
			{
				if (y > n)
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

