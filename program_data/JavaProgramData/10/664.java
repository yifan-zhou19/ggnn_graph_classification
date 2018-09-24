package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] h = new int[25];
		int n;
		int i;
		int j;
		int t;
		int[] d = new int[25];
		int max = 0;
		int in;
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
		for (i = n - 2;i >= 0;i--)
		{
			for (j = i + 1;j < n;j++)
			{
				if (h[j] <= h[i] != 0 && d[i] < d[j] + 1)
				{
					d[i] = d[j] + 1;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (d[i] > max)
			{
				max = d[i];
			}
		}
		System.out.printf("%d",max + 1);
	}
}

