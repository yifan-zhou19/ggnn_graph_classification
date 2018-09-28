package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int a;
		int[] jishu = new int[500];
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		k = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			if (a % 2 != 0)
			{
				jishu[k] = a;
				k++;
			}
		}
		for (i = 1;i <= k;i++)
		{
			for (a = 0;a < k - i;a++)
			{
				if (jishu[a] > jishu[a + 1])
				{
					e = jishu[a + 1];
					jishu[a + 1] = jishu[a];
					jishu[a] = e;
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			if (i == k - 1)
			{
				System.out.printf("%d",jishu[i]);
			}
			else
			{
				System.out.printf("%d,",jishu[i]);
			}
		}
		return 0;
	}

}

