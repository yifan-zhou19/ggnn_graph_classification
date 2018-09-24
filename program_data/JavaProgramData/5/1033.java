package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int m;
		int n;
		double x;
		double y;
		double o = 0;
		String a = new String(new char[500]);
		String b = new String(new char[500]);
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
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = tempVar3.charAt(0);
		}
		m = a.length();
		n = b.length();
		if (m != n)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < m;i++)
			{
				if ((a.charAt(i) == 65 || a.charAt(i) == 71 || a.charAt(i) == 67 || a.charAt(i) == 84) && (b.charAt(i) == 65 || b.charAt(i) == 71 || b.charAt(i) == 67 || b.charAt(i) == 84))
				{
					if (a.charAt(i) == b.charAt(i))
					{
						o++;
					}
				}
				else
				{
					System.out.print("error");
					break;
				}
			}
			if (i == m)
			{
				y = o / n;
				if (y >= x)
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

