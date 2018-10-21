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
		int[] sz = new int[99];
		int[] zs = new int[99];
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(sz[i]) = Integer.parseInt(tempVar2);
			}
			zs[n - i - 1] = sz[i];
		}
		for (int j = 0;j < (n - 1);j++)
		{
			System.out.printf("%d ",(zs[j]));
		}
		System.out.printf("%d",(zs[n - 1]));
		return 0;
	}

}

