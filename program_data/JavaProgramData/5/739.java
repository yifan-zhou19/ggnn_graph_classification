package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		double a;
		double k = 0;
		String x = new String(new char[500]);
		String y = new String(new char[500]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			y = tempVar3.charAt(0);
		}
		if (x.length() != y.length())
		{
			System.out.print("error");
			return 0;
		}
		else
		{
			for (i = 0;x.charAt(i) != '\0';i += 1)
			{
				if ((x.charAt(i) != 'A' && x.charAt(i) != 'T' && x.charAt(i) != 'C' && x.charAt(i) != 'G') || (y.charAt(i) != 'A' && y.charAt(i) != 'T' && y.charAt(i) != 'C' && y.charAt(i) != 'G'))
				{
					System.out.print("error");
					return 0;
				}
			}
			for (i = 0;x.charAt(i) != '\0';i += 1)
			{
				if (x.charAt(i) == y.charAt(i))
				{
					k += 1;
				}
			}
			if (k / i > a)
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

