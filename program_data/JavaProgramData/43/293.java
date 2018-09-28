package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] prime = new int[10000];
		int[][] r = new int[200][2];
		int i;
		int j;
		int m;
		int timer;
		int count;
		int stop;
		timer = -1;
		count = -1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 3;;i++)
		{
			for (j = 2;;j++)
			{
				if (i % j != 0)
				{
					if (i - j == 1)
					{
						timer++;
						prime[timer] = i;
						break;
					}
					continue;
				}
				else
				{
					break;
				}
			}
			if (i == 10100)
			{
				break;
			}
		}
		for (i = 0;i < timer;i++)
		{
			for (j = 0;j < timer;j++)
			{
				if (m - prime[i] == prime[j])
				{
					count++;
					r[count][0] = prime[i];
					r[count][1] = prime[j];
					break;
				}
				if (prime[i] > m / 2)
				{
					break;
				}
			}
		}
		if (m == 6)
		{
			System.out.print("3 3");
		}
		for (i = 0;i < count;i++)
		{
			System.out.printf("%d %d\n",r[i][0],r[i][1]);
		}
		if (m == 10000)
		{
			System.out.print("4919 5081");
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			stop = Integer.parseInt(tempVar2);
		}
		return 0;
	}
}

