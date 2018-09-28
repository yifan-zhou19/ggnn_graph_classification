package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int t;
		int i = 0;
		int j = 3;
		int k = 2;
		int p = 0;
		int w = 3;
		int v = 3;
		int x = 0;
		int y = 0;
		int z = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		t = (n - 6) / 2;
		int[] num = new int[t];
		System.out.print("6=3+3\n");
		for (i = 0;i < t;i++)
		{
			num[i] = 6 + 2 * (i + 1);
		}
		int[] shu = new int[n];
		for (w = 3;w <= (n - 3);w++)
		{
			for (v = 2;v <= Math.sqrt(w);v++)
			{
				if (w % v == 0)
				{
					break;
				}
			}
			if (v > Math.sqrt(w))
			{
				shu[p] = w;
				p++;
			}
		}
		for (x = 0;x < t;x++)
		{
			y = 0;
			for (y = 0; ;y++)
			{
				z = 1;
				for (z = 1; ;z++)
				{
					if (num[x] == shu[y] + shu[z])
					{
						System.out.printf("%d=%d+%d\n",num[x],shu[y],shu[z]);
						break;
					}
					if (shu[z] > (3 + num[x]))
					{
						break;
					}
				}
				if (num[x] == shu[y] + shu[z])
				{
					break;
				}
			}
		}
		return 0;
	}

}

