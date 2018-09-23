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
		int[] sz = new int[LEN];
		int sum = 0;
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
			sum += sz[i];
		}
		double junzhi;
		junzhi = 1.0 * sum / n;
		int min = sz[0];
		int max = sz[0];
		for (int r = 0;r < n;r++)
		{
			if (sz[r] > max)
			{
				max = sz[r];
			}
			if (sz[r] < min)
			{
				min = sz[r];
			}
		}
		if (1.0 * (max + min) / 2 == junzhi)
		{
			System.out.printf("%d,%d",min,max);
		}
		else if (junzhi - min > max - junzhi)
		{
			System.out.printf("%d",min);
		}
		else
		{
			System.out.printf("%d",max);
		}
		return 0;
	}
}

