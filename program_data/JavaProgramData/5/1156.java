package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int t;
		int i;
		String d1 = new String(new char[max + 1]);
		String d2 = new String(new char[max + 1]);
		double a;
		double k = 0.00;
		double m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			d1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			d2 = tempVar3.charAt(0);
		}
		n = d1.length();
		t = d2.length();
		if (n != t)
		{
			System.out.print("error");
			return 0;
		}
		for (i = 0;i < t;i++)
		{
			if ((d1.charAt(i) != 'A') && (d1.charAt(i) != 'C') && (d1.charAt(i) != 'T') && (d1.charAt(i) != 'G'))
			{
				System.out.print("error");
				return 0;
			}
			else if ((d2.charAt(i) != 'A') && (d2.charAt(i) != 'C') && (d2.charAt(i) != 'T') && (d2.charAt(i) != 'G'))
			{
				System.out.print("error");
				return 0;
			}
			else
			{
				if (d1.charAt(i) == d2.charAt(i))
				{
					k++;
				}
			}
		}
		m = 1.0 * (k / n);
		if (m > a)
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

