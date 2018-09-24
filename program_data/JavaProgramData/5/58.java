package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int la;
		int lb;
		int i;
		int d;
		double t;
		double tt;
		String a = new String(new char[505]);
		String b = new String(new char[505]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Double.parseDouble(tempVar);
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
		d = -1;
		if (la == lb)
		{
			d = 0;
			for (i = 0;i < la;i++)
			{
				if (a.charAt(i) == b.charAt(i))
				{
					d++;
				}
				if ((a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'C' && a.charAt(i) != 'G') || (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'C' && b.charAt(i) != 'G'))
				{
					d = -1;
					break;
				}
			}
		}
		if (d < 0)
		{
			System.out.print("error");
		}
		else
		{
			tt = d * 1.000 / la;
			if (tt > t)
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

