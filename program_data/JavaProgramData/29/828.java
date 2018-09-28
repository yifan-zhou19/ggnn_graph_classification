package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int k;
		int[] dcl = new int[50];
		int[] sz = new int[100];
		sz[0] = 1;
		sz[1] = 2;
		for (i = 2;i < 100;i++)
		{
			sz[i] = sz[i - 1] + sz[i - 2];
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(dcl[i]) = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < m;i++)
		{
			double num = 0;
			for (k = 1;k <= dcl[i];k++)
			{
				num += sz[k] * 1.0 / sz[k - 1];
			}
			System.out.printf("%.3lf\n",num);
		}
		return 0;
	}

}

