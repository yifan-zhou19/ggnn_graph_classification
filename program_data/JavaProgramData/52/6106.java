package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[] zs = new int[120];
		int i;
		int ex;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(zs[i]) = Integer.parseInt(tempVar3);
			}
		}
		int z = (1 + n) / 2;
		for (i = 0;i < z;i++)
		{
			ex = zs[n - 1 - i];
			zs[n - 1 - i] = zs[i];
			zs[i] = ex;
		}
		int z1 = (1 + m) / 2;
		for (i = 0;i < z1;i++)
		{
			ex = zs[m - 1 - i];
			zs[m - 1 - i] = zs[i];
			zs[i] = ex;
		}
		int z2 = m + (1 + n - m) / 2;
		for (i = m;i < z2;i++)
		{
			ex = zs[n - 1 - i + m];
			zs[n - 1 - i + m] = zs[i];
			zs[i] = ex;
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%d ", zs[i]);
		}
		System.out.printf("%d\n", zs[n - 1]);
		return 0;
	}
}

