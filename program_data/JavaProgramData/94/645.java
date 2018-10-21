package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k = 0;
		int i;
		int m;
		int e;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] sz = new int[n];
		int[] zz = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
			if (sz[i] % 2 == 1)
			{
				zz[k] = sz[i];
				k++;
			}
		}
		l = k;
		for (m = 1;m <= l;m++)
		{
			for (k = 0;k < l - m;k++)
			{
				if (zz[k + 1] < zz[k])
				{
					e = zz[k];
					zz[k] = zz[k + 1];
					zz[k + 1] = e;
				}
			}
		}
		for (k = 0;k < l - 1;k++)
		{
			System.out.printf("%d",zz[k]);
			System.out.print(",");
		}
		System.out.printf("%d",zz[l - 1]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(sz);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(zz);
		return 0;
	}
}

