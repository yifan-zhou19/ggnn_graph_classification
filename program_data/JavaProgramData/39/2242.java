package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int score1;
		int score2;
		int k;
		int i;
		int[] money = new int[100];
		int totalmoney = 0;
		int x;
		int n;
		char[][] name = new char[100][20];
		char c;
		char d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 0;i < N;i++)
		{
			money[i] = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				name[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				score1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				score2 = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				c = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				d = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				k = Integer.parseInt(tempVar7);
			}
			if (score1 > 80 && k != 0)
			{
				money[i] = money[i] + 8000;
			}
			if (score1 > 85 && score2 > 80)
			{
				money[i] = money[i] + 4000;
			}
			if (score1 > 90)
			{
				money[i] = money[i] + 2000;
			}
			if (score1 > 85 && d == 'Y')
			{
				money[i] = money[i] + 1000;
			}
			if (score2 > 80 && c == 'Y')
			{
				money[i] = money[i] + 850;
			}
		}
		x = money[0];
		n = 0;
		for (i = 0;i < N;i++)
		{
			totalmoney = totalmoney + money[i];
			if (money[i] > x)
			{
				x = money[i];
				if (i > n)
				{
					n = i;
				}

			}
		}
		System.out.printf("%s\n",name[n]);
		System.out.printf("%d\n",x);
		System.out.printf("%d\n",totalmoney);



		return 0;
	}
}

