package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		String a = new String(new char[500]);
		String b = new String(new char[500]);
		double x;
		double y;
		double k;
		double n;
		double m;
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
		String tempVar3 = ConsoleInput.scanfRead("\n");
		if (tempVar3 != null)
		{
			b = tempVar3.charAt(0);
		}
		n = a.length();
		m = b.length();
		for (i = 0;i < n;i++)
		{
			if (m == n && (a.charAt(i) == 'A' || a.charAt(i) == 'G' || a.charAt(i) == 'C' || a.charAt(i) == 'T' || b.charAt(i) == 'A' || b.charAt(i) == 'G' || b.charAt(i) == 'C' || b.charAt(i) != 'T'))
			{
				if (a.charAt(i) == b.charAt(i))
				{
					k = k + 1;
				}
			}
			else
			{
					System.out.print("error");
					return 0;
			}
		}
		y = k / n;
		if (y > x)
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

