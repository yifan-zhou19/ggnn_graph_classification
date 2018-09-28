package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int m;
		int n;
		double w;
		double e;
		double k = 0.0;
		String a = new String(new char[501]);
		String b = new String(new char[501]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Double.parseDouble(tempVar);
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
		m = a.length();
		n = b.length();
		for (i = 0;i < n;i++)
		{
			if (m != n)
			{
				System.out.print("error\n");
				i = n + 1;
				break;
			}
			else if ((a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'C' && a.charAt(i) != 'G') || (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'C' && b.charAt(i) != 'G'))
			{
					System.out.print("error\n");
					i = n + 1;
					break;
			}
			else if (a.charAt(i) == b.charAt(i))
			{
					k = k + 1;
					e = 1.0 * k / n;
			}
		}
		if (e > w && i == n)
		{
			System.out.print("yes\n");
		}
		else if (e <= w != 0 && i == n)
		{
			System.out.print("no\n");
		}
		return 0;
	}
}

