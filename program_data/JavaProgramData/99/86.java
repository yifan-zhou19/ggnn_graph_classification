package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int i;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				t = Integer.parseInt(tempVar2);
			}
			if (t <= 18)
			{
				a++;
			}
			else if (t >= 19 && t <= 35)
			{
				b++;
			}
			else if (t >= 36 && t <= 60)
			{
				c++;
			}
			else if (t >= 61)
			{
				d++;
			}
		}
		System.out.printf("1-18: %.2lf%%\n19-35: %.2lf%%\n36-60: %.2lf%%\n60??: %.2lf%%\n",(double)a / (double)n * 100,(double)b / (double)n * 100,(double)c / (double)n * 100,(double)d / (double)n * 100);
	}



}

