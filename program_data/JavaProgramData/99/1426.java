package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			int nian;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				nian = Integer.parseInt(tempVar2);
			}
			a += (nian <= 18)? 1:0;
			b += (nian <= 35 && nian >= 19)? 1:0;
			c += (nian <= 60 && nian >= 36)? 1:0;
			d += (nian >= 61)? 1:0;
		}
		int zong = a + b + c + d;
		System.out.printf("1-18: %.2lf%%\n",1.0 * 100 * a / zong);
		System.out.printf("19-35: %.2lf%%\n",1.0 * 100 * b / zong);
		System.out.printf("36-60: %.2lf%%\n",1.0 * 100 * c / zong);
		System.out.printf("60??: %.2lf%%\n",1.0 * 100 * d / zong);
		return 0;
	}
}

