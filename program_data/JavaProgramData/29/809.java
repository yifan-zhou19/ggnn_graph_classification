package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int p;
		int[] sz = new int[100];
		int[] sz1 = new int[100];
		sz[0] = 1;
		sz[1] = 2;
		float sum;
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
				sz1[i] = Integer.parseInt(tempVar2);
			}
		}
		for (p = 0;p < n;p++)
		{
			sum = 2F;
			for (i = 2;i <= sz1[p];i++)
			{
				 sz[i] = sz[i - 1] + sz[i - 2];
				 sum = (float)sum + (float)sz[i] / sz[i - 1];
			}
			System.out.printf("%.3f\n",sum);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		return 0;
	}

}

