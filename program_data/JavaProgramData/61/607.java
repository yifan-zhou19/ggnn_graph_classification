package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[] sz = new int[100];
		int i;
		int n;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		sz[0] = 1;
		sz[1] = 1;
		for (i = 2;i < 100;i++)
		{
			sz[i] = sz[i - 1] + sz[i - 2];
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			System.out.printf("%d\n",sz[a - 1]);
		}
	}

}

