package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[500]);
		String b = new String(new char[500]);
		double x;
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
		int m;
		int i;
		int same = 0;
		m = a.length();
		for (i = 0;i < m;i++)
		{
			if ((a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'C' && a.charAt(i) != 'G') || (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'C' && b.charAt(i) != 'G'))
			{
				same = -1;
			}
			else if (a.charAt(i) == b.charAt(i))
			{
				same++;
			}
		}
		double y;
		y = (double)same / m;
		if (y > x && same != -1)
		{
			System.out.print("yes");
		}
		else if (y <= x != 0 && same != -1)
		{
			System.out.print("no");
		}
		else if (same = -1)
		{
			System.out.print("error");
		}
		return 0;
	}
}

