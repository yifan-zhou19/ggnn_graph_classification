package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[] age = new int[101];
		int i;
		int n;
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int sum4 = 0;
		double p1;
		double p2;
		double p3;
		double p4;
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
				age[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (age[i] >= 1 && age[i] <= 18)
			{
				sum1++;
			}
			if (age[i] > 18 && age[i] <= 35)
			{
				sum2++;
			}
			if (age[i] > 35 && age[i] <= 60)
			{
				sum3++;
			}
			if (age[i] > 60)
			{
				sum4++;
			}
		}
		p1 = 100 * (float)sum1 / (float)n;
		p2 = 100 * (float)sum2 / (float)n;
		p3 = 100 * (float)sum3 / (float)n;
		p4 = 100 * (float)sum4 / (float)n;
		System.out.printf("1-18: %.2f%%\n",p1);
		System.out.printf("19-35: %.2f%%\n",p2);
		System.out.printf("36-60: %.2f%%\n",p3);
		System.out.printf("60??: %.2f%%",p4);
	}
}

