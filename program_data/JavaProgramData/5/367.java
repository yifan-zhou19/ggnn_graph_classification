package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int i;
		double k;
		double c = 0;
		String d = new String(new char[501]);
		String e = new String(new char[501]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			d = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			e = tempVar3.charAt(0);
		}
		a = d.length();
		b = e.length();
		if (a > b || a < b)
		{
			System.out.print("error");
			return 0;
		}
		for (i = 0;i < a;i++)
		{
			if (d.charAt(i) != 'A' && d.charAt(i) != 'C' && d.charAt(i) != 'G' && d.charAt(i) != 'T')
			{
				System.out.print("error");
				return 0;
			}
		}
		for (i = 0;i < b;i++)
		{
			if (e.charAt(i) != 'A' && e.charAt(i) != 'C' && e.charAt(i) != 'G' && e.charAt(i) != 'T')
			{
				System.out.print("error");
				return 0;
			}
		}
		for (i = 0;i < a;i++)
		{
			if (d.charAt(i) == e.charAt(i))
			{
				c++;
			}
		}
		if ((c / (1.0 * a)) > k)
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

