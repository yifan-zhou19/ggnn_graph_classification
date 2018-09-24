package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] mark = new int[305];
		int[] str = new int[305];
		int i;
		int j;
		int k;
		int n;
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
				str + i = tempVar2;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (mark[i] == 0)
			{
				k = i;
				for (j = i + 1;j < n;j++)
				{
					if (str[j] == str[i])
					{
						mark[j] = 1;
					}
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			if (mark[i] == 0)
			{
				System.out.printf("%d,",str[i]);
			}
		}
		System.out.printf("%d\n",str[k]);
		return 0;
	}
}

