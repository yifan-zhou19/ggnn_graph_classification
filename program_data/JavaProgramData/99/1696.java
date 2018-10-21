package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		float zu1 = 0F;
		float zu2 = 0F;
		float zu3 = 0F;
		float zu4 = 0F;
		float[] a = new float[10000];
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
			a[i] = Float.parseFloat(tempVar2);
		}
		}

	for (i = 0;i < n;i++)
	{
		if (a[i] > 0F && a[i] <= 18F)
		{
		zu1 += 1;
		}
		if (a[i] > 18F && a[i] <= 35F)
		{
		zu2 += 1;
		}
		if (a[i] > 35F && a[i] <= 60F)
		{
		zu3 += 1;
		}
		if (a[i] > 60F)
		{
		zu4 += 1;
		}
	}
	System.out.printf("1-18: %.2f%%\n",zu1 / n * 100);
	System.out.printf("19-35: %.2f%%\n",zu2 / n * 100);
	System.out.printf("36-60: %.2f%%\n",zu3 / n * 100);
	System.out.printf("60??: %.2f%%\n",zu4 / n * 100);
	return 0;
	}
}

