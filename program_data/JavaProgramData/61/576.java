package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int[] sz = new int[20];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int hang = 1;hang <= n;hang++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			sz[0] = 1;
			sz[1] = 1;
			for (int i = 2;i < a;i++)
			{
				sz[i] = sz[i - 1] + sz[i - 2];
			}
			System.out.printf("%d\n",sz[a - 1]);
		}

		return 0;
	}

}

