package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String a = "";
		final String b = "";
		double n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
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
		int x;
		int y;
		x = a.length();
		y = b.length();
		if (x != y)
		{
			System.out.print("error");
		}
		else
		{
			int count = 0;
			int so = 0;
			double rate;
			for (int i = 0;i < x;i++)
			{
				if (a.charAt(i) == b.charAt(i))
				{
					count++;
				}
				if ((a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'C' && a.charAt(i) != 'G') || (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'C' && b.charAt(i) != 'G'))
				{
					System.out.print("error");
					so = 100;
					break;
				}
			}
			if (so != 100)
			{
				rate = count * 1.0 / x;
				if (rate > n)
				{
					System.out.print("yes");
				}
				else
				{
					System.out.print("no");
				}
			}
		}
		return 0;
	}

}

