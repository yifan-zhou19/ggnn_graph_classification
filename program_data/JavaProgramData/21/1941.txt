package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int s = 0;
		int j = 0;
		int t;
		int k;
		int[] a = new int[301];
		int[] c = new int[300];
		float[] b = new float[301];
		float average;
		float max;
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
			s = s + a[i];
		}
		average = (float)s / n;
		for (i = 0;i < n;i++)
		{
			if ((float)a[i] < average)
			{
				b[i] = average - (float)a[i];
			}
			else
			{
				b[i] = (float)a[i] - average;
			}
		}
		max = b[0];
		for (i = 1;i < n;i++)
		{
			if (max < b[i])
			{
				max = b[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] == max)
			{
				c[j] = a[i];
				j++;
			}
		}
		if (j == 1)
		{
			System.out.printf("%d",c[0]);
		}
		else
		{
			for (k = 1;k <= j - 1;k++)
			{
				for (i = 0;i <= j - k - 1;i++)
				{
					if (c[i] > c[i + 1])
					{
						t = c[i];
						c[i] = c[i + 1];
						c[i + 1] = t;
					}
				}
			}
			for (i = 0;i <= j - 2;i++)
			{
				System.out.printf("%d,",c[i]);
			}
			System.out.printf("%d\n",c[j - 1]);
		}
	}


}

