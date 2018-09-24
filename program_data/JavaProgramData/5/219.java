package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int z = 0;
		int e = 0;
		int k = 0;
		double v;
		String x = new String(new char[501]);
		String y = new String(new char[501]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			v = Double.parseDouble(tempVar);
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
		for (i = 0;x.charAt(i);i++)
		{
			z++;
			if (!(x.charAt(i) == 'A' || x.charAt(i) == 'T' || x.charAt(i) == 'G' || x.charAt(i) == 'C'))
			{
				System.out.print("error");
				return 0;
			}
		}
		for (i = 0;y.charAt(i);i++)
		{
			e++;
			if (!(y.charAt(i) == 'A' || y.charAt(i) == 'T' || y.charAt(i) == 'G' || y.charAt(i) == 'C'))
			{
				System.out.print("error");
				return 0;
			}
		}
		if (z != e)
		{
			System.out.print("error");
			return 0;
		}
		for (i = 0;x.charAt(i);i++)
		{
			if (x.charAt(i) == y.charAt(i))
			{
				k++;
			}
		}
		if (1.0 * k / z > v)
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

