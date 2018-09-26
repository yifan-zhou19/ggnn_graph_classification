package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double b;
		int l1;
		int l2;
		int x = 0;
		String d1 = new String(new char[500]);
		String d2 = new String(new char[500]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			d1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			d2 = tempVar3.charAt(0);
		}
		l1 = d1.length();
		l2 = d2.length();
		if (l1 != l2)
		{
			System.out.print("error");
			return 0;
		}
		for (int i = 0;i < l1;i++)
		{
			if (d1.charAt(i) != 'A' && d1.charAt(i) != 'T' && d1.charAt(i) != 'C' && d1.charAt(i) != 'G')
			{
				System.out.print("error");
				return 0;
			}
			if (d2.charAt(i) != 'A' && d2.charAt(i) != 'T' && d2.charAt(i) != 'C' && d2.charAt(i) != 'G')
			{
				System.out.print("error");
				return 0;
			}
			if (d1.charAt(i) == d2.charAt(i))
			{
				x++;
			}
		}
		if (1.0 * x / l1 > b)
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

