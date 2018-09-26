package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double x;
		double y;
		int m;
		int n;
		int i;
		int c = 0;
		int r = 0;
		String a = new String(new char[505]);
		String b = new String(new char[505]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Double.parseDouble(tempVar);
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
		n = a.length();
		m = b.length();
		if (m != n)
		{
				 c = 3;
		}
		for (i = 0;i < n;i++)
		{
						 if (a.charAt(i) == b.charAt(i))
						 {
										r++;
						 }
						 if ((a.charAt(i) != 'A' && a.charAt(i) != 'G' && a.charAt(i) != 'C' && a.charAt(i) != 'T') || (b.charAt(i) != 'T' && b.charAt(i) != 'A' && b.charAt(i) != 'C' && b.charAt(i) != 'G'))
						 {
																													c = 3;
																													break;
						 }

		}
		y = 1.0 * r / n;
		if ((y > x) && (c == 0))
		{
							System.out.print("yes");
		}
		if ((y <= x) && (c == 0))
		{
							System.out.print("no");
		}
		if (c == 3)
		{
				 System.out.print("error");
		}

		return 0;
	}
}

