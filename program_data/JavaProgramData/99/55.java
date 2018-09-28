package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int[] a = new int[100];
		int[] sum = new int[4];
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
			if (a[i] <= 18)
			{
				 sum[0]++;
			}
			 else if (a[i] >= 19 && a[i] <= 35)
			 {
				 sum[1]++;
			 }
			 else if (a[i] > 35 && a[i] <= 60)
			 {
				 sum[2]++;
			 }
			 else if (a[i] > 60)
			 {
				 sum[3]++;
			 }
		}

		System.out.printf("1-18: %.2f%%\n",(float)100 * sum[0] / n);
		System.out.printf("19-35: %.2f%%\n",(float)100 * sum[1] / n);
		System.out.printf("36-60: %.2f%%\n",(float)100 * sum[2] / n);
		System.out.printf("60??: %.2f%%\n",(float)100 * sum[3] / n);
	}
}

