package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int pd = 1;
		int i = 0;
		double x;
		double xg = 0;
		double c;
		double f;
		String m = new String(new char[501]);
		String z = new String(new char[501]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			z = tempVar3.charAt(0);
		}
		c = m.length();
		f = z.length();
		if (c != f)
		{
			pd = 0;
		}
			for (i = 0;i < c;i++)
			{
				if ((m.charAt(i) != 'A' && m.charAt(i) != 'G' && m.charAt(i) != 'C' && m.charAt(i) != 'T') || (z.charAt(i) != 'A' && z.charAt(i) != 'G' && z.charAt(i) != 'C' && z.charAt(i) != 'T'))
				{
					pd = 0;
				}
				if (m.charAt(i) == z.charAt(i))
				{
					xg++;
				}
			}
			if (pd == 0)
			{
				System.out.print("error");
			}
			else if ((xg / c) >= x)
			{
				System.out.print("yes");
			}
			else
			{
				System.out.print("no");
			}
		return 0;
	}

}

