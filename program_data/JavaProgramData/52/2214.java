package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz1 = new int[1000];
		int[] sz2 = new int[1000];
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz1[i] = Integer.parseInt(tempVar3);
			}
		}
		for (int j = 0;j < n;j++)
		{
			if (j < m)
			{
				sz2[j] = sz1[n - m + j];
			}
			else if (j >= m)
			{
				sz2[j] = sz1[j - m];
			}
		}
		for (int k = 0;k < n - 1;k++)
		{
			System.out.printf("%d ",sz2[k]);
		}
	System.out.printf("%d",sz2[n - 1]);
		return 0;
	}
}

