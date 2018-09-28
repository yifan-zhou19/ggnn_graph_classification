package <missing>;

public class GlobalMembers
{
	public static char[][] name = new char[101][22];
	public static char[][] yn = new char[101][3];
	public static int[][] s = new int[101][4];
	public static void Main()
	{
		int n;
		int i;
		int j;
		int[] reward = new int[101];
		int sumreward = 0;
		int f1 = new int(int, int);
		int f2 = new int(int, int);
		int f3 = int;
		int f4 = new int(int, char);
		int f5 = new int(int, char);

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1; i <= n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				name[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				s[i][1] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				s[i][2] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				yn[i][1] = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				yn[i][2] = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				s[i][3] = Integer.parseInt(tempVar7);
			}

			reward[i] = f1(s[i][1], s[i][3]) + f2(s[i][1], s[i][2]) + f3(s[i][1]) + f4(s[i][1], yn[i][2]) + f5(s[i][2], yn[i][1]);

			sumreward = sumreward + reward[i];
		}; //????

		for (i = 1; i <= n; i++)
		{
			int a = 0;
			for (j = 1; j <= i - 1; j++)
			{
				if (reward[i] < reward[j])
				{
					a = a + 1;
				}
			};
			for (j = i + 1; j <= n; j++)
			{
				if (reward[i] < reward[j])
				{
					a = a + 1;
				}
			};

			if (a == 0)
			{
				System.out.printf("%s\n%d\n%d",name[i],reward[i],sumreward);
				break;
			};
		};

	}
	public static int f1(int x, int y) //1) ?????
	{
		if (x > 80 && y >= 1)
		{
			return 8000;
		}
		else
		{
			return 0;
		}
	}
	public static int f2(int x, int y) //2) ?????
	{
		if (x > 85 && y > 80)
		{
			return 4000;
		}
		else
		{
			return 0;
		}
	}
	public static int f3(int x) //3) ?????
	{
		if (x > 90)
		{
			return 2000;
		}
		else
		{
			return 0;
		}
	}
	public static int f4(int x, char y) //4) ?????
	{
		if (x > 85 && y == 'Y')
		{
			return 1000;
		}
		else
		{
			return 0;
		}
	}
	public static int f5(int x, char y) //5) ?????
	{
		if (x > 80 && y == 'Y')
		{
			return 850;
		}
		else
		{
			return 0;
		}
	}
}

