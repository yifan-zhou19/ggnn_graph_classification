package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int sim = 0;
		double n;
		String one = new String(new char[501]);
		String two = new String(new char[501]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			one = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			two = tempVar3.charAt(0);
		}
		if (one.length() != two.length())
		{
			System.out.print("error\n");
			return 0;
		}
		for (i = 0;one.charAt(i);i++)
		{
			if ((one.charAt(i) != 'A') && (one.charAt(i) != 'T') && (one.charAt(i) != 'C') && (one.charAt(i) != 'G'))
			{
				System.out.print("error\n");
				return 0;
			}
		}
		for (i = 0;two.charAt(i);i++)
		{
				if (two.charAt(i) != 'A' && two.charAt(i) != 'T' && two.charAt(i) != 'C' && two.charAt(i) != 'G')
				{
				System.out.print("error\n");
				return 0;
				}
		}
		for (i = 0;one.charAt(i);i++)
		{
			if (one.charAt(i) == two.charAt(i))
			{
				sim++;
			}
		}
		if (1.0 * sim / one.length() > n)
		{
			System.out.print("yes\n");
		}
		else
		{
			System.out.print("no\n");
		}
	return 0;
	}
}

