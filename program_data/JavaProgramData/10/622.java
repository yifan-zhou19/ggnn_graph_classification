package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int max = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] d = new int[100];
		int i = 0;
		int j = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				d[i] = Integer.parseInt(tempVar2);
			}
		}
		int[] w = new int[100];
		for (i = 0;i < n;i++)
		{
		w[i] = 1;
		}
		for (i = n - 2;i >= 0;i--)
		{
			for (j = i + 1;j < n;j++)
			{
				if (d[i] >= d[j] != 0 && w[i] <= w[j])
				{
					w[i] = w[j] + 1;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
		if (w[i] >= max)
		{
		max = w[i];
		}
		}
		System.out.printf("%d",max);
		System.in.read();
		System.in.read();
		return 0;
	}
}

