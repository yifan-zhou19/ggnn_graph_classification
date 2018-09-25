package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int[] a = new int[300];
		int avg = 0;
		int maxn = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			a[i] *= 100;
			avg += a[i];
		}
		avg /= n;
		for (i = 0; i < n; i++)
		{
			if (maxn < (a[i]> avg != 0?a[i] - avg:avg - a[i]))
			{
				maxn = a[i] > avg != 0?a[i] - avg:avg - a[i];
			}
		}
		for (i = 0; i < n; i++)
		{
			if ((a[i] > avg != 0?a[i] - avg:avg - a[i]) == maxn)
			{
				System.out.printf("%d", a[i] / 100);
				break;
			}
		}
		for (i = i + 1; i < n; i++)
		{
			if ((a[i] > avg != 0?a[i] - avg:avg - a[i]) == maxn)
			{
				System.out.printf(",%d", a[i] / 100);
			}
		}
		return 0;
	}

}

