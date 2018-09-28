package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Double.parseDouble(tempVar);
		}
		String x = new String(new char[1000]);
		String y = new String(new char[1000]);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			y = tempVar3.charAt(0);
		}
		int l = x.length();
		int k = 0;
		int o = y.length();
		if (l != o)
		{
			System.out.print("error");
			return 0;
		}
		for (int i = 0;i < l;i++)
		{
			if (!(x.charAt(i) == 'A' || x.charAt(i) == 'T' || x.charAt(i) == 'G' || x.charAt(i) == 'C'))
			{
				System.out.print("error");
				return 0;
			}
			if (!(y.charAt(i) == 'A' || y.charAt(i) == 'T' || y.charAt(i) == 'G' || y.charAt(i) == 'C'))
			{
				System.out.print("error");
				return 0;
			}
			if (x.charAt(i) == y.charAt(i))
			{
				k++;
			}
		}
		if (1.0 * k / l > a)
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

