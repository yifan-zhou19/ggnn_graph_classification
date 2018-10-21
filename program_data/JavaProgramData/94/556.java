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
		int i;
		int j;
		int[] shuzu = new int[500];
		int[] jishu = new int[500];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				shuzu[i] = Integer.parseInt(tempVar2);
			}
		}
		int e;
		for (i = 1;i <= n;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (shuzu[j] > shuzu[j + 1])
				{
					e = shuzu[j + 1];
					shuzu[j + 1] = shuzu[j];
					shuzu[j] = e;
				}
			}
		}
		for (j = 0;j < n;j++)
		{
			for (i = 0;i < n;i++)
			{
				if (j == 0 && shuzu[i] % 2 != 0)
				{
					jishu[j] = shuzu[i];
					break;
				}
				else if (shuzu[i] > jishu[j - 1] && shuzu[i] % 2 != 0)
				{
					jishu[j] = shuzu[i];
					break;
				}
			}
			if (i == n)
			{
				break;
			}
		}

		for (i = 0;i < j;i++)
		{
			if (i == 0)
			{
				System.out.printf("%d",jishu[i]);
			}
			else
			{
				System.out.printf(",%d",jishu[i]);
			}
		}
	return 0;
	}
}

