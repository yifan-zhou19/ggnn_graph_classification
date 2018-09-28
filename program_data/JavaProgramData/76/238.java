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
		int[][] sz = new int[50000][2];
		int i = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i][1] = Integer.parseInt(tempVar3);
			}
		}
		int min = 10001;
		int max = 0;
		for (i = 0;i < n;i++)
		{
			if (min > sz[i][0])
			{
				min = sz[i][0];
			}
			if (max < sz[i][1])
			{
				max = sz[i][1];
			}
		}

		int j;
		int k = 0;
		int sum = 0;
		for (j = min;j <= max;j++)
		{
			sum = k * (sum + k);
			if (sum != 0)
			{
				break;
			}

			for (i = 0;i < n;i++)
			{

				if (j >= sz[i][0] != 0 && j < sz[i][1])
				{
					k = 0;
					break;
				}
				k = 1;
			}
		}
		if (sum == 0)
		{
			System.out.printf("%d %d",min,max);
		}
		else
		{
			System.out.print("no");
		}
		return 0;
	}
}

