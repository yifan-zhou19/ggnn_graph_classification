package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int t;
		int x;
		int[] a = new int[1000];
		int[] b = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		float s = 0F;
		for (i = 1;i <= n;i++)
		{
			s = s + a[i];
		}
		s = s / n;
		float max = 0F;
		for (i = 1;i <= n;i++)
		{
			if (Math.abs(a[i] - s) > max)
			{
			  max = Math.abs(a[i] - s);
			  t = 1;
			  b[t] = a[i];
			  continue;
			}
			if (Math.abs(a[i] - s) == max)
			{
			  t++;
			  b[t] = a[i];
			}
		}
		for (i = 1;i <= t - 1;i++)
		{
		for (j = i + 1;j <= t;j++)
		{
		if (b[i] > b[j])
		{
		  x = b[i];
		  b[i] = b[j];
		  b[j] = x;
		}
		}
		}
		for (i = 1;i <= t - 1;i++)
		{
			System.out.printf("%d,",b[i]);
		}
		System.out.printf("%d",b[t]);

	}

}

