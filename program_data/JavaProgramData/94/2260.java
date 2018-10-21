package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		int i = 0;
		int[] zhengzhengshu = new int[501];
		for (i = 0;i < N;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zhengzhengshu[i] = Integer.parseInt(tempVar2);
			}
		}
		int[] jishu = new int[500];
		int j = 0;
		int p = 0;
		for (j = 0,p = 0;j < N;j++)
		{
			if (zhengzhengshu[j] % 2 == 1)
			{
				jishu[p] = zhengzhengshu[j];
				p++;
			}
		}
		int temp = 0;
		int q = 0;
		for (q = 0;q < p;q++)
		{
			for (int m = q;m < p;m++)
			{
				if (jishu[q] > jishu[m])
				{
					temp = jishu[q];
					jishu[q] = jishu[m];
					jishu[m] = temp;
				}
			}
		}
		for (int b = 0;b < p - 1;b++)
		{
			System.out.printf("%d,",jishu[b]);
		}
		int b = p - 1;
		System.out.printf("%d",jishu[b]);
		return 0;
	}



}

