package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] sz = new int[n];
		int[] zs = new int[500];
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		int k = 0;
		int f;
		for (int i = 0;i < n;i++)
		{
			e = sz[i] % 2;
			if (e != 0)
			{
				f = sz[i];
				sz[i] = zs[k];
				zs[k] = f;
				k++;
			}
		}
		int b;
		for (int a = 1;a <= k;a++)
		{
			for (int c = 0;c < k - a;c++)
			{
				if (zs[c] > zs[c + 1])
				{
					b = zs[c + 1];
					zs[c + 1] = zs[c];
					zs[c] = b;
				}
			}
		}
		for (int c = 0;c < k - 1;c++)
		{
			System.out.printf("%d,",zs[c]);
		}
		 System.out.printf("%d",zs[k - 1]);
		return 0;
	}

}

