package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String x = new String(new char[600]);
		String y = new String(new char[600]);
		int b = 0;
		int i;
		double a;
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
		for (i = 0;i < 600;i++)
		{
			if (x.charAt(i) != 'A' && x.charAt(i) != 'G' && x.charAt(i) != 'C' && x.charAt(i) != 'T' && x.charAt(i) != 0)
			{
				System.out.print("error");
				return 0;
			}
			if (y.charAt(i) != 'A' && y.charAt(i) != 'G' && y.charAt(i) != 'C' && y.charAt(i) != 'T' && y.charAt(i) != 0)
			{
				System.out.print("error");
				return 0;
			}
			if (x.charAt(i) == 0)
			{
				break;
			}
			if (x.charAt(i) == y.charAt(i))
			{
				b++;
			}
		}
		if ((1.0 * b / x.length()) >= a)
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

