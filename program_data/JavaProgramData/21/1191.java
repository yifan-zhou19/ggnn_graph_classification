package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int t;
		int m;
		int c = 0;
		int sum = 0;
		int ave;

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
			sum = sum + a[i];
		}
		ave = sum / n;
		for (i = 0;i < n;i++)
		{
			b[i] = Math.abs(a[i] * n - sum);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n - i - 1;j++)
			{
				if (b[j] < b[j + 1])
				{
					t = b[j];
					b[j] = b[j + 1];
					b[j + 1] = t;
					m = a[j];
					a[j] = a[j + 1];
					a[j + 1] = m;
				}
			}
		}
		for (i = 0;i < n && b[i] == b[i + 1];i++)
		{
			if (b[i] == b[i + 1])
			{
					c++;
			}
		}
		for (i = 0;i < c;i++)
		{
			for (j = 0;j < c - i - 1;j++)
			{
				if (a[j] > a[j + 1])
				{
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
		for (i = 0;i <= c;i++)
		{
			if (i == 0)
			{
			System.out.printf("%d",a[i]);
			}
			else
			{
			System.out.printf(",%d",a[i]);
			}
		}
		return 0;
	}
}

