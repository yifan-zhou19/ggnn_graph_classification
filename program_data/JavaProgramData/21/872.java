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
		float aver;
		float k1;
		float k2;
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
		}
		System.out.print("\n");
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
			sum = sum + a[i];
		}
		aver = (float)sum / (float)n;
		k1 = aver - a[0];
		k2 = a[n - 1] - aver;
			if (k1 < k2)
			{
				System.out.printf("%d",a[n - 1]);
			}
			if (k1 > k2)
			{
				System.out.printf("%d",a[0]);
			}
			if (k1 == k2)
			{
				System.out.printf("%d,%d",a[0],a[n - 1]);
			}
	}
}

