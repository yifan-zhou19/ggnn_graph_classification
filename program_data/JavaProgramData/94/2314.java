package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int m;
		int n;
		int i;
		int j;
		int tran;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		int[] zhengzhengshu = new int[N];
		int[] jishu = new int[N];
		for (i = 0;i < N;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zhengzhengshu[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0,j = 1;i < N;i++)
		{
			if (zhengzhengshu[i] % 2 == 1)
			{
				jishu[j] = zhengzhengshu[i];
				j = j + 1;
			}
		}
		for (m = 1;m < j;m++)
		{
			for (n = m;n < j;n++)
			{
				if (jishu[m] > jishu[n])
				{
					tran = jishu[m];
					jishu[m] = jishu[n];
					jishu[n] = tran;
				}
			}
		}
		for (m = 1;m < j;m++)
		{
			System.out.printf("%d",jishu[m]);
			if (m != j - 1)
			{
				System.out.print(",");
			}

		}
		return 0;
	}




}

