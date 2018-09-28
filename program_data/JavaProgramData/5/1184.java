package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[510]);
		String b = new String(new char[510]);
		int x;
		int y;
		int i;
		int p = 0;
		double n;
		double q;
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
		if (x != y)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < x;i++)
			{
				if ((a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'C' && a.charAt(i) != 'G') || (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'C' && b.charAt(i) != 'G'))
				{
					System.out.print("error");
					return 0;
				}
				if (a.charAt(i) == b.charAt(i))
				{
				p++;
				}
			}
		q = n * x;
		if (p > q)
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

