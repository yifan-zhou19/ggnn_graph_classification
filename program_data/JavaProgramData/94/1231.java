package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int z = 0;
		int k;
		int h = 0;
		int[] sz = new int[500];
		int[] mm = new int[500];
		int[] xx = new int[500];
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
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (sz[i] % 2 == 1)
			{
				mm[z] = sz[i];
				z++;
			}
		}
		for (k = 0;k < 10000;k++)
		{
			for (i = 0;i < z;i++)
			{
				if (k == mm[i])
				{
					xx[h] = k;
					h++;
					break;
				}
			}
		}
		for (i = 0;i < (h - 1);i++)
		{
			System.out.printf("%d,",xx[i]);
		}
		System.out.printf("%d",xx[h - 1]);
		return 0;
	}



}

