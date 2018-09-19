package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		int max;
		int min;
		int temp;
		int[] a = new int[300];
		float ave;
		int sum = 0;
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
		ave = sum * 1.0 / n;
	/*	printf("%d %f",sum,ave);*/
		for (i = 0;i < n;i++)
		{
			for (j = n - 1;j > i;j--)
			{
				if (a[j] > a[j - 1])
				{
					temp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = temp;
				}
			}
		}
		/*for(i=0;i<n;i++)
		{
			printf("%d",a[i]);
		}*/
		max = a[0];
		min = a[n - 1];
		if (max - ave > ave - min)
		{

		for (i = n - 1;i >= 0;i--)
		{
				if (a[i] == max)
				{
					System.out.printf("%d",a[i]);
					k = i - 1;
					break;
				}
		}
			for (i = k;i >= 0;i--)
			{
				if (a[i] == max)
				{
					System.out.printf(",%d",a[i]);

				}
			}

		}

		if (max - ave < ave - min)
		{
			for (i = n - 1;i >= 0;i--)
			{
				if (a[i] == min)
				{
					System.out.printf("%d",a[i]);
					k = i - 1;
					break;
				}
			}
			for (i = k;i >= 0;i--)
			{
				if (a[i] == min)
				{
					System.out.printf(",%d",a[i]);

				}
			}
		}
		if ((max - ave - ave + min < 0.00001) && (max - ave - ave + min>-0.000001))
		{
				for (i = n - 1;i >= 0;i--)
				{
				if (a[i] == min || a[i] == max)
				{
					System.out.printf("%d",a[i]);
					k = i - 1;
					break;
				}
				}
			for (i = k;i >= 0;i--)
			{
				if (a[i] == min || a[i] == max)
				{
					System.out.printf(",%d",a[i]);

				}
			}
		}
	}





}

