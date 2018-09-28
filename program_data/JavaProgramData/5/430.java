package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double x;
		double p;
		int i;
		int l;
		int k = 0;
		int c = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Double.parseDouble(tempVar);
		}
		String c1 = new String(new char[501]);
		String c2 = new String(new char[501]);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c2 = tempVar3.charAt(0);
		}
		l = c1.length();
		for (i = 0;i < l;i++)
		{
			if ((c1.charAt(i) != 'A') && (c1.charAt(i) != 'T') && (c1.charAt(i) != 'C') && (c1.charAt(i) != 'G'))
			{
				System.out.print("error");
				c = 0;
				break;
			}
			if ((c2.charAt(i) != 'A') && (c2.charAt(i) != 'T') && (c2.charAt(i) != 'C') && (c2.charAt(i) != 'G'))
			{
				System.out.print("error");
				c = 0;
				break;
			}
			if (c1.charAt(i) == c2.charAt(i))
			{
				k++;
			}
		}
		if (c != 0)
		{
			p = ((double)k) / ((double)l);
			if (p > x)
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

