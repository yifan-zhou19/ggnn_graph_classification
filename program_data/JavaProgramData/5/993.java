package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int l1;
		int l2;
		int k;
		n = 0;
		k = 1;
		double s;
		String x1 = new String(new char[501]);
		String x2 = new String(new char[501]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = Double.parseDouble(tempVar);
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
		l1 = x1.length();
		l2 = x2.length();
		if (l1 != l2)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < l1;i++)
			{
				if (!(x1.charAt(i) == 'A' || x1.charAt(i) == 'C' || x1.charAt(i) == 'G' || x1.charAt(i) == 'T'))
				{
					System.out.print("error");
					k = 0;
					break;
				}
				if (!(x2.charAt(i) == 'A' || x2.charAt(i) == 'C' || x2.charAt(i) == 'G' || x2.charAt(i) == 'T'))
				{
					System.out.print("error");
					k = 0;
					break;
				}
				if (x1.charAt(i) == x2.charAt(i))
				{
					n++;
				}
			}
			if (k != 0)
			{
				if (1.0 * n / l1 > s)
				{
					System.out.print("yes");
				}
				else
				{
					System.out.print("no");
				}
			}
		}
		return 0;
	}
}

