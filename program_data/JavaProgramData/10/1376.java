package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		int i;
		int j;
		int max;
		int[] d = new int[30];
		int[] h = new int[30];
		d[0] = 0;
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
				h[i] = Integer.parseInt(tempVar2);
			}
		}
		h[0] = 2147483647;
		for (i = 1;i <= n;i++)
		{
			max = 0;
			for (j = 0;j < i;j++)
			{
				if (h[i] <= h[j] != 0 && (d[j] + 1)> max)
				{
				max = d[j] + 1;
				}
			}
			d[i] = max;
		}
		max = 0;
		for (i = 1;i <= n;i++)
		{
			if (d[i] > max)
			{
				max = d[i];
			}
		}
		System.out.printf("%d\n",max);
		System.in.read();
		System.in.read();
		return 0;
	}

}

