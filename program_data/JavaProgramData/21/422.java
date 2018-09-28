package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int t;
		int[] a = new int[300];
		int sum = 0;
		int s = 0;
		float average;
		float[] b = new float[300];
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
		}
		for (i = 0;i < n - 1;i++) //????
		{
			k = i;
			for (j = i + 1;j < n;j++)
			{
				if (a[k] > a[j])
				{
					k = j;
				}
			}
			if (k != i)
			{
				t = a[i];
				a[i] = a[k];
				a[k] = t;
			}
		}
		for (i = 0;i < n;i++)
		{
			sum = sum + a[i];
		}
		average = (float)sum / n;
		for (i = 0;i < n;i++)
		{
			if (a[i] - average > 0F)
			{
				b[i] = a[i] - average;
			}
			else if (a[i] - average <= 0F)
			{
				b[i] = average - a[i];
			}
		}
		for (i = 1,max = b[0],k = 1;i < n;i++)
		{
			if (b[i] >= max)
			{
				max = b[i];
				k = k + 1;
			}
		}
		if (k == 1)
		{
			for (i = 0;i < n;i++)
			{
				if (max == b[i])
				{
					System.out.printf("%d\n",a[i]);
				}
			}
		}
		else if (k > 1)
		{
			for (i = 0,s = 0;i < n;i++)
			{
				if (max == b[i])
				{
					if (s == 0)
					{
						System.out.printf("%d",a[i]);
						s++;
					}
					else if (s != 0)
					{
						System.out.printf(",%d",a[i]);
					}
				}
			}
		}
	}
}

