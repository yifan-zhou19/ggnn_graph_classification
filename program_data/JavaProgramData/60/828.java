package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int j;
		int k;
		int m = 0;
		int h = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] sushu = new int[n];
		for (i = 3;i <= n;i++)
		{
			k = 0;
			for (j = 2;j <= i - 1;j++)
			{
				if (i % j == 0)
				{
					k = 1;
					break;
				}
			}
			if (k == 1)
			{
				continue;
			}
			sushu[m] = i;
			m++;
		}
		for (i = 0;i < m - 1;i++)
		{
			if (sushu[i + 1] - sushu[i] == 2)
			{
				System.out.printf("%d %d\n",sushu[i],sushu[i + 1]);
				h = 1;
			}
		}
		if (h == 0)
		{
	System.out.print("empty\n");
		}

		return 0;
	}
}

