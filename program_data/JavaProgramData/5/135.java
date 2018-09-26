package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int la;
		int lb;
		int x;
		int i;
		double r0;
		double r1;
		String a = new String(new char[505]);
		String b = new String(new char[505]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			r0 = Double.parseDouble(tempVar);
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
		la = a.length();
		lb = b.length();
		if (la != lb)
		{
			System.out.print("error\n");
		}
		else
		{
			x = 1;
			for (i = 0,m = 0;i < la;i++)
			{
				if (a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'G' && a.charAt(i) != 'C')
				{
					System.out.print("error\n");
					x = 0;
					break;
				}
				else if (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'G' && b.charAt(i) != 'C')
				{
					System.out.print("error\n");
					x = 0;
					break;
				}
				else
				{
					if (a.charAt(i) == b.charAt(i))
					{
						m++;
					}
				}
			}
			r1 = 1.0 * m / la;
			if (x == 1)
			{
				if (r1 > r0)
				{
					System.out.print("yes\n");
				}
				else
				{
					System.out.print("no\n");
				}
			}
		}
		return 0;
	}
}

