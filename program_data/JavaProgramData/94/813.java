package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int count;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] sz = new int[500];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		j = 0;
		count = 0;
		int[] jishu = new int[500];
		for (i = 0;i < n;i++)
		{
			if (sz[i] % 2 == 1)
			{
				jishu[j] = sz[i];
				j++;
				count++;
			}
		}
		for (i = 1;i <= count;i++)
		{
			for (j = 0;j < count - i;j++)
			{
				if (jishu[j] > jishu[j + 1])
				{
					int e;
					e = jishu[j + 1];
					jishu[j + 1] = jishu[j];
					jishu[j] = e;
				}
			}
		}
		for (j = 0;j < count;j++)
		{
			if (j == 0)
			{
			System.out.printf("%d",jishu[j]);
			}
			else
			{
				System.out.printf(",%d",jishu[j]);
			}
		}
		return 0;
	}
}

