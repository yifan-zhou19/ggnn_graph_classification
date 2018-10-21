package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[501]);
		String s = new String(new char[501]);
		int i;
		int c = 0;
		int d = 0;
		int e = 0;
		int p = 0;
		double k;
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
			s = tempVar3.charAt(0);
		}
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			p = p + 1;
		if ((s.charAt(i) != 'A') && (s.charAt(i) != 'T') && (s.charAt(i) != 'C') && (s.charAt(i) != 'G'))
		{
			e = e+1;
		}
		}
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			c = c + 1;
			if (a.charAt(i) == s.charAt(i))
			{
				d = d + 1;
			}
			if ((a.charAt(i) != 'A') && (a.charAt(i) != 'T') && (a.charAt(i) != 'C') && (a.charAt(i) != 'G'))
			{
				e = 1;
			}
		}
		if (p != c)
		{
			e = 1;
		}
		if (e == 1)
		{
			System.out.print("error");
		}
		else if ((1.0 * d / c) > k)
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

