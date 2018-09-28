package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double x;
		double y;
		String a = new String(new char[501]);
		String b = new String(new char[501]);
		int i;
		int t = 0;
		int m = 0;
		int n = 0;
		int mark = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Double.parseDouble(tempVar);
		}
		System.in.read();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i);i++)
		{
			m = m + 1;
			if (a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'C' && a.charAt(i) != 'G')
			{
				mark = 0;
			}
		}
		for (i = 0;b.charAt(i);i++)
		{
			n = n + 1;
			if (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'C' && b.charAt(i) != 'G')
			{
				mark = 0;
			}
		}
		if (m != n || mark == 0)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < m;i++)
			{
				if (a.charAt(i) == b.charAt(i))
				{
					t = t + 1;
				}
			}
			y = t / (double)m;
			if (y >= x)
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

