package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String x = new String(new char[501]);
		String y = new String(new char[501]);
		char m = 0;
		char n = 0;
		char i;
		char p = 0;
		char q = 0;
		double a;
		double b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			y = tempVar3.charAt(0);
		}
		for (i = 0;x.charAt(i);i++)
		{
			if (x.charAt(i) != 'A' && x.charAt(i) != 'C' && x.charAt(i) != 'G' && x.charAt(i) != 'T')
			{
				q++;
			}
			m++;
		}
		for (i = 0;y.charAt(i);i++)
		{
			if (y.charAt(i) != 'A' && y.charAt(i) != 'C' && y.charAt(i) != 'G' && y.charAt(i) != 'T')
			{
				q++;
			}
			p++;
		}
		if (m != p || q != 0)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < m;i++)
			{
				if (x.charAt(i) == y.charAt(i))
				{
					n++;
				}
			}
			b = 1.0 * n / m;
			if (b > a)
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

