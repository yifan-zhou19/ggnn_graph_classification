package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		int i;
		int j;
		int s;
		int c;
		int k;
		int[] sum = new int[1000];
		int s0 = 0;
		int qqq;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
		sum[i] = 0;
		for (j = 1;j <= n;j++)
		{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[j] = Integer.parseInt(tempVar2);
				}
			if (a[j] == 0)
			{
				s0++;
			}
			sum[i] = sum[i] + a[j];
		}
			if (i == 1)
			{
			qqq = sum[1];
			}
			else
			{
			if (sum[i - 1] > sum[i])
			{
			qqq = sum[i];
			}
			}
		}
		k = n - qqq / 255;
		c = (s0 + 4 - 2 * k) / 2;
		s = (c - 2) * (k - 2);
		System.out.printf("%d",s);
		return 0;
	}
}

