package <missing>;

public class GlobalMembers
{
	// ????.cpp : Defines the entry point for the console application.
	//

	public static int Main()
	{
		int n;
		int q = 1;
		int k;
		int[] sz = new int[20000];
		int[] jieguo = new int[20000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		jieguo[0] = sz[0];
		for (int i = 1;i <= n;i++)
		{
			k = 0;
			for (int j = 0;j < q;j++)
			{
				if (jieguo[j] == sz[i])
				{
					break;
				}
				else
				{
					k += 1;
				}
			}
			if (k == q)
			{
				jieguo[q] = sz[i];
				q += 1;
			}
		}
		for (int i = 0;i < q - 1;i++)
		{
			if (i != q - 2)
			{
				System.out.printf("%d ",jieguo[i]);
			}
			else
			{
				System.out.printf("%d",jieguo[i]);
			}
		}



			return 0;

	}


}

