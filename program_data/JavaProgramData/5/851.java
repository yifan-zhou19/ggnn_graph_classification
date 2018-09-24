package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		double a;
		double b = 0;
		double l;
		double m;
		double c = 0;
		String x = new String(new char[1000]);
		String y = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			x = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			y = tempVar3.charAt(0);
		}
		l = x.length();
		m = y.length();
		for (i = 0;i < l;i++)
		{
			if (x.charAt(i) == 'A' || x.charAt(i) == 'T' || x.charAt(i) == 'G' || x.charAt(i) == 'C')
			{
				c = c;
			}
			else
			{
				c++;
			}
		}
		for (i = 0;i < m;i++)
		{
			if (y.charAt(i) == 'A' || y.charAt(i) == 'T' || y.charAt(i) == 'G' || y.charAt(i) == 'C')
			{
				c = c;
			}
			else
			{
				c++;
			}
		}
		if (l == m && c == 0)
		{
			for (i = 0;i < l;i++)
			{
				if (x.charAt(i) == y.charAt(i))
				{
					b++;
				}
			}
			if (a < (b / l))
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

