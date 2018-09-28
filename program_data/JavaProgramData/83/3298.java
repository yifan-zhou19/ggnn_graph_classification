package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int score;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		double[] b = new double[n];
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				score = Integer.parseInt(tempVar3);
			}
			if (score >= 90)
			{
				b[i] = 4.0;
			}
			else if (score >= 85)
			{
				b[i] = 3.7;
			}
			else if (score >= 82)
			{
				b[i] = 3.3;
			}
			else if (score >= 78)
			{
				b[i] = 3.0;
			}
			else if (score >= 75)
			{
				b[i] = 2.7;
			}
			else if (score >= 72)
			{
				b[i] = 2.3;
			}
			else if (score >= 68)
			{
				b[i] = 2.0;
			}
			else if (score >= 64)
			{
				b[i] = 1.5;
			}
			else if (score >= 60)
			{
				b[i] = 1.0;
			}
			else
			{
				b[i] = 0;
			}
		}
		double sum;
		int x;
		sum = 0;
		x = 0;
		for (i = 0;i < n;i++)
		{
			sum = sum + a[i] * b[i];
			x = x + a[i];
		}
		double ave;
		ave = sum / x;
		System.out.printf("%.2lf",ave);
		return 0;
	}

}

