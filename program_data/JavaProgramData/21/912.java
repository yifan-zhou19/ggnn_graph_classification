package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int s = 0;
		int k;
		int[] a = new int[10000];
		int[] b = new int[10000];
		double x = 0;
		double t;
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
			x = x + a[i];
		}
		x = x / n;
		t = Math.abs(x - a[0]);
		for (i = 0;i < n;i++)
		{
			if (Math.abs(x - a[i]) > t)
			{
				t = Math.abs(x - a[i]);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (Math.abs(x - a[i]) <= t + 0.000001 && Math.abs(x - a[i]) >= t - 0.000001)
			{
			   b[s] = a[i];
			   s = s + 1;
			}
		}
		for (i = 0;i < s - 1;i++)
		{
			for (j = 0;j < s - 1 - i;j++)
			{
				if (b[j] > b[j + 1])
				{
					k = b[j];
					b[j] = b[j + 1];
					b[j + 1] = k;
				}
			}
		}
		for (i = 0;i < s;i++)
		{
			if (i == 0)
			{
				System.out.printf("%d",b[i]);
			}
			else
			{
				System.out.printf(",%d",b[i]);
			}
		}
		return 0;
	}


}

