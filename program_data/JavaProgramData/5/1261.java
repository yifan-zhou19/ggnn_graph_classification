package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int c;
		int d;
		double l;
		double m;
		double n;
		double x = 0;
		String a = new String(new char[500]);
		String b = new String(new char[500]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			l = Double.parseDouble(tempVar);
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

		m = a.length();
		n = b.length();
		for (i = 0;i < m;i++)
		{
			if (a.charAt(i) != 'A' && a.charAt(i) != 'G' && a.charAt(i) != 'C' && a.charAt(i) != 'T')
			{
				d = 0;
			}
			else
			{
				d = 1;
			}

		}
		if (c != 0 && d != 0 && n == m)
		{
			for (i = 0;i < n;i++)
			{
				if (a.charAt(i) == b.charAt(i))
				{
					x++;
				}
				else
				{
					x = x;
				}
			}
			if (l < (x / n))
			{
				System.out.print("yes");
			}
			else
			{
				System.out.print("no");
			}
		}
		else
		{
			System.out.print("error");
		}
		return 0;
	}

}

