package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a1 = 0;
		int a2 = 0;
		int a3 = 0;
		int a4 = 0;
		int i;
		int n;
		int m;
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
				m = Integer.parseInt(tempVar2);
			}
			if (m <= 18 && m >= 1)
			{
				a1++;
			}
			else if (m >= 19 && m <= 35)
			{
				a2++;
			}
			else if (m >= 36 && m <= 60)
			{
				a3++;
			}
			else if (m >= 61 && m <= 100)
			{
				a4++;
			}
		}
		System.out.printf("1-18: %.2lf%%\n",(double)a1 / n * 100);
		System.out.printf("19-35: %.2lf%%\n",(double)a2 / n * 100);
		System.out.printf("36-60: %.2lf%%\n",(double)a3 / n * 100);
		System.out.printf("60??: %.2lf%%\n",(double)a4 / n * 100);
		return 0;
	}


}

