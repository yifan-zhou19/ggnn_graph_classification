package <missing>;

public class GlobalMembers
{
	public static int Main()

	{
		int[] sz = new int[100];
		int i;
		int N;
		int max1;
		int max2;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 0;i < N;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		max1 = sz[0] > sz[1] != 0?sz[0]:sz[1];
		max2 = sz[0] > sz[1] != 0?sz[1]:sz[0];
		for (i = 2;i < N;i++)
		{
			if (sz[i] > max1)
			{
				max2 = max1;
				max1 = sz[i];
			}
			else if (sz[i] > max2)
			{
				max2 = sz[i];
			}
		}
		System.out.printf("%d\n",max1);
		System.out.printf("%d\n",max2);
	return 0;
	}

}

