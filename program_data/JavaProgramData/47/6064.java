package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int[] sz = new int[100];
		for (i = 0;i < n;i++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   sz[i] = Integer.parseInt(tempVar2);
		   }
		}
		int k = 0;
		int j = n - 1;
		int e;
		while ((k <= n / 2) && (j >= n / 2))
		{
			 e = sz[k];
			 sz[k] = sz[j];
			 sz[j] = e;
			 k++;
			 j--;
		}
		for (i = 0;i < n - 1;i++)
		{
		   System.out.printf("%d ",sz[i]);
		}
		System.out.printf("%d",sz[n - 1]);
		int a;
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a = Integer.parseInt(tempVar3);
		}
		return 0;
	}

}

