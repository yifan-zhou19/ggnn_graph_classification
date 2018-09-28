package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int max = 1;
		int m;
		int[] sz = new int[500];
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
			if (sz[i] > max && sz[i] % 2 != 0)
			{
				max = sz[i];
			}
		}
		for (j = 1;j <= max;j = j + 2)
		{

			if (j == max)
			{
					System.out.printf("%d",j);
			}
			else
			{
			for (m = 0;m < n;m++)
			{
				 if (sz[m] == j)
				 {
					System.out.printf("%d,",j);
				 }
			}
			}
		}

	return 0;
	}
}

