package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float[] a = new float[300];
		int n;
		int i;
		int j;
		int k;
		float average;
		float c;
		float sum = 0F;
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
			sum = sum + a[i];
		}
		for (j = 0;j < n - 1;j++)
		{
			for (k = 0;k < n - 1 - j;k++)
			{
				if (a[k] > a[k + 1])
				{
					c = a[k];
					a[k] = a[k + 1];
					a[k + 1] = c;
				}
			}
		}
		average = sum / (float)n;
		if (average - a[0] > a[n - 1] - average)
		{
			System.out.printf("%g",a[0]);
		}
		if (average - a[0] == a[n - 1] - average)
		{
			System.out.printf("%g,%g",a[0],a[n - 1]);
		}
		if (average - a[0] < a[n - 1] - average)
		{
			System.out.printf("%g",a[n - 1]);
		}
		return 0;
	}

}

