package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int c;
		int d;
		int j = 1;
		double n;
		double m;
		double q = 0;
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
		c = a.length();
		d = b.length();

		for (i = 0;a.charAt(i);i++)
		{
			if ((a.charAt(i) != 'T' && a.charAt(i) != 'A' && a.charAt(i) != 'G' && a.charAt(i) != 'C') || (b.charAt(i) != 'A' && b.charAt(i) != 'G' && b.charAt(i) != 'T' && b.charAt(i) != 'C') || c != d)
			{
				System.out.print("error");
				j = 0;
			break;
			}
		}
		if (j == 1)
		{
		for (i = 0;a.charAt(i);i++)
		{
			if (a.charAt(i) == b.charAt(i))
			{
				m++;
			}
		}
		q = m / c;
		if (q > n)
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

