package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[301];
		int i;
		int j;
		double aver = 0;
		double t = 0;
		int u = 0;
		int[] b = new int[301];
		int tem = 0;

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
			aver += a[i];
		}

		aver = aver / n;

		for (i = 0;i < n;i++)
		{
			if (aver - a[i] > t || a[i] - aver > t)
			{
				t = aver - a[i];
				j = i;
				if (t < 0)
				{
					t = 0 - t;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (aver - a[i] - t < 0.001 && a[i] + t - aver < 0.001)
			{
				b[u] = a[i];
				u++;
			}
			if (a[i] - aver - t < 0.001 && aver + t - a[i] < 0.001)
			{
				b[u] = a[i];
				u++;
			}

		}
		for (i = u;i > 0;i--)
		{
			for (j = 0;j < i - 1;j++)
			{
				if (b[j] > b[j + 1])
				{
					int t = b[j];
					b[j] = b[j + 1];
					b[j + 1] = t;
				}
			}
		}

		for (i = 0;i < u;i++)
		{
			if (tem == 0)
			{
				System.out.printf("%d",b[i]);
				tem = 1;
			}
			else
			{
				System.out.printf(",%d",b[i]);
			}
		}

	}
}

