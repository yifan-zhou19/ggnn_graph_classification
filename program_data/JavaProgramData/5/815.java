package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int b;
		int c;
		int f = 0;
		int e = 0;
		int i;
		double a;
		double h;
		char[][] d = new char[3][502];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Double.parseDouble(tempVar);
		}
		for (i = 0;i < 2;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				d[i] = tempVar2.charAt(0);
			}
		}
		b = String.valueOf(d[0]).length();
		c = String.valueOf(d[1]).length();
		if (b == c)
		{
			for (f = 0;f < b;f++)
			{
				if (d[0][f] == d[1][f])
				{
					e++;
				}
			}
			for (f = 0;f < b;f++)
			{
				if ((d[0][f] != 'A' && d[0][f] != 'G' && d[0][f] != 'C' && d[0][f] != 'T') || (d[1][f] != 'A' && d[1][f] != 'G' && d[1][f] != 'C' && d[1][f] != 'T'))
				{
					break;
				}
			}
			if (f == b)
			{
			h = e * 1.0 / b;
			if (h > a)
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
		}
		else
		{
			System.out.print("error");
		}
		return 0;
	}

}

