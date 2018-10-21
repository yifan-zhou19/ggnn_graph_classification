package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int[] b = new int[100];
		int i;
		int m;
		int[] sz = new int[100];
		int k;
		int e;
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
				 a[i] = Integer.parseInt(tempVar2);
			 }
			 String tempVar3 = ConsoleInput.scanfRead(" ");
			 if (tempVar3 != null)
			 {
				 b[i] = Integer.parseInt(tempVar3);
			 }
		}
		m = 0;
		for (i = 0;i < n;i++)
		{
			if (a[i] >= 90 && a[i] <= 140 && b[i] >= 60 && b[i] <= 90)
			{
				m++;
			}
			else
			{
				m = 0;
			}
			sz[i] = m;
		}
		for (i = 1;i <= n;i++)
		{
			for (k = 0;k < n - i;k++)
			{
				if (sz[k] < sz[k + 1])
				{
					e = sz[k + 1];
					sz[k + 1] = sz[k];
					sz[k] = e;
				}
			}
		}
		System.out.printf("%d",sz[0]);
		return 0;
	}
}

