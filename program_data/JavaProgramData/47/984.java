package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[100];
		int n;
		int i;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i = i + 1)
		{
						   String tempVar2 = ConsoleInput.scanfRead();
						   if (tempVar2 != null)
						   {
							   sz[i] = Integer.parseInt(tempVar2);
						   }
		}
		for (i = 0;i < n / 2;i = i + 1)
		{
						   e = sz[i];
						   sz[i] = sz[n - 1 - i];
						   sz[n - 1 - i] = e;
		}
		for (i = 0;i < n;i = i + 1)
		{
						   if (i < n - 1)
						   {
							   System.out.printf("%d ",sz[i]);
						   }
						   else
						   {
							   System.out.printf("%d",sz[i]);
						   }
		}

		return 0;
	}
}

