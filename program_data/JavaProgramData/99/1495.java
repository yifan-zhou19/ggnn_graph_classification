package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[100];
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int sum4 = 0;
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
				a[i] = Integer.parseInt(tempVar2);
			}

				if (a[i] <= 18)
				{
				sum1 += 1;
				}
			else if (a[i] <= 35)
			{
			sum2 += 1;
			}
			else if (a[i] <= 60)
			{
				sum3 += 1;
			}
			else
			{
				sum4 += 1;
			}
		}
		System.out.printf("1-18: %.2f%%\n",(float)sum1 / n * 100);
		System.out.printf("19-35: %.2f%%\n",(float)sum2 / n * 100);
		System.out.printf("36-60: %.2f%%\n",(float)sum3 / n * 100);
		System.out.printf("60??: %.2f%%\n",(float)sum4 / n * 100);
		return 0;
	}

}

