package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int sum = 0;
		int m;
		int n;
		double x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Double.parseDouble(tempVar);
		}
		String c1 = new String(new char[501]);
		String c2 = new String(new char[501]);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c2 = tempVar3.charAt(0);
		}
		m = c1.length();
		n = c2.length();
		if (m == n)
		{
			for (i = 0;i < m;i++)
			{
				if ((c1.charAt(i) != 'A' && c1.charAt(i) != 'T' && c1.charAt(i) != 'C' && c1.charAt(i) != 'G') || (c2.charAt(i) != 'A' && c2.charAt(i) != 'T' && c2.charAt(i) != 'C' && c2.charAt(i) != 'G'))
				{
					sum++;
				}
			}
			if (sum != 0)
			{
				System.out.print("error");
			}
			else
			{
				for (i = 0;i < m;i++)
				{
					if (c1.charAt(i) == c2.charAt(i))
					{
						sum++;
					}
				}
				if ((double)sum / m > x)
				{
					System.out.print("yes");
				}
				else
				{
					System.out.print("no");
				}
			}
		}
		else if (m != n)
		{
			System.out.print("error");
		}
		return 0;
	}

}

