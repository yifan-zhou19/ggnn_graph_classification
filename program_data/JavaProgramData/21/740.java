package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[300];
		float[] b = new float[300];
		int[] c = new int[300];
		int t = 0;
		int sum = 0;
		int temp;
		float ave;
		float max = 0F;
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
			sum = sum + a[i];
		}
		ave = (float)sum / n;
		for (i = 0;i < n;i++)
		{
			if (a[i] - ave >= 0F)
			{
				b[i] = a[i] - ave;
			}
			else
			{
				b[i] = ave - a[i];
			}
			if (b[i] > max)
			{
				max = b[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] == max)
			{
				c[t] = a[i];
				t++;
			}
		}
		for (i = 1;i < t;i++)
		{
			for (j = 0;j < t - i;j++)
			{
				if (c[j] > c[j + 1])
				{
					temp = c[j];
					c[j] = c[j + 1];
					c[j + 1] = temp;
				}
			}
		}
		for (i = 0;i < t - 1;i++)
		{
			System.out.printf("%d,",c[i]);
		}
		System.out.printf("%d",c[t - 1]);
		return 0;
	}




}

