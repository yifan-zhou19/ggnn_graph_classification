package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int t;
		int sum = 0;
		int max = 0;
		int s = 0;
		int[] a = new int[300];
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
		for (i = 0;i < n;i++)
		{
			if (a[i] * n - sum >= 0)
			{
				if (a[i] * n - sum > max)
				{
					max = a[i] * n - sum;
				}
			}
			else
			{
				if (sum - a[i] * n > max)
				{
					max = sum - a[i] * n;
				}
			}
		}
		for (j = 0;j < n - 1;j++)
		{
			for (i = 0;i < n - 1 - j;i++)
			{
				if (a[i] > a[i + 1])
				{
					t = a[i];
					a[i] = a[i + 1];
					a[i + 1] = t;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] * n - sum == max || sum - a[i] * n == max)
			{
				if (s == 0)
				{
					System.out.printf("%d",a[i]);
				}
				else
				{
					System.out.printf(",%d",a[i]);
				}
				s++;
			}
		}
	}
}

