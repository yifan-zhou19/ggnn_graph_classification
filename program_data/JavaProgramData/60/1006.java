package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[10000];
		int i;
		int n;
		int num;
		int count = 0;
		int order = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		sz[0] = 2;
		for (num = 3;num < n + 1;num = num + 2)
		{
			for (i = 2;i < num;i++)
			{
				if (num % i == 0)
				{
					break;
				}
				else
				{
					count++;
				}
			}
			if (count == num - 2)
			{
				sz[order] = num;
				order++;
			}
			count = 0;
		}
		int flag = 0;
		for (i = 0;i < order - 1;i++)
		{
			if (sz[i] + 2 == sz[i + 1])
			{
				System.out.printf("%d %d\n",sz[i],sz[i + 1]);
				flag = 1;
			}
		}
		if (flag == 0)
		{
			System.out.print("empty\n");
		}
		return 0;
	}

}

