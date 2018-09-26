package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int[] a = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int s1 = 0;
		int s2 = 0;
		int s3 = 0;
		int s4 = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			if ((a[i] >= 1) && (a[i] <= 18))
			{
				s1++;
			}
			else if ((a[i] >= 19) && (a[i] <= 35))
			{
				s2++;
			}
			else if ((a[i] >= 36) && (a[i] <= 60))
			{
				s3++;
			}
			else
			{
				s4++;
			}
		}
		int S;
		S = s1 + s2 + s3 + s4;
		System.out.printf("1-18: %.2lf%%\n",(double)s1 * 100 / S);
		System.out.printf("19-35: %.2lf%%\n",(double)s2 * 100 / S);
		System.out.printf("36-60: %.2lf%%\n",(double)s3 * 100 / S);
		System.out.printf("60??: %.2lf%%\n",(double)s4 * 100 / S);
	}


}

