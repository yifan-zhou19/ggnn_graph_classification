package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int n;
		int[] a = new int[100];
		double b1 = 0;
		double b2 = 0;
		double b3 = 0;
		double b4 = 0;
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
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] > 0 && a[i] <= 18)
			{
				b1++;
			}
			else if (a[i] >= 19 && a[i] <= 35)
			{
				b2++;
			}
			else if (a[i] >= 36 && a[i] <= 60)
			{
				b3++;
			}
			else
			{
				b4++;
			}
		}
		System.out.printf("1-18: %.2lf%%\n",100 * b1 / n);
		System.out.printf("19-35: %.2lf%%\n",100 * b2 / n);
		System.out.printf("36-60: %.2lf%%\n",100 * b3 / n);
		System.out.printf("60??: %.2lf%%\n",100 * b4 / n);
	}




}

