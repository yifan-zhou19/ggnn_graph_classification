package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double x;
		double y;
		int n = 0;
		int i;
		int c;
		int d;
		int m = 0;
		String a = new String(new char[502]);
		String b = new String(new char[502]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = tempVar3.charAt(0);
		}
		c = a.length();
		d = b.length();

		for (i = 0;i < c;i++)
		{
			if (a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'C' && a.charAt(i) != 'G')
			{
				m = 1;
				break;
			}
		}
		for (i = 0;i < d;i++)
		{
			if (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'C' && b.charAt(i) != 'G')
			{
				m = 1;
				break;
			}
		}
		if (m == 1 || c != d)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;a.charAt(i),b.charAt(i);i++)
			{
				if (a.charAt(i) == b.charAt(i))
				{
					n++;
				}
			}
			y = 1.0 * n / c;
			if (y > x)
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

