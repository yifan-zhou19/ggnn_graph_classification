package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[501]);
		String b = new String(new char[501]);
		int i;
		int x;
		int y;
		int z;
		int c;
		double n;
		double p;
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
		x = a.length();
		y = b.length();
		z = 0;
		c = 0;
		if (x != y)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < x;i++)
			{
				if ((a.charAt(i) == 'A' || a.charAt(i) == 'T' || a.charAt(i) == 'G' || a.charAt(i) == 'C') && (b.charAt(i) == 'A' || b.charAt(i) == 'T' || b.charAt(i) == 'G' || b.charAt(i) == 'C'))
				{
					c++;
					if (a.charAt(i) == b.charAt(i))
					{
					z++;
					}
				}
			}
			p = 1.000 * z / x;
			if (c == x && p > n)
			{
				System.out.print("yes");
			}
			else if (c == x && p <= n)
			{
				System.out.print("no");
			}
			else if (c != x)
			{
				System.out.print("error");
			}
		}
		return 0;
	}

}

