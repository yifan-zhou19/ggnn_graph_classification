package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String x1 = new String(new char[501]);
		String x2 = new String(new char[501]);
		double n;
		int i;
		int y = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			x2 = tempVar3.charAt(0);
		}
		if (x1.length() != x2.length())
		{
			System.out.print("error");
			return 0;
		}
		for (i = 0;x1.charAt(i) != '\0';i++)
		{
			if ((x1.charAt(i) != 'A' && x1.charAt(i) != 'T' && x1.charAt(i) != 'G' && x1.charAt(i) != 'C') || (x2.charAt(i) != 'A' && x2.charAt(i) != 'C' && x2.charAt(i) != 'G' && x2.charAt(i) != 'T'))
			{
				System.out.print("error");
				return 0;
			}
			if (x1.charAt(i) == x2.charAt(i))
			{
				y++;
			}
		}
		if ((double)y / i >= n)
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

