package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] zs = new int[N];
		int i;
		int n;
		int[] js = new int[M];
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0,j = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zs[i] = Integer.parseInt(tempVar2);
			}
			if (zs[i] % 2 == 1)
			{
				js[j] = zs[i];
				j++;
			}
			else
			{
				continue;
			}
		}
		for (k = 1;k < j;k++)
		{
			int t = js[k];
			for (i = k - 1;i >= 0;i--)
			{
				if (t < js[i])
				{
					js[i + 1] = js[i];
					js[i] = t;
				}
				else
				{
					js[i + 1] = t;
					break;
				}
			}
		}
		for (k = 0;k < j - 1;k++)
		{
			System.out.printf("%d,",js[k]);
		}
		System.out.printf("%d",js[j - 1]);
		return 0;
	}
}

