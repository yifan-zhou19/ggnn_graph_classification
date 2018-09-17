package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] h = new int[25];
		int[] d = new int[25];
		int i;
		int j;
		int max;
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
				h[i] = Integer.parseInt(tempVar2);
			}
		}
		d[n - 1] = 1;
		for (i = n - 2;i >= 0;i--)
		{
			d[i] = 1;
			for (j = i + 1;j < n;j++)
			{
				if (d[j] + 1 > d[i] && h[j] <= h[i])
				{
					d[i] = d[j] + 1;
				}
			}
		}
		max = d[0];
		for (i = 0;i < n;i++)
		{
			if (d[i] > max)
			{
				max = d[i];
			}
		}
		System.out.printf("%d",max);
	}
}

