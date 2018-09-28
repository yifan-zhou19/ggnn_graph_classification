package <missing>;

public class GlobalMembers
{
	public static int sushu(int n)
	{
		int i;
		int flag = 1;
		for (i = 2;i < n;i++)
		{
			if (n % i == 0)
			{
				flag = 0;
				break;
			}
		}
		return flag;
	}

	public static int Main()
	{
		int m;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= m / 2;i = i + 2)
		{
			if (sushu(i) != 0 && sushu(m - i) != 0)
			{
				System.out.printf("%d %d\n",i,m - i);
			}
		}
		return 0;
	}
}

