package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int flag = 0;
		int[] sz = new int[1000];
		int e;
		int i;
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		for (int a = 1 ; a <= n ; a++)
		{
			for (int i = 0; i < n - a; i++)
			{
				if (sz[i] > sz[i + 1])
				{
					e = sz[i + 1];
					sz[i + 1] = sz[i];
					sz[i] = e;
				}
			}
		}

		for (int b = 0;b <= n;b++)
		{
			if (sz[b] % 2 != 0)
			{

				if (flag == 1)
				{
					System.out.printf(",%d",sz[b]);
				}
				else
				{
					System.out.printf("%d",sz[b]);
					flag = 1;
				}
			}
		}
		return 0;
	}
}

