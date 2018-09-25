package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int e;
		int k;
		int d;
		int f;
		int hours;
		int[][] sz = new int[100][2];
		int[] a = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (e = 0;e < 2;e++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					sz[i][e] = Integer.parseInt(tempVar2);
				}
			}
		}
		hours = 0;
		for (i = 0;i < n;i++)
		{
			if (sz[i][0] >= 90 && sz[i][0] <= 140 && sz[i][1] >= 60 && sz[i][1] <= 90)
			{
				a[hours]++;
			}
			else
			{
				hours++;
			}
		}
		for (k = 1;k <= hours;k++)
		{
			for (d = 0;d <= hours - k;d++)
			{
				if (a[d] > a[d + 1])
				{
					f = a[d + 1];
					a[d + 1] = a[d];
					a[d] = f;
				}
			}
		}
		System.out.printf("%d",a[hours]);
		return 0;

	}
}

