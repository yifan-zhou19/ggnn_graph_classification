package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] data;
		data = new int[n * n];
		int i;
		int j;
		int k;
		int p = 0;
		int q = 0;
		int t = 0;
		int s = 0;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					data[i * n + j] = Integer.parseInt(tempVar2);
				}
			}
			for (k = 0;k < n;k++)
			{
				if (data[i * n + k] == 0)
				{
					p = i + 1;
					q = k + 1;
				}
			}
		}
		int u;
		int v;
		for (u = n - 1;u >= 0;u--)
		{
			for (v = n - 1;v >= 0;v--)
			{
				if (data[u * n + v] == 0)
				{
					t = u + 1;
					s = v + 1;
				}
			}
		}
		int x;
		int y;
		int z;
		y = q - s - 1;
		x = p - t - 1;
		z = x * y;
		System.out.printf("%d\n",z);
		return 0;
	}

}

