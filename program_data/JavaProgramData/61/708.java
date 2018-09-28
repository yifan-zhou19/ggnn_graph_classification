package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[] sz = new int[100];
		int m;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		int[] shuru = new int[100];
		for (int i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(shuru[i]) = Integer.parseInt(tempVar2);
			}
		}
		for (int h = 0;h < m;h++)
		{

		for (int j = 0;j < shuru[h];j++)
		{
			if (j <= 1)
			{
				sz[j] = 1;
			}
			if (j >= 2)
			{
				sz[j] = sz[j - 1] + sz[j - 2];
			}
			sum = sz[j];
		}
		System.out.printf("%d\n",sum);

		}

	}
}

