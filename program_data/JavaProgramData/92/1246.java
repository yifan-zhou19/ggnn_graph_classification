package <missing>;

public class GlobalMembers
{
	public static int[] tj = new int[1001];
	public static int[] qw = new int[1001];
	public static void Main()
	{
		int game = new int(int n,int money);
		int n;
		int i;
		int j;
		int k;
		int temp;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n != 0)
		{
			for (i = 1;i <= n;i++)
			{
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 tj[i] = Integer.parseInt(tempVar2);
		 }
			}
		for (i = 1;i <= n;i++)
		{
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 qw[i] = Integer.parseInt(tempVar3);
		 }
		}
		for (i = 1;i <= n;i++)
		{
		for (j = i + 1;j <= n;j++)
		{
			if (tj[i] < tj[j])
			{
				temp = tj[i];
				tj[i] = tj[j];
				tj[j] = temp;
			}
			if (qw[i] < qw[j])
			{
				temp = qw[i];
				qw[i] = qw[j];
				qw[j] = temp;
			}
		}
		}
		k = game(n, 0);
		System.out.printf("%d\n",k);
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			n = Integer.parseInt(tempVar4);
		}
		}
	}
	public static int game(int n, int money)
	{
		int i;
		if (n == 0)
		{
			return money;
		}
		else
		{
			if (tj[n] > qw[n])
			{
				money = money + 200;
			}
			else if (tj[n] < qw[n])
			{
				money = money - 200;
			for (i = 1;i < n;i++)
			{
				qw[i] = qw[i + 1];
			}
			}
			else
			{
				if (n != 1)
				{
				if (tj[1] < qw[1])
				{
					money = money - 200;
					for (i = 1;i < n;i++)
					{
						qw[i] = qw[i + 1];
					}
				}
			   else if (tj[1] == qw[1] && tj[1] > tj[n])
			   {
				   money = money - 200;
				   for (i = 1;i < n;i++)
				   {
					   qw[i] = qw[i + 1];
				   }
			   }
			   else if (tj[1] > qw[1])
			   {
				   money = money + 200;
				   for (i = 1;i < n;i++)
				   {
					   tj[i] = tj[i + 1];
					   qw[i] = qw[i + 1];
				   }
			   }
				}
			}
			n--;
	return game(n, money);
		}
	}
}

