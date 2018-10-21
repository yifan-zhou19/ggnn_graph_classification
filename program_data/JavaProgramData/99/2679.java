package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] p = new int[100];
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int i;
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
			if (p[i] <= 18)
			{
				a++;
			}
			else if (p[i] >= 19 && p[i] <= 35)
			{
				b++;
			}
			else if (p[i] >= 36 && p[i] <= 60)
			{
				c++;
			}
			else
			{
				d++;
			}
		}
		System.out.printf("1-18: %.2lf%%\n",(double)a / n * 100);
		System.out.printf("19-35: %.2lf%%\n",(double)b / n * 100);
		System.out.printf("36-60: %.2lf%%\n",(double)c / n * 100);
		System.out.printf("60??: %.2lf%%\n",(double)d / n * 100);
		return 0;
	}
}

