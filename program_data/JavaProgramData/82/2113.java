package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k = 0;
		int j = 0;
		int MAX = 0;
		int[] ss = new int[100];
		int[] sz = new int[100];
		int[] zc = new int[100];
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
				(ss[i]) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				(sz[i]) = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if ((ss[i] >= 90) && (ss[i] <= 140) && (sz[i] >= 60) && (sz[i] <= 90))
			{
				k++;
			}
			else
			{
				zc[j] = k;
				j++;
				k = 0;
			}
		}
		zc[j] = k;
		for (i = 0;i < j + 1;i++)
		{
			if (MAX < zc[i])
			{
				MAX = zc[i];
			}
		}
		System.out.printf("%d",MAX);
		return 0;
	}


}

