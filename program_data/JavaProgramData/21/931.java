package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k = 1;
		float[] a = new float[400];
		float[] b = new float[400];
		float ave;
		float sum = 0F;
		float max = 0F;
		float t;
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
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - 1 - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			sum += a[i];
		}
		ave = sum / n;
		for (i = 0;i < n;i++)
		{
			if (a[i] >= ave)
			{
				b[i] = a[i] - ave;
			}
			else
			{
				b[i] = ave - a[i];
			}
			max = (max > b[i])?max:b[i];
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] == max)
			{
				if (k != 0)
				{
					System.out.printf("%.0f",a[i]);
					k = 0;
				}
				else
				{
					System.out.printf(",%.0f",a[i]);
				}
			}
		}
	}


}

