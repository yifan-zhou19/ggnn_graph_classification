package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int m;
		int p;
		int f = 1;
		double x;
		double bl;
		String a = new String(new char[502]);
		String b = new String(new char[502]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			bl = Double.parseDouble(tempVar);
		}
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		m = a.length();
		p = b.length();
		for (i = 0;i < m;i++)
		{
			if (a.charAt(i) != 'A' && a.charAt(i) != 'G' && a.charAt(i) != 'C' && a.charAt(i) != 'T')
			{
				f = 0;
			}
		}
		for (i = 0;i < p;i++)
		{
			if (b.charAt(i) != 'A' && b.charAt(i) != 'G' && b.charAt(i) != 'C' && b.charAt(i) != 'T')
			{
				f = 0;
			}
		}
		if (m != p || f == 0)
		{
			System.out.print("error");
		}
		else if (m == p && f == 1)
		{
			int n = 0;
			for (i = 0;i < m;i++)
			{
				if (a.charAt(i) == b.charAt(i))
				{
					n++;
				}
			}
			x = 1.0 * n / m;
			if (x > bl)
			{
				System.out.print("yes");
			}
			else if (x <= bl)
			{
				System.out.print("no");
			}
		}
		return 0;
	}
}

