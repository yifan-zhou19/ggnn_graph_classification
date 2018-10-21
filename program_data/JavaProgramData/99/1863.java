package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int tmp;
		int i;
		int s1 = 0;
		int s2 = 0;
		int s3 = 0;
		int s4 = 0;
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
				tmp = Integer.parseInt(tempVar2);
			}
			if (tmp >= 1 && tmp <= 18)
			{
			 s1++;
			}
			else if (tmp >= 19 && tmp <= 35)
			{
				s2++;
			}
			else if (tmp >= 36 && tmp <= 60)
			{
				s3++;
			}
			else if (tmp >= 61)
			{
				s4++;
			}
		}
		int s;
		s = s1 + s2 + s3 + s4;
		System.out.printf("1-18: %.2lf%%\n",(double)100 * s1 / s);
		System.out.printf("19-35: %.2lf%%\n",(double)100 * s2 / s);
		System.out.printf("36-60: %.2lf%%\n",(double)100 * s3 / s);
		System.out.printf("60??: %.2lf%%",(double)100 * s4 / s);
		   return 0;
	}
}

