package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			q = Double.parseDouble(tempVar);
		}
		String a = new String(new char[1000]);
		String b = new String(new char[1000]);
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
		int i;
		int m;
		int n;
		m = a.length();
		n = b.length();
		if (m != n)
		{
			System.out.print("error\n");
			return 0;
		}
		for (i = 0;i < n;i++)
		{
			if (a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'G' && a.charAt(i) != 'C')
			{
				System.out.print("error\n");
				return 0;
			}
			if (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'G' && b.charAt(i) != 'C')
			{
				System.out.print("error\n");
				return 0;
			}
		}
		int c = 0;
		for (i = 0;i < m;i++)
		{
			if (a.charAt(i) == b.charAt(i))
			{
				c++;
			}
		}
		double x;
		x = (1.0 * c) / (1.0 * m);
		if (x >= q)
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

