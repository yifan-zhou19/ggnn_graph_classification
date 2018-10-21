package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[100];
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		double o;
		double t;
		double e;
		double f;
		int zong;
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] <= 18)
			{
				one = one+1;
			}
			else if (a[i] > 18 && a[i] < 36)
			{
				two = two + 1;
			}
			else if (a[i] >= 36 && a[i] <= 60)
			{
				three = three+1;
			}
			else if (a[i] >= 61)
			{
				four = four + 1;
			}
		}
		zong = one + two + three + four;
		o = 100.0 * one / zong;
		t = 100.0 * two / zong;
		e = 100.0 * three / zong;
		f = 100.0 * four / zong;
		System.out.printf("1-18: %.2lf%%\n",o);
		System.out.printf("19-35: %.2lf%%\n",t);
		System.out.printf("36-60: %.2lf%%\n",e);
		System.out.printf("60??: %.2lf%%\n",f);
		return 0;
	}
}

