package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		float sum;
		int[] a = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		int r = 0;
		while (r < m)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		int i = 0;
		while (i <= n)
		{
		if (i == 0)
		{
		a[i] = 1;
		}
		else if (i == 1)
		{
		a[i] = 2;
		sum = 1.0 * a[1] / a[0];
		}
		else
		{
		a[i] = a[i - 1] + a[i - 2];
		sum += 1.0 * a[i] / a[i - 1];
		}
		i++;
		}
		System.out.printf("%.3f\n",sum);
		r++;
		}
		return 0;
	}
}

