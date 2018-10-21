package <missing>;

public class GlobalMembers
{
	public static int zhishu(int x)
	{
		int flag = 1;
		for (int i = 2;i <= x / 2;i++)
		{
			if (x % i == 0)
			{
				flag = 0;
			}
		}
		return flag;
	}
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= n / 2;i++)
		{
			if (zhishu(i) != 0 && zhishu(n - i) != 0)
			{
				System.out.printf("%d %d\n",i,n - i);
			}
		}
		return 0;
	}

}

