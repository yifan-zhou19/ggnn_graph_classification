package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		double[] rate = new double[4];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] age = new int[n];

		for (i = 0;i < n;i++)
		{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					(age[i]) = Integer.parseInt(tempVar2);
				}
		}
		for (i = 0;i < n;i++)
		{
			if (age[i] <= 18)
			{
				a++;
			}
			if (age[i] >= 19 && age[i] <= 35)
			{
				b++;
			}
			if (age[i] >= 36 && age[i] <= 60)
			{
				c++;
			}
			if (age[i] >= 61)
			{
				d++;
			}
		}
		rate[0] = (double)a / (double)n * 100;
		rate[1] = (double)b / (double)n * 100;
		rate[2] = (double)c / (double)n * 100;
		rate[3] = (double)d / (double)n * 100;
		System.out.printf("1-18: %.2lf%%\n",rate[0]);
		System.out.printf("19-35: %.2lf%%\n",rate[1]);
		System.out.printf("36-60: %.2lf%%\n",rate[2]);
		System.out.printf("60??: %.2lf%%\n",rate[3]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(age);
		return 0;
	}
}

