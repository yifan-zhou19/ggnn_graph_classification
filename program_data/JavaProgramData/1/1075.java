package <missing>;

public class GlobalMembers
{
	public static int a;
	public static int res;
	public static int sum;
	public static void dfs(int cnt)
	{
		if (cnt * sum == a)
		{
			res++;
			return;
		}
		if (cnt * sum < a)
		{
			sum *= cnt;
			int j = a / sum;
			for (int i = cnt;i <= j;i++)
			{
				dfs(i);
			}
			sum /= cnt;
			return;
		}
	}
	public static int Main()
	{
		int nCases;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			nCases = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < nCases;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			res = 0;
			sum = 1;
			for (int i = 2;i <= a;i++)
			{
				dfs(i);
			}
			System.out.printf("%d\n",res);
		}
		return 0;
	}
}

