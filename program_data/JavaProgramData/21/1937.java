package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[301];
		int i;
		int j;
		int n;
		int sum = 0;
		int max;
		int temp;
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
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j <= n - 1;j++)
			{
				if (a[j] < a[i])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		if ((a[0] + a[n - 1]) * n == sum * 2)
		{
			System.out.printf("%d,%d\n",a[0],a[n - 1]);
		}
		else if ((a[0] + a[n - 1]) * n < sum * 2)
		{
			System.out.printf("%d\n",a[0]);
		}
		else if ((a[0] + a[n - 1]) * n > sum * 2)
		{
			System.out.printf("%d\n",a[n - 1]);
		}
	}



}

