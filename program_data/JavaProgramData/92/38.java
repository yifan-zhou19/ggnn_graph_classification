package <missing>;

public class GlobalMembers
{
	public static int[] tj = new int[1000];
	public static int[] qw = new int[1000];
	public static int n;
	public static int money = 0;
	public static void games(int n)
	{
	if (n > 1)
	{
		int i;
		int j;
		int mid;
		if (tj[n - 1] < qw[n - 1])
		{
			tj[n - 1] = 0;
			qw[0] = 0;
			money = money - 200;
			for (i = 0;i < n - 1;i++)
			{
			qw[i] = qw[i + 1];
			}
		}
		else if (tj[n - 1] > qw[n - 1])
		{
			tj[n - 1] = 0;
			qw[n - 1] = 0;
			money = money + 200;
		}
		else if (tj[0] > qw[0])
		{
			tj[0] = 0;
			qw[0] = 0;
			money = money + 200;
			for (i = 0;i < n - 1;i++)
			{
				tj[i] = tj[i + 1];
				qw[i] = qw[i + 1];
			}
		}
		else if (tj[0] <= qw[0])
		{
			if (tj[n - 1] < qw[0])
			{
				money = money - 200;
			}
			tj[n - 1] = 0;
			qw[0] = 0;
			for (i = 0;i < n - 1;i++)
			{
			qw[i] = qw[i + 1];
			}
		}
		games(n - 1);
	}
		if (n == 1)
		{
			if (tj[0] > qw[0])
			{
				money = money + 200;
			}
			if (tj[0] < qw[0])
			{
				money = money - 200;
			}
		}
	}
	public static void Main()
	{
		int i;
		int j;
		int mid;
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			if (n == 0)
			{
				break;
			}
			for (i = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					tj[i] = Integer.parseInt(tempVar2);
				}
			}
			for (i = 0;i < n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					qw[i] = Integer.parseInt(tempVar3);
				}
			}
			for (i = 0;i < n;i++)
			{
			for (j = i;j < n;j++)
			{
			if (tj[j] > tj[i])
			{
				mid = tj[j];
				tj[j] = tj[i];
				tj[i] = mid;
			}
			if (qw[j] > qw[i])
			{
				mid = qw[j];
				qw[j] = qw[i];
				qw[i] = mid;
			}
			}
			}
			games(n);
			System.out.printf("%d\n",money);
			money = 0;
		}
	}

}

