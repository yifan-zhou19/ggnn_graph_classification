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
		int max;
		int temp;
		int sum = 0;
		int[] a = new int[300];
		int[] b = new int[300];
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
		for (i = 0;i < n;i++)
		{
			sum = sum + a[i];
		}
		if ((a[0] * n) > sum)
		{
			max = a[0] * n - sum;
		}
		else if ((a[0] * n) < sum)
		{
			max = sum - a[0] * n;
		}
		for (i = 1;i < n;i++)
		{
			if (((a[i] * n) > sum) && (((a[i] * n) - sum) > max))
			{
		max = a[i] * n - sum;
			}
		else if (((a[i] * n) < sum) && ((sum - (a[i] * n))> max))
		{
			max = sum - a[i] * n;
		}
		}
		j = 0;
		for (i = 0;i < n;i++)
		{
			if (((a[i] * n - sum) == max) || ((sum - (a[i] * n)) == max))
			{
				b[j] = a[i];
				j++;
			}
		}
			k = j;
			for (j = 0;j < k;j++)
			{
				i = j;
				for (t = j + 1;t <= k;t++)
				{
					if (b[i] > b[t])
					{
						i = t;
					}
				}
					if (i != j)
					{
						temp = b[i];
					b[i] = b[j];
					b[j] = temp;
					}
			}
			for (j = 1;j < k;j++)
			{
				System.out.printf("%d,",b[j]);
			}
			System.out.printf("%d",b[k]);
	}
}

