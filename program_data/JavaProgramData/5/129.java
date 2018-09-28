package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int c = 0;
		int d = 0;
		int e = 0;
		int g = 0;
		double f;
		double k;
		String a = new String(new char[503]);
		String b = new String(new char[503]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Double.parseDouble(tempVar);
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
		for (i = 0;i < 503;i++)
		{
			if (a.charAt(i) == '\0')
			{
				break;
			}
			else
			{
				c = c + 1;
			}
			if (a.charAt(i) != 'T' && a.charAt(i) != 'A' && a.charAt(i) != 'C' && a.charAt(i) != 'G')
			{
				g = g + 1;
			}

		}
		for (i = 0;i < 503;i++)
		{
			if (b.charAt(i) == '\0')
			{
				break;
			}
			else
			{
				d = d + 1;
			}
			if (b.charAt(i) != 'T' && b.charAt(i) != 'A' && b.charAt(i) != 'C' && b.charAt(i) != 'G')
			{
				g = g + 1;
			}
		}
		if (c != d || g != 0)
		{
			System.out.print("error\n");
		}
		else
		{
			for (i = 0;i < c;i++)
			{
				if (a.charAt(i) == b.charAt(i))
				{
					e = e+1;
				}
			}
			f = 1.0 * e / c;
			if (f > k)
			{
				System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}
}

