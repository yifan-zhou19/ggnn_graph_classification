package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		double a = 0.00;
		double b = 0.00;
		double c = 0.00;
		double d = 0.00;
		int[] p = new int[100];
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
				p[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (1 <= p[i] != 0 && p[i] <= 18)
			{
				a++;
			}
			if (19 <= p[i] != 0 && p[i] <= 35)
			{
				b++;
			}
			if (36 <= p[i] != 0 && p[i] <= 60)
			{
				c++;
			}
			if (61 <= p[i] != 0 && p[i] < 120)
			{
				d++;
			}
		}
	   System.out.printf("1-18: %.2lf%%\n",a / n * 100);
		System.out.printf("19-35: %.2lf%%\n",b / n * 100);
		 System.out.printf("36-60: %.2lf%%\n",c / n * 100);
		System.out.printf("60??: %.2lf%%\n",d / n * 100);
		return 0;
	}
}

