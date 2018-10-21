package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int l1;
		int l2;
		int i;
		int c;
		double n;
		double m;
		c = 0;
		String f = new String(new char[500]);
		String s = new String(new char[500]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			f = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			s = tempVar3.charAt(0);
		}
		l1 = f.length();
		l2 = s.length();
		if (l1 != l2)
		{
			System.out.print("error");
			return 0;
		}
		for (i = 0;i < l1;i++)
		{
			if (f.charAt(i) != 'A' && f.charAt(i) != 'G' && f.charAt(i) != 'C' && f.charAt(i) != 'T')
			{
				System.out.print("error");
				return 0;
			}
		}
		for (i = 0;i < l2;i++)
		{
			if (s.charAt(i) != 'A' && s.charAt(i) != 'G' && s.charAt(i) != 'C' && s.charAt(i) != 'T')
			{
				System.out.print("error");
				return 0;
			}
		}

		for (i = 0;i < l2;i++)
		{
			if (s.charAt(i) == f.charAt(i))
			{
				c++;
			}
		}

	m = 1.0 * c / l1;
	if (m >= n)
	{
		System.out.print("yes");
	}
	if (m < n)
	{
		System.out.print("no");
	}
		return 0;
	}
}

