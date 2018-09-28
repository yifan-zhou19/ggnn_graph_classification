package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int[] sz = new int[N];
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
			if (i < n - 1)
			{
			System.out.printf("%d ",sz[n - i - 1]);
			}
			 else if (i = n - 1)
			 {
			System.out.printf("%d",sz[n - i - 1]);
			 }
		}
		return 0;
	}

}

