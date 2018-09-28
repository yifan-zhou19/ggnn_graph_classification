package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[50000];
		int[] b = new int[50000];
		int[] c = new int[50000];
		int i;
		int t;
		int temp;
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
				(a[i]) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(b[i]) = Integer.parseInt(tempVar3);
			}


		}
		for (i = 0;i < n;i++)
		{
			c[i] = b[i];
		}

		for (i = 0;i < n;i++)
		{
			for (t = n - 1;t > 0;t--)
			{
				if (a[t] < a[t - 1])
				{
					temp = a[t];
					a[t] = a[t - 1];
					a[t - 1] = temp;
					temp = b[t];
					b[t] = b[t - 1];
					b[t - 1] = temp;
				}
			}
		}
			for (i = 0;i < n;i++)
			{
			for (t = n - 1;t > 0;t--)
			{
				if (c[t] < c[t - 1])
				{
					temp = c[t];
					c[t] = c[t - 1];
					c[t - 1] = temp;

				}
			}
			}
			for (temp = a[0];temp < b[n - 1];temp++)
			{
			for (i = 0;i < n;i++)
			{
				if (temp + 0.5 < b[i] * 1.0 && temp + 0.5> a[i] * 1.0)
				{
					sum++;
					break;
				}
			}
			}
	if (sum == b[n - 1] - a[0])
	{
			System.out.printf("%d %d",a[0],c[n - 1]);
	}
		else
		{
			System.out.print("no");
		}


		return 0;
	}
}

