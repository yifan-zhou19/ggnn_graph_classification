package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] s = new int[100];
		int i = 0;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		double pa;
		double pb;
		double pc;
		double pd;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(s[i]) = Integer.parseInt(tempVar2);
			}
			if (s[i] >= 1 && s[i] <= 18)
			{
				a += 1;
			}
			else if (s[i] > 18 && s[i] < 36)
			{
				b += 1;
			}
			else if (s[i] > 35 && s[i] <= 60)
			{
				c += 1;
			}
			else if (s[i] > 60)
			{
				d += 1;
			}
		}
		pa = 1.0 * 100 * a / n;
		pb = 1.0 * 100 * b / n;
		pc = 1.0 * 100 * c / n;
		pd = 1.0 * 100 * d / n;
		System.out.printf("1-18: %.2lf%%\n",pa);
		System.out.printf("19-35: %.2lf%%\n",pb);
		System.out.printf("36-60: %.2lf%%\n",pc);
		System.out.printf("60??: %.2lf%%",pd);
		return 0;
	}
}

