package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[100];
		int n;
		int e;
		int a;
		int b;
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
					(sz[i]) = Integer.parseInt(tempVar2);
				}
		}
		b = n / 2;
		for (int k = 0;k < b;k++)
		{
				a = n - k - 1;
				e = sz[a];
				sz[a] = sz[k];
				sz[k] = e;
		}

		for (int i = 0;i < n;i++)
		{
				System.out.printf("%d",sz[i]);
				if (i < n - 1)
				{
					System.out.print(" ");
				}
		}
		return 0;


	}

}

