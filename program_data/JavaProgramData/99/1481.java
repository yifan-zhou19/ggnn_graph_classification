package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int x;
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
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x = Integer.parseInt(tempVar2);
			}
			if (x <= 18)
			{
				a++;
			}
			else if (x >= 19 && x <= 35)
			{
				b++;
			}
			else if (x >= 36 && x <= 60)
			{
				c++;
			}
			else if (x >= 61)
			{
				d++;
			}
		}
		System.out.printf("1-18: %.2lf%%\n",(double)100 * a / n);
		System.out.printf("19-35: %.2lf%%\n",(double)100 * b / n);
		System.out.printf("36-60: %.2lf%%\n",(double)100 * c / n);
		System.out.printf("60??: %.2lf%%\n",(double)100 * d / n);

	}


}

